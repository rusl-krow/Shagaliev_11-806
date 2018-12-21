package com.company;

public interface LinkedListInterface<T> {

    void add(T element);

    void add(T element, int position);

    Node<T> get(int position);

    int size();
    boolean contains(T element);
    void remove(int position);
    void addAll(LinkedListInterface<T> elements);
    void addAll(LinkedListInterface<T> elements, int index);
}