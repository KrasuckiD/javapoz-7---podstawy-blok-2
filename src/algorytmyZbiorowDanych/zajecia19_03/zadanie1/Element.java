package algorytmyZbiorowDanych.zajecia19_03.zadanie1;

public class Element {
   private Element next;
    private Integer data;

    public Element(Integer data) {
        this.data = data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
