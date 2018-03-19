package algorytmyZbiorowDanych.zajecia19_03.zadanie3;

import javax.xml.bind.Element;

public class KolejkaFIFO {
    public static void main(String[] args) {

    }

    private ElementyKolejkiFIFO head;
    private ElementyKolejkiFIFO tail;
    private int count;

    private boolean isEmpty (){
        return head == null;
    }

//    private void add (ElementyKolejkiFIFO elementToAdd){
//        if (isEmpty()){
//            head = elementToAdd;
//            tail= elementToAdd;
//        } else  {
//            ElementyKolejkiFIFO currentLast = tail;
//            currentLast.setNext(elementToAdd);
//            tail = elementToAdd;
//        }
//        count++;
//    }
//
//    public Element remove(){
//        ElementyKolejkiFIFO currentHead = this.head;
//        if (currentHead == null){
//            return null;
//        }
//        this.tail = currentHead.getNext();
//        count--;
//    }
}
