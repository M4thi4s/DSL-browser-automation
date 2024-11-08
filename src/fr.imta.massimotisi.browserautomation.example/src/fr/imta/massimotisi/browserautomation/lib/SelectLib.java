package fr.imta.massimotisi.browserautomation.lib;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SelectLib {

    private WebDriver driver;
    private WebDriverWait wait;

    public SelectLib(WebDriver driver, Duration timeout) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, timeout);
    }

    // [SELECT] Get parent of an element
    public SelectInfo getParent(WebElement element) {
        try {
            return new SelectInfo (
                    (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].parentNode;", element)
            );
        } catch (Exception e) {
            System.out.println("Failed to fetch parent of the element: " + e.getMessage());
            return null;
        }
    }

    // Helper method to wrap WebElement into SelectInfo
    private List<SelectInfo> wrapElement(List<WebElement> elements) {
        var els = new java.util.ArrayList<>(elements.stream().map(SelectInfo::new).toList());

        // Print in navigator console all element
        els.removeIf(e ->
                e.element.getTagName().equals("a") &&
                e.element.getText().isEmpty() &&
                e.element.getAttribute("title").isEmpty()
        );
        return els;
    }

    // Generic selectElement method using SelectFilterProperty
    public SelectInfo selectElement(SelectFilterProperty filterProperty) {
        if(filterProperty.nthChild != null) {
            // Label is a special case where we need to find the associated input element, selectElement will fetch the label element at NTH position
            if(filterProperty.filterBy == FilterBy.LABEL) {
                return selectElements(filterProperty).get(0);
            } else {
                return selectElements(filterProperty).get(filterProperty.nthChild - 1);
            }
        } else {
            return selectElements(filterProperty).get(0);
        }
    }

    public List<SelectInfo> selectElements(SelectFilterProperty filterProperty) {
        try {
            String xpath = buildXPath(filterProperty);

            List<WebElement> elements;
            if (filterProperty.parent != null) {
                elements = filterProperty.parent.findElements(By.xpath(xpath));
            } else {
                elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
            }

            return wrapElement(elements);
        } catch (TimeoutException | NoSuchElementException | StaleElementReferenceException e) {
            System.out.println("Element not found with the provided filter properties: " + e.getMessage());
            return null;
        }
    }


    // Helper method to build XPath based on SelectFilterProperty
    private String buildXPath(SelectFilterProperty filterProperty) {
        StringBuilder xpath = new StringBuilder();

        // Determine the element type
        String elementTag; // default to any element
        switch (filterProperty.elementType) {
            case LINK:
                elementTag = "a";
                break;
            case CHECKBOX:
                elementTag = "input[@type='checkbox']";
                break;
            case INPUT:
                elementTag = "input";
                break;
            case ANY:
                elementTag = "*";
                break;
            case SELECT:
                elementTag = "select";
                break;
            default:
                elementTag = "*";
                break;

        }

        xpath.append(".//").append(elementTag);

        // Add filtering criteria
        if (filterProperty.filterValue != null && !filterProperty.filterValue.isEmpty()) {
            switch (filterProperty.filterBy) {
                case TEXT:
                    xpath.append("[normalize-space(text())='").append(filterProperty.filterValue).append("']");
                    /*
                    xpath.append("[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '")
                         .append(filterProperty.filterValue.toLowerCase())
                         .append("')]");*/
                break;
                case LABEL:
                    if (filterProperty.elementType == FilterElementType.CHECKBOX || filterProperty.elementType == FilterElementType.INPUT || filterProperty.elementType == FilterElementType.SELECT) {
                        // Special handling for labels associated with inputs
                        String labelXpath = ".//label[normalize-space(text())='" + filterProperty.filterValue + "']";

                        WebElement labelElement;
                        try {
                            if (filterProperty.parent != null) {
                                labelElement = filterProperty.parent.findElement(By.xpath(labelXpath));
                            } else {
                                labelElement = (wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By.xpath(labelXpath)))).get(
                                        filterProperty.nthChild != null ? filterProperty.nthChild - 1 : 0
                                ));
                            }

                            ActionLib actionLib = new ActionLib(driver, Duration.ofSeconds(10));
                            actionLib.highlightElement(new SelectInfo(labelElement));

                            String forAttribute = labelElement.getAttribute("for");
                            xpath.append("[@id='").append(forAttribute).append("']");
                        } catch (Exception e) {
                            System.out.println("Label with text '" + filterProperty.filterValue + "' not found.");
                        }
                    } else {
                        xpath.append("[@label='").append(filterProperty.filterValue).append("']");
                    }
                    break;
                case VALUE:
                    xpath.append("[@value='").append(filterProperty.filterValue).append("']");
                    break;
                case ALT:
                    xpath.append("[@alt='").append(filterProperty.filterValue).append("']");
                    break;
                case LINK:
                    xpath.append("[contains(@href, '").append(filterProperty.filterValue).append("')]");
                    break;
                default:
                    break;
            }
        }
        return xpath.toString();
    }

}