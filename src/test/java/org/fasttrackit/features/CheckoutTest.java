package org.fasttrackit.features;

import org.junit.Test;

public class CheckoutTest extends BaseTest{
    @Test
    public void doCheckoutTest(){
        addToCartSteps.addProductToCart();
        checkoutSteps.doCheckout("Ana","Ema","Romania","Cobalcescu","Cluj","1234","07000000000","anaema@yahoo.com");
        checkoutSteps.verifyMsgOrderPlaced();
    }

}
