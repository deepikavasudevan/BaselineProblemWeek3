package com.thoughtworks.baselineproblem;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ItemTest {

    @Test
    public void shouldBeExemptedFromSalesTaxIfBook() {
        Item item = new Item("book", 12.49);

        assertTrue(item.isExemptedFromSalesTax());
    }

    @Test
    public void shouldNotBeExemptedFromSalesTaxIfMusicCd() {
        Item item = new Item("music CD", 14.99);

        assertFalse(item.isExemptedFromSalesTax());
    }

    @Test
    public void shouldBeExemptedFromSalesTaxIfChocolateBar() {
        Item item = new Item("chocolate bar", 0.85);

        assertTrue(item.isExemptedFromSalesTax());
    }

    @Test
    public void shouldBeExemptedFromSalesTaxIfBarOfChocolates() {
        Item item = new Item("box of chocolates", 10.00);

        assertTrue(item.isExemptedFromSalesTax());
    }

    @Test
    public void shouldBeExemptedFromSalesTaxIfHeadachePills() {
        Item item = new Item("headache pills", 9.75);

        assertTrue(item.isExemptedFromSalesTax());
    }

    @Test
    public void shouldBeExemptedFromSalesTaxIfChocolates() {
        Item item = new Item("chocolates", 11.25);

        assertTrue(item.isExemptedFromSalesTax());
    }

    @Test
    public void shouldHaveSalesTaxIfItIsNotExemptedFromSalesTax() {
        Item item = new Item("bottle of perfume", 18.99);

        assertEquals(1.90, item.salesTax(), 0.0001);
    }

    @Test
    public void shouldHaveNoSalesTaxIfItIsExemptedFromSalesTax() {
        Item item = new Item("chocolates", 11.25);

        assertEquals(0.0, item.salesTax(), 0.001);
    }
}