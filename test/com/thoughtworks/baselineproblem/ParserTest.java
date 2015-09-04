package com.thoughtworks.baselineproblem;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class ParserTest {

    @Test
    public void shouldReturnAnItemOnParsingTheInputString() {
        Parser parser = new Parser("1 music CD at 14.99");

        assertTrue(parser.parse() instanceof Item);
    }
}