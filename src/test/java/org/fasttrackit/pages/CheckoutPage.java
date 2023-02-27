package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends BasePage{
    @FindBy(css="#billing_first_name")
    private WebElementFacade firstNameBilling;
    @FindBy(css="#billing_last_name")
    private WebElementFacade lastNameBilling;
    @FindBy(css="#select2-billing_country-container")
    private WebElementFacade countryFieldBilling;
    @FindBy(css="#select2-billing_country-result-mg0h-RO")
    private WebElementFacade selectCountryBilling;
    @FindBy(css="#billing_address_1.input-text")
    private WebElementFacade streetAddressBilling;
    @FindBy(css=".form-row #billing_city")
    private WebElementFacade cityBilling;
    @FindBy(css=".form-row #billing_postcode")
    private WebElementFacade postcodeBilling;
    @FindBy(css="#billing_phone")
    private WebElementFacade phoneBilling;
    @FindBy(css="#billing_email")
    private WebElementFacade emailBilling;
    @FindBy(css="#place_order")
    private WebElementFacade placeOrderButtonBilling;
    @FindBy(css=".woocommerce-notice")
    private WebElementFacade successMsgPlacedOrderBilling;

    public void setFirstNameBilling(String value){typeInto(firstNameBilling,value);}
    public void setLastNameBilling(String value){typeInto(lastNameBilling,value);}

    public void setStreetAddressBilling(String value){typeInto(streetAddressBilling, value);}
    public void setCityBilling(String value){typeInto(cityBilling,value);}
    public void setPostcodeBilling(String value){typeInto(postcodeBilling,value);}
    public void setPhoneBilling(String value){typeInto(phoneBilling,value);}
    public void setEmailBilling(String value){typeInto(emailBilling,value);}
    public void clickOnPlaceOrderButtonBilling(){clickOn(placeOrderButtonBilling);}
    public void verifySuccessMsgPlacedOrderBilling(){
        successMsgPlacedOrderBilling.getText().equalsIgnoreCase("Thank you. Your order has been received.");
    }
}
