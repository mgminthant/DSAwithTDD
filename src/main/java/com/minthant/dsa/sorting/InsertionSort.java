package com.minthant.dsa.sorting;

public class InsertionSort implements SortingAlgorithm{

    public void sort(int [] arr ){

        for( int i = 1 ; i <= arr.length-1; i++ ){
            int j = i;

            while ( j >= 1 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }

    }

}
