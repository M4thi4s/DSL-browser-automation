package fr.imta.massimotisi.browserautomation.lib;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ActionLib {

    private WebDriver driver;
    private WebDriverWait wait;

    public ActionLib(WebDriver driver, Duration timeout) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, timeout);
    }

    // [GOTO] Navigate to a specified URL
    public void goToUrl(String url) {
        driver.get(url);
        waitForPageToLoad();
    }

    // Wait for the page to fully load
    public void waitForPageToLoad() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                webDriver -> ((JavascriptExecutor) webDriver)
                        .executeScript("return document.readyState").equals("complete"));
    }

    // [ACTION] Click on an element
    public void clickElement(SelectInfo select) {
        if (select.element != null) {
            try {
                Thread.sleep(1000);
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", select.element);
            } catch (Exception e) {
                System.out.println("Failed to click element: " + e.getMessage());
            }
        } else {
            System.out.println("Element is null, cannot click.");
        }
    }

    // [ACTION] Set text of an input field
    public void setText(SelectInfo select, String text) {
        if (select != null) {
            try {
                select.element.clear();
                select.element.sendKeys(text);
            } catch (Exception e) {
                System.out.println("Failed to set text: " + e.getMessage());
            }
        } else {
            System.out.println("Element is null, cannot set text.");
        }
    }

    // [ACTION] Check or uncheck a checkbox
    public void checkCheckbox(SelectInfo checkbox, boolean check) {
        if (checkbox != null && checkbox.element.isDisplayed()) {
            boolean isSelected = checkbox.element.isSelected();
            if ((check && !isSelected) || (!check && isSelected)) {
                clickElement(checkbox);
            }
        } else {
            System.out.println("Checkbox is null or not displayed, cannot change state.");
        }
    }

    public void checkCheckbox(List<SelectInfo> checkboxes, boolean check) {
        if (checkboxes != null) {
            for (SelectInfo checkbox : checkboxes) {
                checkCheckbox(checkbox, check);
            }
        } else {
            System.out.println("No checkboxes found.");
        }
    }

    public void highlightElement(SelectInfo select) {
        if (select != null) {
            try {
                ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", select.element);
                ((JavascriptExecutor) driver).executeScript("arguments[0].style.color='red'", select.element);
            } catch (Exception e) {
                System.out.println("Failed to highlight element: " + e.getMessage());
            }
        } else {
            System.out.println("Element is null, cannot highlight.");
        }
    }

    // [ACTION] Select an option from a dropdown by visible text
    public void selectOption(SelectInfo dropdown, String visibleText) {
        if (dropdown != null) {
            try {
                Select select = new Select(dropdown.element);
                ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block'", dropdown.element);
                select.selectByVisibleText(visibleText);
            } catch (Exception e) {
                System.out.println("Failed to select option '" + visibleText + "': " + e.getMessage());
            }
        } else {
            System.out.println("Dropdown is null, cannot select option.");
        }
    }
}