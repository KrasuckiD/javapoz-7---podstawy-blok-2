package algorytmyZbiorowDanych.zajecia19_03.zadanie3;

import javax.xml.bind.Element;

public class ElementyKolejkiFIFO<T> {
    private T next;
    private T data;

    public ElementyKolejkiFIFO(T data) {
        this.data = data;
    }

    public T getNext() {
        return next;
    }

    public void setNext(T next) {
        this.next = next;
    }
}
