package com.minthant.dsa.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DelimiterTest {
    @Test
    public void testHappyCase(){
        Delimiter delimiter = new Delimiter();
        boolean result = delimiter.isValid("(20*5)");
        Assertions.assertTrue(result);
    }

    @Test
    public void testUnHappyCase(){
        Delimiter delimiter = new Delimiter();
        boolean result = delimiter.isValid("(20*5");
        Assertions.assertFalse(result);
    }

    @Test
    public void testHappyCase2(){
        Delimiter delimiter = new Delimiter();
        boolean result = delimiter.isValid("[(20*5) * {2+5}]");
        Assertions.assertTrue(result);
    }

    @Test
    public void testEmpty(){
        Delimiter delimiter = new Delimiter();
        boolean result = delimiter.isValid("");
        Assertions.assertTrue(result);
    }

    @Test
    public void testUnHappyCase2(){
        Delimiter delimiter = new Delimiter();
        boolean result = delimiter.isValid("}");
        Assertions.assertFalse(result);
    }
}
