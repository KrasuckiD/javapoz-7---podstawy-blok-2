package algorytmyZbiorowDanych.zajecia22_03.zadanie4;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arrayToSort = {6,5,8,2,1,3,4,8,9,5,3,3,5,8,4,2,8,6,5,7,5,2,3,4};
        sort(arrayToSort);
        System.out.println();
    }

    private static void sort(int[] arrayToSort) {
        int maxValue = arrayToSort[0];
        for (int i = 0; i < arrayToSort.length; i++) {
            if (arrayToSort[i] > maxValue){
                maxValue = arrayToSort[i];
            }
        }
        int [] newArray = new int[maxValue + 1];
        for (int i = 0; i < arrayToSort.length; i++) {
            newArray[arrayToSort[i]]++;
        }
        for (int i = 1; i < newArray.length; i++) {
            newArray[i] += newArray[i - 1];
        }
        int [] result = new int[arrayToSort.length];
        for (int i = arrayToSort.length - 1; i >= 0 ; i--) {
            int index = newArray[arrayToSort[i]];
            result[index - 1] = arrayToSort[i];
            newArray[arrayToSort[i]]--;
        }
        System.out.println(Arrays.toString(result));
    }

}
