package com.company.lab2;

public class BinaryNode<T> {
    private T value;
    private Node<T> leftChild;
    private Node<T> rightChild;

    public BinaryNode(T value) {
        this.value = value;
    }

    public boolean isLeaf() {
        return leftChild == null && rightChild == null;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
