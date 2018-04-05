package algorytmyZbiorowDanych.zajecia28_03;
import org.assertj.core.api.Assertions;

import java.util.Arrays;

public class Zadanie1NextBiggerNumber {
    public static void main(String[] args) {
        Assertions.assertThat(nextBiggerNumber(12)).isEqualTo(21);
        Assertions.assertThat(nextBiggerNumber(513)).isEqualTo(531);
        Assertions.assertThat(nextBiggerNumber(2017)).isEqualTo(7210);
        Assertions.assertThat(nextBiggerNumber(9)).isEqualTo(-1);
        Assertions.assertThat(nextBiggerNumber(111)).isEqualTo(-1);
        Assertions.assertThat(nextBiggerNumber(531)).isEqualTo(-1);
    }

    private static int nextBiggerNumber(int number) {
        char[] chars = String.valueOf(number).toCharArray();
        char[] sortedArray = Arrays.copyOf(chars, chars.length);
        Arrays.sort(sortedArray);
        for (int i = sortedArray.length - 1; i >= 0 ; i--) {
            chars[i] = sortedArray[sortedArray.length - 1 - i];
        }
        int sortedNumber = Integer.parseInt(String.valueOf(chars));



        return (sortedNumber == number)? -1 : sortedNumber;
    }
}
