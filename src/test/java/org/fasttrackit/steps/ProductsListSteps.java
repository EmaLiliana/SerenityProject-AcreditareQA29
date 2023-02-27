package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProductsListSteps extends BaseSteps {
    @Step
    public void clickShopItemButton(){homePage.clickShopButton();}
    @Step
    public void orderProductByPrice(){
        productPage.clickOnDropdown();
        productPage.clickOnSortByDropdown();
    }
    @Step
    public void productsAreSortedByPriceAscending(){
        Assert.assertTrue("The price is not sorted ascending!",productPage.isPriceAscending());
    }
    @Step
    public void sortPriceAscending(){
        clickShopItemButton();
        orderProductByPrice();

    }
}
