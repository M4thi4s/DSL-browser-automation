import fr.imta.massimotisi.browserautomation.lib.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class test4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Duration timeout = Duration.ofSeconds(10);
        SelectLib selectLib = new SelectLib(driver, timeout);
        ActionLib actionLib = new ActionLib(driver, timeout);
        AssertLib assertLib = new AssertLib();
        
        actionLib.goToUrl("http://www.imt-atlantique.fr/fr/rechercher");
        var select_field = new SelectFilterProperty();
        select_field.filterValue = "Rechercher";
        select_field.filterBy = FilterBy.LABEL;
        select_field.elementType = FilterElementType.INPUT;
        select_field.nthChild = 2;
        
        var field = selectLib.selectElement(select_field);
        actionLib.setText(field, "Donald Trumpe");
        var select_btn = new SelectFilterProperty();
        select_btn.filterValue = "Appliquer les filtres";
        select_btn.filterBy = FilterBy.VALUE;
        select_btn.nthChild = 1;
        
        var btn = selectLib.selectElement(select_btn);
        actionLib.clickElement(btn);
        var select_result = new SelectFilterProperty();
        select_result.filterBy = FilterBy.TEXT;
        select_result.filterValue = "Aucun résultat ne correspond à votre recherche";
        select_result.nthChild = 1;
        
        var result = selectLib.selectElement(select_result);
        assertLib.assertElementExists(result.element, "result");
        
        driver.quit();
    }
}
