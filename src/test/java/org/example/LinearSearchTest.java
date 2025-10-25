package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {
    @Test
    public void testSearch()
    {
//        LinearSearch lsAlgo = new LinearSearch();
        int[]input = {1,2,3,4,10};

        int index = LinearSearch.search(input, 2);
        Assertions.assertEquals(1, index);
    }
}
