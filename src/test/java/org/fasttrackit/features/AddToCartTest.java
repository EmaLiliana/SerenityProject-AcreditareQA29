package org.fasttrackit.features;

import org.junit.Test;

public class AddToCartTest extends BaseTest{
    @Test
    public void addProductToCartTest(){
        addToCartSteps.addProductToCart();
        addToCartSteps.verifyMsgAddedToCart();
    }
    @Test
    public void addMultipleProductsToCartTest(){
        addToCartSteps.addToCartMultipleProducts();
        addToCartSteps.verifyMsgSecondProductAddedToCart();


    }
}
