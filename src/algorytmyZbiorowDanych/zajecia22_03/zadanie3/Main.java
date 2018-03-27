package algorytmyZbiorowDanych.zajecia22_03.zadanie3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] inputArray = {"c", "cb", "ca", "a", "Bc", "bcaa", "abc", "ab"};
        insertSortString(inputArray);
        System.out.println(Arrays.asList(inputArray));
    }

    public static void insertSortString(String[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                char[] chars = array[j].toLowerCase().toCharArray();
                char[] chars2 = array[j - 1].toLowerCase().toCharArray();
                int k = 0;
                do {
                    if (chars[k] < chars2[k]) {
                        String temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                        break;
                    } else if (chars[k] == chars2[k]) {
                        if (k == Math.min(chars.length, chars2.length) - 1 && chars.length < chars2.length) {
                            String temp = array[j - 1];
                            array[j - 1] = array[j];
                            array[j] = temp;
                            break;
                        }
                        k++;
                    } else {
                        break;
                    }
                }
                while (k < Math.min(chars.length, chars2.length));

            }
        }
    }
}
