package fr.imta.massimotisi.browserautomation.example;

import fr.imta.massimotisi.browserautomation.lib.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
/*
public class Test1 {
    public static void main(String[] args) {
        /*
        [TASK] "Test 1"
            [GOTO] http://www.imt-atlantique.fr/fr
            [SELECT] $lien1
                [CONTENT] "Toutes les actualités"
                [TYPE] $LINK
                [NTH-CHILD] 1
            [TEST] $lien1
        

        // [TASK] "Test 1"
        System.out.println("Test 1");

        WebDriver driver = new ChromeDriver();
        Duration timeout = Duration.ofSeconds(10);
        SelectLib selectLib = new SelectLib(driver, timeout);
        ActionLib actionLib = new ActionLib(driver, timeout);
        AssertLib assertLib = new AssertLib();

        // [GOTO] http://www.imt-atlantique.fr/fr
        actionLib.goToUrl("http://www.imt-atlantique.fr/fr");

        // [SELECT] $lien1
        //      [CONTENT] "Toutes les actualités"
        //      [TYPE] $LINK
        //		[NTH-CHILD] 1
        SelectFilterProperty select_lien1 = new SelectFilterProperty();
        select_lien1.filterValue = "Toutes les actualités";
        select_lien1.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.TEXT;
        select_lien1.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.LINK;
        select_lien1.nthChild = 1;

        SelectInfo lien1 = selectLib.selectElement(select_lien1);

        // [TEST] $lien1
        assertLib.assertElementExists(lien1.element, "$lien1");

        driver.quit();
    }
}*/

public class Test1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Duration timeout = Duration.ofSeconds(10);
        SelectLib selectLib = new SelectLib(driver, timeout);
        ActionLib actionLib = new ActionLib(driver, timeout);
        AssertLib assertLib = new AssertLib();

        actionLib.goToUrl("http://www.imt-atlantique.fr/fr/formation/trouver-ma-formation");
        SelectFilterProperty select_checkbox = new SelectFilterProperty();
        select_checkbox.elementType = FilterElementType.CHECKBOX;

        var checkbox = selectLib.selectElements(select_checkbox);
        actionLib.checkCheckbox(checkbox, false);
        SelectFilterProperty select_checkbox1 = new SelectFilterProperty();
        select_checkbox1.filterValue = "Anglais";
        select_checkbox1.filterBy = FilterBy.LABEL;
        select_checkbox1.elementType = FilterElementType.CHECKBOX;
        select_checkbox1.nthChild = 1;

        var checkbox1 = selectLib.selectElement(select_checkbox1);
        SelectFilterProperty select_checkbox2 = new SelectFilterProperty();
        select_checkbox2.filterValue = "À domicile";
        select_checkbox2.filterBy = FilterBy.LABEL;
        select_checkbox2.elementType = FilterElementType.CHECKBOX;
        select_checkbox2.nthChild = 1;

        var checkbox2 = selectLib.selectElement(select_checkbox2);
        SelectFilterProperty select_checkbox3 = new SelectFilterProperty();
        select_checkbox3.filterValue = "Temps plein";
        select_checkbox3.filterBy = FilterBy.LABEL;
        select_checkbox3.elementType = FilterElementType.CHECKBOX;
        select_checkbox3.nthChild = 1;

        var checkbox3 = selectLib.selectElement(select_checkbox3);
        actionLib.checkCheckbox(checkbox1, true);
        SelectFilterProperty select_btn = new SelectFilterProperty();
        select_btn.filterValue = "Appliquer les critères";
        select_btn.filterBy = FilterBy.VALUE;
        select_btn.nthChild = 1;

        var btn = selectLib.selectElement(select_btn);
        actionLib.clickElement(btn);
        SelectFilterProperty select_result = new SelectFilterProperty();
        select_result.filterBy = FilterBy.TEXT;
        select_result.filterValue = "No found course matching your criteria.";
        select_result.nthChild = 1;

        var result = selectLib.selectElement(select_result);
        assertLib.assertElementExists(result.element, "$result");

        driver.quit();
    }
}
