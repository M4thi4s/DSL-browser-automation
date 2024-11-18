package fr.imta.massimotisi.browserautomation.lib;

import org.openqa.selenium.WebElement;

public class SelectFilterProperty {
    public String filterValue; // No default value
    public FilterBy filterBy = FilterBy.TEXT; // Default = TEXT
    public FilterElementType elementType = FilterElementType.ANY; // Default = ALL
    public Integer nthChild = null; // If null, select all
    public WebElement searchFromElement = null; // If null, select in the entire page

    // Constructors for convenience
    public SelectFilterProperty() {}

    public SelectFilterProperty(WebElement searchFromElement) {
        this.searchFromElement = searchFromElement;
    }
}
