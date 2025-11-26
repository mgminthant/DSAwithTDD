package com.minthant.dsa.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DelimiterTest {
    Delimiter delimiter = new Delimiter();

    @ParameterizedTest
    @CsvSource(value = {
            "(20*5), true",
            "' ', true",
            "(20*5, false",
            "[(20*5) * {2+5}], true",
            "(}, false"
    })

    public void testDelimiter(String input, boolean expected){
        boolean result = delimiter.isValid(input);
        Assertions.assertEquals(expected,result);
    }
}
