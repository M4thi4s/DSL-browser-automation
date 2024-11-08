package fr.imta.massimotisi.browserautomation.lib;

import org.openqa.selenium.WebElement;

public class AssertLib {

    // [TEST] Verify that an element exists
    public void assertElementExists(WebElement element, String elementName) {
        if (element != null) {
            System.out.println("[TEST] " + elementName + " => OK");
        } else {
            System.out.println("[TEST] " + elementName + " => KO");
        }
    }
}