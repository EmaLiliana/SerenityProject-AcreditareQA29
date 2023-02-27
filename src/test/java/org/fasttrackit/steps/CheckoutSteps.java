package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class CheckoutSteps extends BaseSteps{

    @Step
    public void doCheckout(String firstName,String lastName,String countryName, String streetAddress,String cityName, String postcode, String phone,String email){

        cartPage.clickOnViewCartButton();
        cartPage.clickOnProceedToCheckout();
        checkoutPage.setFirstNameBilling(firstName);
        checkoutPage.setLastNameBilling(lastName);
        checkoutPage.setStreetAddressBilling(streetAddress);
        checkoutPage.setCityBilling(cityName);
        checkoutPage.setPostcodeBilling(postcode);
        checkoutPage.setPhoneBilling(phone);
        checkoutPage.setEmailBilling(email);
        checkoutPage.clickOnPlaceOrderButtonBilling();
    }
    @Step
    public void verifyMsgOrderPlaced(){checkoutPage.verifySuccessMsgPlacedOrderBilling();}






}
