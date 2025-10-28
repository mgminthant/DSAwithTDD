package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add numbers")
    void add() {
        assertEquals(9,Calculator.add(2,2,5));
    }

    @Test
    @DisplayName("Multiply numbers")
    void multiply() {
        assertEquals(10,Calculator.multiply(2,1,5));
        assertAll(()-> assertEquals(5,Calculator.multiply(5,1)),
                ()->assertEquals(10,Calculator.multiply(2,5,1)));
    }
}