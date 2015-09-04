/*An item has a name and cost and checks if it is imported or has sales tax*/
package com.thoughtworks.baselineproblem;

public class Item {

    private String name;
    private double cost;

    public Item(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public boolean isExemptedFromSalesTax() {
        if(name.equals("book") || name.equals("chocolate bar") || name.equals("box of chocolates") || name.equals("chocolates")
                || name.equals("headache pills"))
            return true;
        else
            return false;
    }

    public double salesTax() {
        if(isExemptedFromSalesTax())
            return 0.0;
        else
            return Math.ceil((0.10 * cost) * 20.0) / 20.0;
    }
}
