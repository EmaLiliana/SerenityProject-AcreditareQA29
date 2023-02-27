package org.fasttrackit.features;

import org.junit.Test;

public class CartTest extends BaseTest{
    @Test
    public void totalCartTest(){
        addToCartSteps.addToCartMultipleProducts();
        cartSteps.navigateToCartPage();
        cartSteps.verifyTotalPriceCart();


    }
}
