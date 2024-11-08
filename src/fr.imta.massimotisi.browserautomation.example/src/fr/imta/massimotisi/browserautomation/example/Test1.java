package fr.imta.massimotisi.browserautomation.example;

import fr.imta.massimotisi.browserautomation.lib.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test1 {
    public static void main(String[] args) {
        /*
        [TASK] "Test 1"
            [GOTO] http://www.imt-atlantique.fr/fr
            [SELECT] $lien1
                [CONTENT] "Toutes les actualités"
                [TYPE] $LINK
                [NTH-CHILD] 1
            [ASSERT] $lien1
        */

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

        // [ASSERT] $lien1
        assertLib.assertElementExists(lien1.element, "$lien1");

        driver.quit();
    }
}