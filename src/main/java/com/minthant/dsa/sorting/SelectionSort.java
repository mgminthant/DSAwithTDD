package com.minthant.dsa.sorting;

public class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort( int [] arr ){

        int minIndex = 0;

        for ( int i = 0; i < arr.length; i++ ) {

            for ( int j = i; j < arr.length-1; j++) {

                if (arr[j] < arr[j+1]) {
                    minIndex = j;
                }

                int temp = arr[minIndex];
                arr[i] = temp;
                arr[j+1] = arr[j];
        }
    }

    }
}
