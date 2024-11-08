package fr.imta.massimotisi.browserautomation.example;

import fr.imta.massimotisi.browserautomation.lib.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test2 {
    public static void main(String[] args) {
        /*
        [TASK] "Test 2"
            [GOTO] http://www.imt-atlantique.fr/fr
            [SELECT] $lien1
                [CONTENT] "Toutes les actualités"
                [TYPE] $LINK
                [NTH-CHILD] 1
            [ACTION] $lien1
                [CLICK]
            [SELECT] $lien2
                [CONTENT] "Accueil"
                [TYPE] $LINK
                [NTH-CHILD] 1
            [ASSERT] $lien2
        */

        // [TASK] "Test 2"
        System.out.println("Test 2");

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

        // [ACTION] $lien1
        //      [CLICK]
        actionLib.clickElement(lien1.element);

        // [SELECT] $lien2
        //      [CONTENT] "Accueil"
        //      [TYPE] $LINK
        //      [NTH-CHILD] 1
        SelectFilterProperty select_lien2 = new SelectFilterProperty();
        select_lien2.filterValue = "Accueil";
        select_lien2.filterBy = fr.imta.massimotisi.browserautomation.lib.FilterBy.TEXT;
        select_lien2.elementType = fr.imta.massimotisi.browserautomation.lib.FilterElementType.LINK;
        select_lien2.nthChild = 1;

        SelectInfo lien2 = selectLib.selectElement(select_lien2);

        // [ASSERT] $lien2
        assertLib.assertElementExists(lien2.element, "$lien2");

        driver.quit();
    }
}