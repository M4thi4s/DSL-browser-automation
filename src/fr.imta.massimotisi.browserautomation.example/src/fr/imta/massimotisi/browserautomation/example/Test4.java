package fr.imta.massimotisi.browserautomation.example;

import fr.imta.massimotisi.browserautomation.lib.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test4 {
    public static void main(String[] args) {
        /*
[TASK] "Test 4"
    [GOTO] "http://www.imt-atlantique.fr/fr/rechercher"
    [SELECT] $field
        [LABEL] "Rechercher"
        [TYPE] $INPUT
        [NTH-CHILD] 2
    [ACTION] $field
        [SET-TEXT] "Donald Trumpe"
    [SELECT] $btn
        [VALUE] "Appliquer les filtres"
        [NTH-CHILD] 1
    [ACTION] $btn
        [CLICK]
    [SELECT] $result
        [CONTENT] "Aucun résultat ne correspond à votre recherche"
        [NTH-CHILD] 1
    [TEST] $result
        */

        // [TASK] "Test 4"
        System.out.println("Test 4");

        WebDriver driver = new ChromeDriver();
        Duration timeout = Duration.ofSeconds(10);
        SelectLib selectLib = new SelectLib(driver, timeout);
        ActionLib actionLib = new ActionLib(driver, timeout);
        AssertLib assertLib = new AssertLib();

        // [GOTO] http://www.imt-atlantique.fr/fr/rechercher
        actionLib.goToUrl("http://www.imt-atlantique.fr/fr/rechercher");

        //             [SELECT] $field
        //                [LABEL] "Rechercher"
        //                [TYPE] $INPUT
        //                [NTH-CHILD] 2
        SelectFilterProperty select_field = new SelectFilterProperty();
        select_field.filterValue = "Rechercher";
        select_field.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.LABEL;
        select_field.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.INPUT;
        select_field.nthChild = 2;

        SelectInfo field = selectLib.selectElement(select_field);

        //             [ACTION] $field
        //                [SET-TEXT] "Donald Trumpe"
        actionLib.setText(field, "Donald Trumpe");

        //             [SELECT] $btn
        //                [VALUE] "Appliquer les filtres"
        //                [NTH-CHILD] 1
        SelectFilterProperty select_btn = new SelectFilterProperty();
        select_btn.filterValue = "Appliquer les filtres";
        select_btn.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.VALUE;
        select_btn.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.INPUT;
        select_btn.nthChild = 1;

        SelectInfo btn = selectLib.selectElement(select_btn);

        //             [ACTION] $btn
        //                [CLICK]
        actionLib.clickElement(btn);

        //             [SELECT] $result
        //                [CONTENT] "Aucun résultat ne correspond à votre recherche"
        //                [NTH-CHILD] 1
        SelectFilterProperty select_result = new SelectFilterProperty();
        select_result.filterValue = "Aucun résultat ne correspond à votre recherche";
        select_result.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.TEXT;
        select_result.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.ANY;
        select_result.nthChild = 1;

        SelectInfo result = selectLib.selectElement(select_result);

        // [TEST] $result
        assertLib.assertElementExists(result.element, "$result");

        driver.quit();
    }
}