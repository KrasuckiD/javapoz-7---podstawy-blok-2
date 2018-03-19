package algorytmyZbiorowDanych.list16_03;

public class MyList {
    Element head;
    Element tail;
    int count = 0;


    public void addElementFirst (Element firstElement){
        if (head == null){
            head = firstElement;
            tail = firstElement;
        } else {
            firstElement.setNext(head);
            head.setPrevious(firstElement);
            head = firstElement;
        }
        count++;
    }

    public void addElementLast (Element lastElement){
        if (tail == null){
            head = lastElement;
            tail = lastElement;
        } else {
            lastElement.setPrevious(tail);
            tail.setNext(lastElement);
            tail = lastElement;
        }
        count++;
    }

    public void remove (Element element){
        if (head != null){
            Element currentElement = head;
            while (currentElement !=null){
                if (currentElement.equals(element)){
                    Element previousElement = currentElement.getPrevious();
                    Element nextElement = currentElement.getNext();
                    if (previousElement != null) {
                        previousElement.setNext(nextElement);
                    } else {
                        head = nextElement;
                    }
                    if (nextElement != null) {
                        nextElement.setPrevious(previousElement);
                    } else {
                        tail = previousElement;
                    }
                    count --;
                    currentElement = null;
                } else {
                    currentElement = currentElement.getNext();
                }
            }
        }
    }
}
