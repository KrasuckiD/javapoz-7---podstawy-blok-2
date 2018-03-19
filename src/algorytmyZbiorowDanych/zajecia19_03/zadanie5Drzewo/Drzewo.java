package algorytmyZbiorowDanych.zajecia19_03.zadanie5Drzewo;

import java.util.List;

public class Drzewo<T> {
    Drzewo parent;
    List<Drzewo> children;
    T data;
    Drzewo left;
    Drzewo right;

    public Drzewo( T data) {
        this.data = data;
    }

    public void setParent(Drzewo parent) {
        this.parent = parent;
    }

    public void addChildLeftChild(Drzewo drzewo){

    }

    public T getData() {
        return data;
    }
}
