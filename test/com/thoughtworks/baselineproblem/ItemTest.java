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
        Item item = new Item("music CD", 0.85);

        assertFalse(item.isExemptedFromSalesTax());
    }
}