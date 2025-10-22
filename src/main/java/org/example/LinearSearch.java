package org.example;

public class LinearSearch {
    public int search(int[] array, int item) {
        for(int i = 0; i < array.length; ++i) {
            if (array[i] == item) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 10};
        LinearSearch ls = new LinearSearch();
        int result = ls.search(input, 1);
        System.out.println("Search Result" + result);
    }
}
