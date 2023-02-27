package org.fasttrackit.features;
import org.junit.Test;

public class SearchTest extends BaseTest{
    @Test
    public void searchForProductTest(){
        searchSteps.clickSearchIcon();
        searchSteps.searchForKeyword("hoodie");
        searchSteps.clickSearchButton();
        searchSteps.verifyProductIsInList("Hoodie with Zipper");
    }
}
