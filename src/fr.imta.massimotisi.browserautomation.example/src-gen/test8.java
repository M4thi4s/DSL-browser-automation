import fr.imta.massimotisi.browserautomation.lib.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class test8 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Duration timeout = Duration.ofSeconds(10);
        SelectLib selectLib = new SelectLib(driver, timeout);
        ActionLib actionLib = new ActionLib(driver, timeout);
        AssertLib assertLib = new AssertLib();
        
        actionLib.goToUrl("http://www.imt-atlantique.fr/fr");
        var select_secondNewsLink = new SelectFilterProperty();
        select_secondNewsLink.filterBy = FilterBy.TEXT;
        select_secondNewsLink.filterValue = "Actualités";
        select_secondNewsLink.nthChild = 1;
        {
        	select_secondNewsLink = new SelectFilterProperty(selectLib.getParent(select_secondNewsLink).element);
        	select_secondNewsLink.elementType = FilterElementType.LINK;
        	select_secondNewsLink.nthChild = 2;
        }
        
        var secondNewsLink = selectLib.selectElement(select_secondNewsLink);
        actionLib.goToUrl("http://www.imt-atlantique.fr/fr/rechercher");
        var select_searchField = new SelectFilterProperty();
        select_searchField.filterValue = "Rechercher";
        select_searchField.filterBy = FilterBy.LABEL;
        select_searchField.elementType = FilterElementType.INPUT;
        select_searchField.nthChild = 2;
        
        var searchField = selectLib.selectElement(select_searchField);
        actionLib.setText(searchField, secondNewsLink.CONTENT);
        var select_btn = new SelectFilterProperty();
        select_btn.filterValue = "Appliquer les filtres";
        select_btn.filterBy = FilterBy.VALUE;
        select_btn.nthChild = 1;
        
        var btn = selectLib.selectElement(select_btn);
        actionLib.clickElement(btn);
        var select_link = new SelectFilterProperty();
        select_link.filterValue = secondNewsLink.LINK; 
        select_link.filterBy = FilterBy.LINK;
        select_link.elementType = FilterElementType.LINK;
        select_link.nthChild = 1;
        
        var link = selectLib.selectElement(select_link);
        assertLib.assertElementExists(link.element, "link");
        
        driver.quit();
    }
}
