package algorytmyZbiorowDanych.zajecia29_03;

import java.util.Arrays;

public class CamelCase {
    // returns "theStealthWarrior"
//    toCamelCase("the-stealth-warrior")

    // returns "TheStealthWarrior"
//    toCamelCase("The_Stealth_Warrior")
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
        System.out.println(camelize("the-stealth-warrior"));
        System.out.println(camelize("The_Stealth_Warrior"));

    }

    private static String toCamelCase(String input) {
        String[] sentense = input.split("_|-");
        String result = "";
        for (int i = 1; i < sentense.length; i++) {
            char[] tmp = sentense[i].toCharArray();
            if (tmp[0] >= 'a' && tmp[0] <= 'z') {
                tmp[0] -= 32;
            }
            sentense[i] = String.valueOf(tmp);

        }
        for (String string : sentense){
            result += string;
        }

        return result;
    }

    private static String camelize(String text) {

        StringBuilder resultBuilder = new StringBuilder();



        Arrays.stream(text.split("[-_]"))

                .forEach(word -> resultBuilder

                        .append(word.substring(0, 1).toUpperCase())

                        .append(word, 1, word.length())

                );



        return resultBuilder.toString();

    }
}
