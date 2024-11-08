package fr.imta.massimotisi.browserautomation.example;

import fr.imta.massimotisi.browserautomation.lib.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test7 {
    public static void main(String[] args) {
        /*
[TASK] "Test 7"
	[GOTO] "http://www.imt-atlantique.fr/fr"
	[SELECT] $firstNewsLink
		[CONTENT] "Actualités"
        [NTH-CHILD] 1
		[PARENT] {
			[TYPE] $LINK
			[NTH-CHILD] 1
		}
	[ACTION] $firstNewsLink
		[CLICK]
	[SELECT] $result
		[CONTENT] $firstNewsLink.CONTENT
        [NTH-CHILD] 1
	[TEST] $result
        */

        // [TASK] "Test 7"
        System.out.println("Test 7");

        WebDriver driver = new ChromeDriver();
        Duration timeout = Duration.ofSeconds(10);
        SelectLib selectLib = new SelectLib(driver, timeout);
        ActionLib actionLib = new ActionLib(driver, timeout);
        AssertLib assertLib = new AssertLib();

        // [GOTO] "http://www.imt-atlantique.fr/fr"
        actionLib.goToUrl("http://www.imt-atlantique.fr/fr");

        //	[SELECT] $firstNewsLink
        //		[CONTENT] "Actualités"
        //      [NTH-CHILD] 1
        //		[PARENT] {
        //			[TYPE] $LINK
        //			[NTH-CHILD] 1
        //		}
        SelectFilterProperty select_firstNewsLink = new SelectFilterProperty();
        select_firstNewsLink.filterValue = "Actualités";
        select_firstNewsLink.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.TEXT;
        select_firstNewsLink.nthChild = 1;

        SelectInfo firstNewsLink = selectLib.selectElement(select_firstNewsLink);

        // Get parent of "Actualités"
        SelectInfo firstNewsLink_parent = selectLib.getParent(firstNewsLink.element);

        //		[PARENT] {
        //			[TYPE] $LINK
        //			[NTH-CHILD] 1
        //		}
        select_firstNewsLink = new SelectFilterProperty();
        select_firstNewsLink.parent = firstNewsLink_parent.element;
        select_firstNewsLink.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.LINK;
        select_firstNewsLink.nthChild = 1;

        // Because we are in parent, don't recreate variable
        firstNewsLink = selectLib.selectElement(select_firstNewsLink);

        //             [ACTION] $firstNewsLink
        //                [CLICK]
        actionLib.clickElement(firstNewsLink.element);

        //             [SELECT] $result
        //                [CONTENT] $firstNewsLink.CONTENT
        SelectFilterProperty select_result = new SelectFilterProperty();
        select_result.filterValue = firstNewsLink.content; // Use content of the clicked link
        select_result.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.TEXT;
        select_result.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.ANY;

        SelectInfo result = selectLib.selectElement(select_result);

        // [TEST] $result
        assertLib.assertElementExists(result.element, "$result");

        driver.quit();
    }
}