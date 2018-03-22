package algorytmyZbiorowDanych.zajecia21_03.zadanie2;

public class Main {
    public static final int [] ZLOTY = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    public static final int [] GROSZE = {50, 20, 10, 5, 2, 1};

    public static void main(String[] args) {
        calc(888.88);
    }

    private static void calc(double num){
        int grosze = (int) (num * 100 - Math.floor(num) * 100);
        int zloty = (int) ((num * 100 - grosze) / 100);
       printNominals(zloty, ZLOTY, "zl");
       printNominals(grosze, GROSZE, "gr");
    }

    private static void printNominals(int value, int []nominalsArray, String koncowka) {
        int i = 0;
        while (value > 0){
            int count = Math.floorDiv(value, nominalsArray[i]);
            value -= count * nominalsArray[i];
            if (count > 0) {
                System.out.println(count + " x " + nominalsArray[i] + koncowka);
            }
            i++;
        }
    }
}
