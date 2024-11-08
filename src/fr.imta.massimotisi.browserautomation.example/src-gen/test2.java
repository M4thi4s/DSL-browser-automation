package fr.imta.massimotisi.browserautomation.example;

import fr.imta.massimotisi.browserautomation.lib.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class test2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Duration timeout = Duration.ofSeconds(10);
        SelectLib selectLib = new SelectLib(driver, timeout);
        ActionLib actionLib = new ActionLib(driver, timeout);
        AssertLib assertLib = new AssertLib();
        
        actionLib.goToUrl("http://www.imt-atlantique.fr/fr");
        var select_lien1 = new SelectFilterProperty();
        select_lien1.filterBy = FilterBy.TEXT;
        select_lien1.filterValue = "Toutes les actualités";
        select_lien1.elementType = FilterElementType.LINK;
        select_lien1.nthChild = 1;
        
        var lien1 = selectLib.selectElement(select_lien1);
        actionLib.clickElement(lien1);
        var select_lien2 = new SelectFilterProperty();
        select_lien2.filterBy = FilterBy.TEXT;
        select_lien2.filterValue = "Accueil";
        select_lien2.elementType = FilterElementType.LINK;
        select_lien2.nthChild = 1;
        
        var lien2 = selectLib.selectElement(select_lien2);
        assertLib.assertElementExists(lien2.element, "$lien2");
        
        driver.quit();
    }
}
