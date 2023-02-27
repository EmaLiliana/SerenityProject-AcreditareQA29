package org.fasttrackit.steps;

import com.sun.xml.bind.v2.TODO;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.junit.Assert.*;

public class SearchSteps extends BaseSteps{
    @Step
    public void clickSearchIcon(){homePage.clickSearchIcon();}
    @Step
    public void searchForKeyword(String keyword){ homePage.setSearchField(keyword);}
    @Step
    public void clickSearchButton(){homePage.clickSearchButton();}
    @Step
    public void verifyProductIsInList(String productName){
       Assert.assertTrue("The product was not found in the list!",searchResultsPage.isProductInList(productName));
    }




}
