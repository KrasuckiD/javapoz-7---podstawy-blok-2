package algorytmyZbiorowDanych.zajecia21_03.zadanie3;

public class Main {
    public static void main(String[] args) {
//leapYear(YEARS);

        przestepny(3);
        przestepny(2000);
        przestepny(2005);
        przestepny(2009);
    }

    private static void przestepny(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }


    }
}
