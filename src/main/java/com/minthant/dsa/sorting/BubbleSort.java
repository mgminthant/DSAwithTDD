package com.minthant.dsa.sorting;

import com.minthant.dsa.util.Util;

public class BubbleSort implements SortingAlgorithm {

    @Override
    public void sort(int [] arr){

        for(int i = 0; i < arr.length; i++){

            for (int j = 0; j < arr.length-i-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];

                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }

    }
}
