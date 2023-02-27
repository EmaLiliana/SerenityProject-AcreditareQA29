package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class CartSteps extends BaseSteps{
    @Step
    public void navigateToCartPage(){cartPage.clickOnViewCartButton();}
    @Step
    public void verifyTotalPrice(){cartPage.verifyTotalPrice();}
    @Step
    public void verifyTotalPriceCart(){
        navigateToCartPage();
        verifyTotalPrice();
    }



}
