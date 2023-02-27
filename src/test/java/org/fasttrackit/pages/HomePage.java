package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage{

    @FindBy(css=".search-box > .icon-search")
    private WebElementFacade searchIcon;
    @FindBy(css=".search-form input")
    private WebElementFacade searchField;
    @FindBy(css="button>.icon-search")
    private WebElementFacade searchButton;
    @FindBy(css="#menu-item-66 a")
    private WebElementFacade shopButton;
    @FindBy(css="#menu-item-65 a")
    private WebElementFacade checkoutButton;
    @FindBy(css="#menu-item-64 a")
    private WebElementFacade myAccountButton;
    @FindBy(css="#menu-item-63 a")
    private WebElementFacade homeButton;
    @FindBy(css=".cart-control i")
    private WebElementFacade cartIcon;

    public void clickSearchIcon(){clickOn(searchIcon);}
    public void setSearchField(String value){typeInto(searchField,value);}
    public void clickSearchButton(){clickOn(searchButton);}
    public void clickShopButton(){clickOn(shopButton);}
    public void clickMyAccountButton(){clickOn(myAccountButton);}





}
