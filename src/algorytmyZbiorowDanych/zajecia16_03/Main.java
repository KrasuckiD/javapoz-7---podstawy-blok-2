package algorytmyZbiorowDanych.zajecia16_03;

public class Main {
    // zaimplementuj liste dwukierunkowa, dodaj dane, sprawdz w debugerze wyglad i przejdz po elementach
    public static void main(String[] args) {
        Element first = new Element(1);
        Element second = new Element(2);
        Element third = new Element(3);
        Element fourth = new Element(4);
        MyList myList = new MyList();
        myList.addElementFirst(first);
        myList.addElementFirst(second);
        myList.addElementFirst(third);
        myList.addElementLast(fourth);




    }
}
