package fr.imta.massimotisi.browserautomation.example;

import fr.imta.massimotisi.browserautomation.lib.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class test7 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Duration timeout = Duration.ofSeconds(10);
        SelectLib selectLib = new SelectLib(driver, timeout);
        ActionLib actionLib = new ActionLib(driver, timeout);
        AssertLib assertLib = new AssertLib();
        
        actionLib.goToUrl("http://www.imt-atlantique.fr/fr");
        var select_firstNewsLink = new SelectFilterProperty();
        select_firstNewsLink.filterBy = FilterBy.TEXT;
        select_firstNewsLink.filterValue = "Actualités";
        select_firstNewsLink.nthChild = 1;
        var select_firstNewsLink_parent = selectLib.getParent(selectLib.selectElement(select_firstNewsLink).element);
        
        select_firstNewsLink = new SelectFilterProperty();
        
        select_firstNewsLink.parent = select_firstNewsLink_parent.element;
        
        select_firstNewsLink.elementType = FilterElementType.LINK;
        select_firstNewsLink.nthChild = 1;
        
        var firstNewsLink = selectLib.selectElement(select_firstNewsLink);
        actionLib.clickElement(firstNewsLink);
        var select_result = new SelectFilterProperty();
        select_result.filterBy = FilterBy.TEXT;
        select_result.filterValue = firstNewsLink.CONTENT;
        select_result.nthChild = 1;
        
        var result = selectLib.selectElement(select_result);
        assertLib.assertElementExists(result.element, "$result");
        
        driver.quit();
    }
}
