package com.minthant.dsa.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ReverseStringTest {
    @Test
    public void testReverse () {
        ReverseString reverse = new ReverseString();
        assertEquals("water", reverse.reverseString("retaw"));
    }

    @Test
    public void testEmptyInput () {
        ReverseString reverse = new ReverseString();
        assertEquals("", reverse.reverseString(""));
    }
}
