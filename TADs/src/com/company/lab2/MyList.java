package com.company.lab2;

public class MyList<T> implements MyCollections<T> {
    private int count = 0;
    private Node<T> first;

    private Node getLast(Node temp){
        while (temp.hasNext()) {
            temp = temp.getNext();
        }
        return temp;
    }

    public void add(T element){
        Node newNode = new Node(element);

        if (this.isEmpty()) {
            first = newNode;
        } else {
            Node last = this.getLast(this.first);
            last.setNext(newNode);
        }
        this.count ++;
    }

    @Override
    public void remove(T element) {
        if (count > 0) count --;
    }

    @Override
    public int length() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return this.length() == 0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[ ");
        Node temp = this.first;

        for (int i = 0; i < this.length(); i++) {
            str.append(temp + " ");
            temp = temp.getNext();
        }
        str.append("]");
        return String.join(",", str.toString());
    }
}
