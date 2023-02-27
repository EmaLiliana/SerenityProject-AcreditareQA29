package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ProductsListPage extends BasePage{
    @FindBy(css=".orderby")
    private WebElementFacade clickDropdown;
    @FindBy(css=".orderby option:nth-child(4)")
    private WebElementFacade sortByDropdown;
    @FindBy(css=".p-info .amount")
    private List<WebElementFacade> listOfPrices;



    public void clickOnDropdown(){clickOn(clickDropdown);}
    public void clickOnSortByDropdown(){clickOn(sortByDropdown);}

    public boolean isPriceAscending(){
        int firstPrice = getIntFromPrice(listOfPrices.get(0).getText());
        int lastPrice = getIntFromPrice(listOfPrices.get(listOfPrices.size() - 1).getText());
        return firstPrice <= lastPrice;
    }

}
