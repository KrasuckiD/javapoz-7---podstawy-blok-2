package algorytmyZbiorowDanych.zajecia21_03.zadanie4BubleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] array = {3, 4, 5, 2, 1,6,8,9,1,7,8,5,6};
        bubbleSort(array);
        System.out.println(Arrays.asList(array));

    }

    public static void bubbleSort(Integer[] array) {
        boolean isSorted = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    isSorted = false;
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
            if (isSorted) {
                break;
            }
            isSorted = true;
        }
//        for (int j = 0; j < array.length - 1; j++) {
//            if (array[j] > array[j + 1]) {
//                int temp = array[j + 1];
//                array[j + 1] = array[j];
//                array[j] = temp;
//                bubbleSort(array);
//            }
//        }

    }
}
