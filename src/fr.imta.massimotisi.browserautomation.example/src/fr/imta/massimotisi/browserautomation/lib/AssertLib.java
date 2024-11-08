package fr.imta.massimotisi.browserautomation.lib;

import org.openqa.selenium.WebElement;

public class AssertLib {

    // [ASSERT] Verify that an element exists
    public void assertElementExists(WebElement element, String elementName) {
        if (element != null) {
            System.out.println("[ASSERT] " + elementName + " => OK");
        } else {
            System.out.println("[ASSERT] " + elementName + " => KO");
        }
    }
}