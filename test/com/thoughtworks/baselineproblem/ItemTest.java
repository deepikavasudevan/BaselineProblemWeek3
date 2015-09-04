package com.thoughtworks.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ItemTest {

    @Test
    public void foo() {
        Item item = new Item("book", 12.49);

        assertTrue(item.isExemptedFromSalesTax());
    }
}