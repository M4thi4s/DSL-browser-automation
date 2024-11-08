package fr.imta.massimotisi.browserautomation.run;

import fr.imta.massimotisi.browserautomation.lib.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Duration timeout = Duration.ofSeconds(10);
        SelectLib selectLib = new SelectLib(driver, timeout);
        ActionLib actionLib = new ActionLib(driver, timeout);
        AssertLib assertLib = new AssertLib();
        
        actionLib.goToUrl("http://www.imt-atlantique.fr/fr");
        SelectFilterProperty select_lien1 = new SelectFilterProperty();
        select_lien1.filterBy = FilterBy.TEXT;
        select_lien1.filterValue = "Toutes les actualités";
        select_lien1.elementType = FilterElementType.LINK;
        SelectInfo lien1 = selectLib.selectElement(select_lien1);
        assertLib.assertElementExists(lien1.element, "$lien1");
        
        driver.quit();
    }
}
