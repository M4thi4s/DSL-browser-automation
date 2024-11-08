package fr.imta.massimotisi.browserautomation.example;

import fr.imta.massimotisi.browserautomation.lib.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class test5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Duration timeout = Duration.ofSeconds(10);
        SelectLib selectLib = new SelectLib(driver, timeout);
        ActionLib actionLib = new ActionLib(driver, timeout);
        AssertLib assertLib = new AssertLib();
        
        actionLib.goToUrl("http://www.imt-atlantique.fr/fr/formation/trouver-ma-formation");
        var select_checkbox = new SelectFilterProperty();
        select_checkbox.elementType = FilterElementType.CHECKBOX;
        
        var checkbox = selectLib.selectElements(select_checkbox);
        actionLib.checkCheckbox(checkbox, false);
        var select_checkbox1 = new SelectFilterProperty();
        select_checkbox1.filterValue = "Anglais";
        select_checkbox1.filterBy = FilterBy.LABEL;
        select_checkbox1.elementType = FilterElementType.CHECKBOX;
        select_checkbox1.nthChild = 1;
        
        var checkbox1 = selectLib.selectElement(select_checkbox1);
        var select_checkbox2 = new SelectFilterProperty();
        select_checkbox2.filterValue = "A domicile";
        select_checkbox2.filterBy = FilterBy.LABEL;
        select_checkbox2.elementType = FilterElementType.CHECKBOX;
        select_checkbox2.nthChild = 1;
        
        var checkbox2 = selectLib.selectElement(select_checkbox2);
        var select_checkbox3 = new SelectFilterProperty();
        select_checkbox3.filterValue = "Temps plein";
        select_checkbox3.filterBy = FilterBy.LABEL;
        select_checkbox3.elementType = FilterElementType.CHECKBOX;
        select_checkbox3.nthChild = 1;
        
        var checkbox3 = selectLib.selectElement(select_checkbox3);
        actionLib.checkCheckbox(checkbox1, true);
        actionLib.checkCheckbox(checkbox2, true);
        actionLib.checkCheckbox(checkbox3, true);
        var select_btn = new SelectFilterProperty();
        select_btn.filterValue = "Appliquer les critères";
        select_btn.filterBy = FilterBy.VALUE;
        select_btn.nthChild = 1;
        
        var btn = selectLib.selectElement(select_btn);
        actionLib.clickElement(btn);
        var select_result = new SelectFilterProperty();
        select_result.filterBy = FilterBy.TEXT;
        select_result.filterValue = "No found course matching your criteria.";
        select_result.nthChild = 1;
        
        var result = selectLib.selectElement(select_result);
        assertLib.assertElementExists(result.element, "$result");
        
        driver.quit();
    }
}
