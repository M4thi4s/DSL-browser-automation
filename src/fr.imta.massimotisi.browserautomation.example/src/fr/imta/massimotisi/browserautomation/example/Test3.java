package fr.imta.massimotisi.browserautomation.example;

import fr.imta.massimotisi.browserautomation.lib.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test3 {
    public static void main(String[] args) {
        /*
[TASK] Test_3
  [GOTO] "http://www.imt-atlantique.fr/fr"
  [SELECT] $toutesLesActus
    [CONTENT] "Toutes les actualités"
    [TYPE] $LINK
    [NTH-CHILD] 1
  [ACTION] $toutesLesActus
	[CLICK]
  [SELECT] $accueil
	[ALT] "Accueil"
    [NTH-CHILD] 1
  [ACTION] $accueil
	[CLICK]
  [SELECT] $toutesLesActus2
	[TYPE] $LINK
	[CONTENT] $toutesLesActus.CONTENT
    [NTH-CHILD] 1
  [TEST] $toutesLesActus2
        */

        // [TASK] "Test 3"
        System.out.println("Test 3");

        WebDriver driver = new ChromeDriver();
        Duration timeout = Duration.ofSeconds(10);
        SelectLib selectLib = new SelectLib(driver, timeout);
        ActionLib actionLib = new ActionLib(driver, timeout);
        AssertLib assertLib = new AssertLib();

        // [GOTO] http://www.imt-atlantique.fr/fr
        actionLib.goToUrl("http://www.imt-atlantique.fr/fr");

        //             [SELECT] $toutesLesActus
        //                [CONTENT] "Toutes les actualités"
        //                [TYPE] $LINK
        //                [NTH-CHILD] 1
        SelectFilterProperty select_toutesLesActus = new SelectFilterProperty();
        select_toutesLesActus.filterValue = "Toutes les actualités";
        select_toutesLesActus.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.TEXT;
        select_toutesLesActus.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.LINK;
        select_toutesLesActus.nthChild = 1;

        SelectInfo toutesLesActus = selectLib.selectElement(select_toutesLesActus);

        //             [ACTION] $toutesLesActus
        //                [CLICK]
        actionLib.clickElement(toutesLesActus);

        //             [SELECT] $image
        //                [ALT] "Accueil"
        //                [NTH-CHILD] 1
        SelectFilterProperty select_image = new SelectFilterProperty();
        select_image.filterValue = "Accueil";
        select_image.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.ALT;
        select_image.nthChild = 1;

        SelectInfo image = selectLib.selectElement(select_image);

        //             [ACTION] $image
        //                [CLICK]
        actionLib.clickElement(image);

        //             [SELECT] $toutesLesActus2
        //                [CONTENT] "Toutes les actualités"
        //                [TYPE] $LINK
        //                [NTH-CHILD] 1
        SelectFilterProperty select_toutesLesActus2 = new SelectFilterProperty();
        select_toutesLesActus2.filterValue = "Toutes les actualités";
        select_toutesLesActus2.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.TEXT;
        select_toutesLesActus2.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.LINK;
        select_toutesLesActus2.nthChild = 1;

        SelectInfo toutesLesActus2 = selectLib.selectElement(select_toutesLesActus2);

        // [TEST] $toutesLesActus2
        assertLib.assertElementExists(toutesLesActus2.element, "$toutesLesActus2");

        driver.quit();
    }
}