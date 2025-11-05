package com.minthant.dsa.sorting;

import com.minthant.dsa.util.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortingTest {

    Util util = new Util();
//    SortingAlgorithm sortingAlgo = new BubbleSort();
    SortingAlgorithm sortingAlgo = new SelectionSort();
    @Test
    public void testSort(){

        int [] arr = {5,2,10,0,25,1};
        sortingAlgo.sort(arr);

        Assertions.assertTrue(util.isArray(arr));

    }

    @Test
    public void testWithEmptyArray(){

        int [] arr = {};
        sortingAlgo.sort(arr);

        Assertions.assertTrue(util.isArray(arr));

    }

    @Test
    public void testWithSingleArrayElement(){

        int [] arr = {1};
        sortingAlgo.sort(arr);

        Assertions.assertTrue(util.isArray(arr));

    }

    @Test
    public void testWithDoubleElement(){

        int [] arr = {7,2};
        sortingAlgo.sort(arr);

        Assertions.assertTrue(util.isArray(arr));
    }

    @Test
    public void testWithRandomData(){

        int [] arr = util.createRandomArray(50);
        sortingAlgo.sort(arr);

        Assertions.assertTrue(util.isArray(arr));

    }

}
