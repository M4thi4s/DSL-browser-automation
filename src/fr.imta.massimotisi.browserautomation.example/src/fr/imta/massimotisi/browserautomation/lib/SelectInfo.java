package fr.imta.massimotisi.browserautomation.lib;

import org.openqa.selenium.WebElement;

import java.util.Optional;

public class SelectInfo {
    public WebElement element;
    public String content;
    public String type;
    public String link;

    public SelectInfo(WebElement element) {
        this.element = element;

        if (element != null) {
            this.content = element.getText();
            this.type = element.getTagName();
            this.link = Optional.ofNullable(element.getAttribute("href"))
                    .map(href -> href.replaceFirst("^(http[s]?://[^/]+)?", ""))
                    .orElse(null);
        }
    }

    public String getContent() {
        return content;
    }
}
