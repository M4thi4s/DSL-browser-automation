package fr.imta.massimotisi.browserautomation.example;

import fr.imta.massimotisi.browserautomation.lib.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        /*
[TASK] "Test 5"
	[GOTO] "http://www.imt-atlantique.fr/fr/formation/trouver-ma-formation"
	[SELECT] $checkbox
		[LABEL] $ALL
		[TYPE] $CHECKBOX
	[ACTION] $checkbox
		[CHECK] $FALSE
	[SELECT] $checkbox1
		[LABEL] "Anglais"
		[TYPE] $CHECKBOX
        [NTH-CHILD] 1
	[SELECT] $checkbox2
		[NAME] "À domicile"
		[TYPE] $CHECKBOX
        [NTH-CHILD] 1
	[SELECT] $checkbox3
		[NAME] "Temps plein"
		[TYPE] $CHECKBOX
        [NTH-CHILD] 1
	[ACTION] $checkbox1 $checkbox2 $checkbox3
		[CHECK] $TRUE
	[SELECT] $btn
		[VALUE] "Appliquer les critères"
        [NTH-CHILD] 1
	[ACTION] $btn
		[CLICK]
	[SELECT] $result
		[CONTENT] "No found course matching your criteria."
        [NTH-CHILD] 1
	[TEST] $result
        */

        // [TASK] "Test 5"
        System.out.println("Test 5");

        WebDriver driver = new ChromeDriver();
        Duration timeout = Duration.ofSeconds(10);
        SelectLib selectLib = new SelectLib(driver, timeout);
        ActionLib actionLib = new ActionLib(driver, timeout);
        AssertLib assertLib = new AssertLib();

        // [GOTO] "http://www.imt-atlantique.fr/fr/formation/trouver-ma-formation"
        actionLib.goToUrl("http://www.imt-atlantique.fr/fr/formation/trouver-ma-formation");

        //             [SELECT] $checkbox
        //                [LABEL] $ALL
        //                [TYPE] $CHECKBOX
        SelectFilterProperty select_checkbox = new SelectFilterProperty();
        select_checkbox.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.CHECKBOX;

        var checkbox = selectLib.selectElements(select_checkbox);

        // Because no nth-child is specified, we need to loop through all the elements
        //             [ACTION] $checkbox
        //                [CHECK] $FALSE
        for (SelectInfo el_checkbox : checkbox) {
            actionLib.checkCheckbox(el_checkbox.element, false);
        }

        //             [SELECT] $checkbox1
        //                [LABEL] "Anglais"
        //                [TYPE] $CHECKBOX
        //                [NTH-CHILD] 1
        SelectFilterProperty select_checkbox1 = new SelectFilterProperty();
        select_checkbox1.filterValue = "Anglais";
        select_checkbox1.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.LABEL;
        select_checkbox1.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.CHECKBOX;
        select_checkbox1.nthChild = 1;

        SelectInfo checkbox1 = selectLib.selectElement(select_checkbox1);

        //             [SELECT] $checkbox2
        //                [NAME] "A domicile"
        //                [TYPE] $CHECKBOX
        //                [NTH-CHILD] 1
        SelectFilterProperty select_checkbox2 = new SelectFilterProperty();
        select_checkbox2.filterValue = "A domicile";
        select_checkbox2.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.LABEL;
        select_checkbox2.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.CHECKBOX;
        select_checkbox2.nthChild = 1;

        SelectInfo checkbox2 = selectLib.selectElement(select_checkbox2);

        //             [SELECT] $checkbox3
        //                [NAME] "Temps plein"
        //                [TYPE] $CHECKBOX
        //                [NTH-CHILD] 1
        SelectFilterProperty select_checkbox3 = new SelectFilterProperty();
        select_checkbox3.filterValue = "Temps plein";
        select_checkbox3.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.LABEL;
        select_checkbox3.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.CHECKBOX;
        select_checkbox3.nthChild = 1;

        SelectInfo checkbox3 = selectLib.selectElement(select_checkbox3);

        //             [ACTION] $checkbox1 $checkbox2 $checkbox3
        //                [CHECK] $TRUE
        actionLib.checkCheckbox(checkbox1.element, true);
        actionLib.checkCheckbox(checkbox2.element, true);
        actionLib.checkCheckbox(checkbox3.element, true);

        //             [SELECT] $btn
        //                [VALUE] "Appliquer les critères"
        //                [NTH-CHILD] 1
        SelectFilterProperty select_btn = new SelectFilterProperty();
        select_btn.filterValue = "Appliquer les critères";
        select_btn.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.VALUE;
        select_btn.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.INPUT;
        select_btn.nthChild = 1;

        SelectInfo btn = selectLib.selectElement(select_btn);

        //             [ACTION] $btn
        //                [CLICK]
        actionLib.clickElement(btn.element);

        //             [SELECT] $result
        //                [TYPE] $TEXT
        //                [CONTENT] "No found course matching your criteria."
        //                [NTH-CHILD] 1
        SelectFilterProperty select_result = new SelectFilterProperty();
        select_result.filterValue = "No found course matching your criteria.";
        select_result.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.TEXT;
        select_result.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.TEXT;
        select_result.nthChild = 1;

        SelectInfo result = selectLib.selectElement(select_result);

        // [TEST] $result
        assertLib.assertElementExists(result.element, "$result");

        driver.quit();
    }
}