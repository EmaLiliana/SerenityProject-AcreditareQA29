package org.fasttrackit.features;

import org.junit.Test;

public class ProductsListTest extends BaseTest{
    @Test
    public void verifyPriceIsAscendingTest(){
        productSteps.sortPriceAscending();
        productSteps.productsAreSortedByPriceAscending();

    }
}
