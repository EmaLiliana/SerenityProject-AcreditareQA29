package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class AddToCartSteps extends BaseSteps{
    @Step
    public void navigateToProductPage(){homePage.clickShopButton();}
    @Step
    public void clickOnAddToCart(){addToCartPage.clickAddToCart();}
    @Step
    public void clickOnAddToCartSecondProduct(){ addToCartPage.clickAddToCartSecondProduct();}
    @Step
    public void verifyMsgAddedToCart(){addToCartPage.verifySuccessMsgAddedToCart();}
    @Step
    public void verifyMsgSecondProductAddedToCart(){ addToCartPage.verifySuccessMsgSecondProductAdded();}
    @Step
    public void addProductToCart(){
        navigateToProductPage();
        clickOnAddToCart();
    }
    @Step
    public void addToCartMultipleProducts(){
        addProductToCart();
        verifyMsgAddedToCart();
        clickOnAddToCartSecondProduct();
    }


}
