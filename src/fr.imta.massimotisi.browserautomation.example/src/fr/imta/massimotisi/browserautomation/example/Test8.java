package fr.imta.massimotisi.browserautomation.example;

import fr.imta.massimotisi.browserautomation.lib.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test8 {
    public static void main(String[] args) {
        /*
[TASK] "Test 8"
	[GOTO] "http://www.imt-atlantique.fr/fr"
	[SELECT] $secondNewsLink
		[CONTENT] "Actualités"
        [NTH-CHILD] 1
		[PARENT] {
			[TYPE] $LINK
			[NTH-CHILD] 2
		}
	[GOTO] "http://www.imt-atlantique.fr/fr/rechercher"
	[SELECT] $searchField
		[LABEL] "Rechercher"
		[TYPE] $INPUT
        [NTH-CHILD] 2
	[ACTION] $searchField
		[SET-TEXT] $secondNewsLink.CONTENT
	[SELECT] $btn
		[VALUE] "Appliquer les filtres"
        [NTH-CHILD] 1
	[ACTION] $btn
		[CLICK]
    [SELECT] $link
        [LINK] $secondNews.LINK
        [TYPE] $LINK
        [NTH-CHILD] 1
	[TEST] $link
        */

        System.out.println("Test 8");

        WebDriver driver = new ChromeDriver();
        Duration timeout = Duration.ofSeconds(10);
        SelectLib selectLib = new SelectLib(driver, timeout);
        ActionLib actionLib = new ActionLib(driver, timeout);
        AssertLib assertLib = new AssertLib();

        // [GOTO] "http://www.imt-atlantique.fr/fr"
        actionLib.goToUrl("http://www.imt-atlantique.fr/fr");

        //	[SELECT] $secondNewsLink
        //		[CONTENT] "Actualités"
        //      [NTH-CHILD] 1
        //		[PARENT] {
        //			[TYPE] $LINK
        //			[NTH-CHILD] 2
        //		}
        SelectFilterProperty select_secondNewsLink = new SelectFilterProperty();
        select_secondNewsLink.filterValue = "Actualités";
        select_secondNewsLink.nthChild = 1;

        SelectInfo secondNewsLink = selectLib.selectElement(select_secondNewsLink);

        //		[PARENT] {
        //			[TYPE] $LINK
        //			[NTH-CHILD] 2
        //		}
        SelectInfo secondNewsLink_parent = selectLib.getParent(secondNewsLink.element);

        select_secondNewsLink = new SelectFilterProperty();
        select_secondNewsLink.parent = secondNewsLink_parent.element;
        select_secondNewsLink.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.LINK;
        select_secondNewsLink.nthChild = 2;

        secondNewsLink = selectLib.selectElement(select_secondNewsLink);

        // [GOTO] "http://www.imt-atlantique.fr/fr/rechercher"
        actionLib.goToUrl("http://www.imt-atlantique.fr/fr/rechercher");

        //	[SELECT] $searchField
        //		[LABEL] "Rechercher"
        //		[TYPE] $INPUT
        //        [NTH-CHILD] 2
        SelectFilterProperty select_searchField = new SelectFilterProperty();
        select_searchField.filterValue = "Rechercher";
        select_searchField.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.LABEL;
        select_searchField.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.INPUT;
        select_searchField.nthChild = 2;

        SelectInfo searchField = selectLib.selectElement(select_searchField);

        //	[ACTION] $searchField
        //		[SET-TEXT] $secondNewsLink.CONTENT
        actionLib.setText(searchField.element, secondNewsLink.content);

        //	[SELECT] $btn
        //		[VALUE] "Appliquer les filtres"
        //        [NTH-CHILD] 1
        SelectFilterProperty select_btn = new SelectFilterProperty();
        select_btn.filterValue = "Appliquer les filtres";
        select_btn.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.VALUE;
        select_btn.elementType = FilterElementType.INPUT;
        select_btn.nthChild = 1;

        SelectInfo btn = selectLib.selectElement(select_btn);

        //	[ACTION] $btn
        //		[CLICK]
        actionLib.clickElement(btn.element);

        //	[SELECT] $link
        //		[LINK] $secondNews.LINK
        //      [NTH-CHILD] 1
        SelectFilterProperty select_link = new SelectFilterProperty();
        select_link.filterValue = secondNewsLink.link;
        select_link.filterBy = FilterBy.LINK;
        select_link.nthChild = 1;

        SelectInfo link = selectLib.selectElement(select_link);

        // [TEST] $link
        assertLib.assertElementExists(link.element, "$link");

        driver.quit();
    }
}