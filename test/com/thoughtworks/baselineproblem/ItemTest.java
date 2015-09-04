package com.thoughtworks.baselineproblem;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
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
}