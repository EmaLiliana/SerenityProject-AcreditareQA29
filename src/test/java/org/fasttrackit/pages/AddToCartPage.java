package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddToCartPage extends BasePage{
    @FindBy(css=" .woocommerce-message")
    private WebElementFacade successMsgAddedToCart;
    @FindBy(css=".item-wrap .action a")
    private WebElementFacade addToCartButton;
    @FindBy(css=".item:nth-child(2) .action a")
    private WebElementFacade addToCartSecondProductCartTotal;
    @FindBy(css=".post-19 .action a")
    private WebElementFacade addToCartSecondProduct;

    public void verifySuccessMsgAddedToCart(){
        String productName="Album";
        successMsgAddedToCart.getText().equalsIgnoreCase(productName+" has been added to your cart.");
    }
    public void verifySuccessMsgSecondProductAdded(){
        String secondProductName="Beanie";
        successMsgAddedToCart.getText().equalsIgnoreCase(secondProductName+" has been added to your cart.");

    }
    public void clickAddToCart(){clickOn(addToCartButton);}
    public void clickAddToCartSecondProduct(){clickOn(addToCartSecondProduct);}



}
