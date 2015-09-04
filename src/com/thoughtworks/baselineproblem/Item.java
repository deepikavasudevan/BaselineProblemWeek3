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
        if(name.equals("book"))
            return true;
        else
            return false;
    }
}
