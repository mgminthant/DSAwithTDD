package com.minthant.dsa.sorting;

import com.minthant.dsa.util.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortingTest {

    Util util = new Util();
//    SortingAlgorithm sortingAlgo = new BubbleSort();
//    SortingAlgorithm sortingAlgo = new SelectionSort();
    SortingAlgorithm sortingAlgo = new InsertionSort();
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
    public void testWithSameElements(){

        int [] arr = {1,1,1,1,1};
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

        int [] arr = util.createRandomArray(10);

        System.out.println("input"+ util.arrayToString(arr));
        sortingAlgo.sort(arr);
        System.out.println("output"+ util.arrayToString(arr));

        Assertions.assertTrue(util.isArray(arr));

    }

}
