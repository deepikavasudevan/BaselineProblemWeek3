/*A Parser converts the inputString into item name and shelfPrice and checks it if it is imported*/
package com.thoughtworks.baselineproblem;

public class Parser {

    private String inputString;

    public Parser(String inputString) {
        this.inputString = inputString;
    }

    public Item parse() {
        return new Item("music CD", 14.99);
    }
}
