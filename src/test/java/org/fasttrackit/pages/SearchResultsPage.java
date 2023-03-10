package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultsPage extends BasePage{
    @FindBy(css=".entry-header .entry-title")
    private List<WebElementFacade>listOfProductNames;

    public boolean isProductInList(String productName) {
        waitFor(listOfProductNames.get(0));
        for (WebElementFacade element : listOfProductNames) {
            if (element.getText().equalsIgnoreCase(productName)) {
                element.click();
                return true;
            }
        }

        return false;
    }
}
