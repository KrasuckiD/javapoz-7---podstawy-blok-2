package algorytmyZbiorowDanych.zajecia29_03;

import org.assertj.core.api.Assertions;

import java.util.Stack;

public class ReversePolishNotation {
    // https://pl.wikipedia.org/wiki/Odwrotna_notacja_polska
    //expression 5 1 2 + 4 * + 3 - (which is equivalent to 5 + ((1 + 2) * 4) - 3 in normal notation) should evaluate to 14
    public static void main(String[] args) {

        String exp = "5 1 2 + 4 * + 3 -";
        System.out.println(revert(exp));
    }


    private static double revert(String exp) {


        Stack<Double> stack = new Stack<>();

        String[] expArr = exp.split("\\s+");


        for (String e : expArr) {

            if (e.matches("\\d+")) {

                stack.push(Double.valueOf(e));

            } else {

                double a = stack.pop();

                double b = stack.pop();


                switch (e) {

                    case "+":

                        stack.push(b + a);

                        break;

                    case "-":

                        stack.push(b - a);

                        break;

                    case "*":

                        stack.push(b * a);

                        break;

                    case "/":

                        stack.push(b / a);

                        break;

                }

            }

        }


        return stack.pop();

    }
}
