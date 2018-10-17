package com.company.lab2;

public interface MyCollections<T> {
    void add(T element);
    void remove(T element);
    int length();
    boolean isEmpty();
}
