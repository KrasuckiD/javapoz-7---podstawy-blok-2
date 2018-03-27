package algorytmyZbiorowDanych.zajecia22_03.zadanie5;


public class WyznaczenieNWD {
    public static void main(String[] args) {
        int number1 = 32;
        int number2 = 64;

        System.out.println(commonDivider(number1, number2));


    }

    private static int commonDivider(int number1, int number2) {
        while (number1 != number2) {
            if (number1 > number2) {
                number1 -= number2;
            } else {
                number2 -= number1;
            }

        }
        return number1;
    }
}
