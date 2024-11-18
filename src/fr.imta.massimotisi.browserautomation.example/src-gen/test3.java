import fr.imta.massimotisi.browserautomation.lib.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class test3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Duration timeout = Duration.ofSeconds(10);
        SelectLib selectLib = new SelectLib(driver, timeout);
        ActionLib actionLib = new ActionLib(driver, timeout);
        AssertLib assertLib = new AssertLib();
        
        actionLib.goToUrl("http://www.imt-atlantique.fr/fr");
        var select_toutesLesActus = new SelectFilterProperty();
        select_toutesLesActus.filterBy = FilterBy.TEXT;
        select_toutesLesActus.filterValue = "Toutes les actualités";
        select_toutesLesActus.elementType = FilterElementType.LINK;
        select_toutesLesActus.nthChild = 1;
        
        var toutesLesActus = selectLib.selectElement(select_toutesLesActus);
        actionLib.clickElement(toutesLesActus);
        var select_accueil = new SelectFilterProperty();
        select_accueil.filterValue = "Accueil";
        select_accueil.filterBy = FilterBy.ALT;
        select_accueil.nthChild = 1;
        
        var accueil = selectLib.selectElement(select_accueil);
        actionLib.clickElement(accueil);
        var select_toutesLesActus2 = new SelectFilterProperty();
        select_toutesLesActus2.elementType = FilterElementType.LINK;
        select_toutesLesActus2.filterBy = FilterBy.TEXT;
        select_toutesLesActus2.filterValue = toutesLesActus.CONTENT;
        select_toutesLesActus2.nthChild = 1;
        
        var toutesLesActus2 = selectLib.selectElement(select_toutesLesActus2);
        assertLib.assertElementExists(toutesLesActus2.element, "toutesLesActus2");
        
        driver.quit();
    }
}
