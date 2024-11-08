package fr.imta.massimotisi.browserautomation.lib;

import org.openqa.selenium.WebElement;

import java.util.Optional;

public class SelectInfo {
    public WebElement element;
    public String CONTENT;
    public String TYPE;
    public String LINK;

    public SelectInfo(WebElement element) {
        this.element = element;

        if (element != null) {
            this.CONTENT = element.getText();
            this.TYPE = element.getTagName();
            this.LINK = Optional.ofNullable(element.getAttribute("href"))
                    .map(href -> href.replaceFirst("^(http[s]?://[^/]+)?", ""))
                    .orElse(null);
        }
    }

    public String getCONTENT() {
        return CONTENT;
    }
}
