package algorytmyZbiorowDanych.zajecia19_03;

import algorytmyZbiorowDanych.zajecia19_03.zadanie1.Element;
import algorytmyZbiorowDanych.zajecia19_03.zadanie1.MyStack;

import java.util.Stack;

public class StosZadanie1Main {
    public static void main(String[] args) {
        Element firstElement = new Element(1);
        Element secondElement = new Element(2);
        Element thirdlement = new Element(3);
        Element fourtsElement = new Element(4);

        MyStack stack = new MyStack();
        stack.push(firstElement);
        stack.push(secondElement);
        stack.push(thirdlement);

        Element last = stack.pop();
        stack.pop();


        Stack<Integer> javaStack = new Stack<Integer>();
        javaStack.push(1);
        javaStack.push(2);
        javaStack.push(3);

    }
}
