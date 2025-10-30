package com.minthant.dsa.sorting;

import com.minthant.dsa.util.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraySortUtilTest {
    Util util = new Util();
    @Test
    public void testIsArraySortHappyCase(){
        int [] arr = {1,3,5,6,7};
        Assertions.assertTrue(util.isArray(arr));
    }

    @Test
    public void testIsArraySortUnHappyCase(){
        int [] arr = {3,1,5,6,7};
        Assertions.assertFalse(util.isArray(arr));
    }

    @Test
    public void testEmptyArray(){
        int [] arr = {};
        Assertions.assertTrue(util.isArray(arr));
    }

    @Test
    public void testOneElement(){
        int [] arr = {7};
        Assertions.assertTrue(util.isArray(arr));
    }
}
