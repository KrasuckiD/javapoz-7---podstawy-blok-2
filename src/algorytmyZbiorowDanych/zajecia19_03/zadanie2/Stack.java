package algorytmyZbiorowDanych.zajecia19_03.zadanie2;

import algorytmyZbiorowDanych.zajecia19_03.zadanie1.Element;
import algorytmyZbiorowDanych.zajecia19_03.zadanie1.MyStack;

public class Stack {
    public static void main(String[] args) {
        printDecimalToBinary(6);
        printDecimalToBinary(15);
    }

private static void printDecimalToBinary (int number){
    MyStack stack = new MyStack();
    while (number > 0){
        stack.push(new Element(number % 2));
        number = number /2;
    }
    while (!stack.isEmpty()){
        System.out.println(stack.pop().toString() + " ");
    }
}
}
