package algorytmyZbiorowDanych.zajecia19_03.zadanie4Rekurencja;

public class FibonacciRekurencyjnie {
    public static void main(String[] args) {
        System.out.println(fibonacci(15));

    }


    private static int fibonacci (int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }

        return fibonacci(n -1) +fibonacci(n -2);
    }
}
