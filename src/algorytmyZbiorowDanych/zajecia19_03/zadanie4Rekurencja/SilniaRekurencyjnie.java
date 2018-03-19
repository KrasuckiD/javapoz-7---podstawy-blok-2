package algorytmyZbiorowDanych.zajecia19_03.zadanie4Rekurencja;

public class SilniaRekurencyjnie {
    public static void main(String[] args) {
        System.out.println(factorial(9));
    }

    private static int factorial(int number) {
        if (number == 1){
            return 1;
        }
        return number * factorial(number - 1);
    }
}
