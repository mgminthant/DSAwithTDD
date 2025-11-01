package com.minthant.dsa.util;

import java.util.Random;

public class Util {

    public boolean isArray(int [] arr){

        for(int i = 0; i < arr.length - 1; i++ ){

            if(arr[i] > arr[i+1]){
                return false;
            }

        }

        return true;

    }

    public int[] createRandomArray (int arraySize){

        int [] arr = new int[arraySize];

        Random random = new Random();

        for(int i = 0; i < arr.length; i++){

            arr[i] = random.nextInt(400);

        }

        return arr;
    }

}
