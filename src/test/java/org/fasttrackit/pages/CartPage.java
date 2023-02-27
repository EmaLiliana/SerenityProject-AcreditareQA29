package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends BasePage {
    @FindBy(css = ".cart-control .woocommerce-Price-amount")
    private WebElementFacade viewCartButton;
    @FindBy(css = ".wc-proceed-to-checkout a")
    private WebElementFacade proceedToCheckoutButton;
    @FindBy(css = ".product-price .woocommerce-Price-amount")
    private WebElementFacade priceCart;
    @FindBy(css = "tr:nth-child(2) .product-price>span")
    private WebElementFacade secondPriceCart;
    @FindBy(css = ".cart-subtotal th")
    private WebElementFacade subtotalCart;
    @FindBy(css = ".shipping td span")
    private WebElementFacade shippingTax;
    @FindBy(css = ".order-total td strong>span ")
    private WebElementFacade totalCart;

    public void clickOnViewCartButton() {
        clickOn(viewCartButton);
    }

    public void clickOnProceedToCheckout() {
        clickOn(proceedToCheckoutButton);
    }

    public boolean verifyTotalPrice() {
        if (priceCart.getValue() + secondPriceCart.getValue() == subtotalCart.getValue()
                && subtotalCart.getValue() + shippingTax.getValue() == totalCart.getValue()) {
            return true;
        }

        return false;
    }
}
