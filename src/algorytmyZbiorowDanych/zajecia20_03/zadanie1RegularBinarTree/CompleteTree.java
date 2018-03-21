package algorytmyZbiorowDanych.zajecia20_03.zadanie1RegularBinarTree;

public class CompleteTree {
        private Node[] values;
        private int count = 0;

        public CompleteTree(int size) {
            values = new Node[size];
        }

        public void add(Node node) {
            values[count] = node;
            node.setIndex(count);
            count++;
        }

        public Node getLeft(Node node) {
            int leftIndex = node.getIndex() * 2 + 1;
            if (leftIndex < values.length)
                return values[leftIndex];
            return null;
        }

        public Node getRight(Node node) {
            int rightIndex = node.getIndex() * 2 + 2;
            if (rightIndex < values.length)
                return values[rightIndex];
            return null;
        }

        public Node getParent(Node node) {
            int parentIndex = Math.floorDiv(node.getIndex() - 1, 2);
            if (node.getIndex() == 0) {
                return null;
            }
            return values[parentIndex];
        }
    public void printPreOrder(Node node){
        System.out.println(node.toString() + " ");
        if (getLeft(node) != null){
            printPreOrder(getLeft(node));
        }
        if (getRight(node) != null){
            printPreOrder(getRight(node));
        }
    }

        public void printInOrder(Node node){
            if (getLeft(node) != null){
                printInOrder(getLeft(node));
            }
            System.out.println(node.toString() + " ");
            if (getRight(node) != null){
                printInOrder(getRight(node));
            }
        }

    public void printPostOrder(Node node){
        if (getLeft(node) != null){
            printPostOrder(getLeft(node));
        }
        if (getRight(node) != null){
            printPostOrder(getRight(node));
        }
        System.out.println(node.toString() + " ");
    }
    }

