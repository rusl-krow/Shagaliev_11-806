package com.company;

public interface IntList {
    void add(int one, int two);
    int get(int index);
    int size();
    String contains(int value);
    void remove(int index);
    void sort();
    int[] toArray();
    void addAll(IntList list, int index);
}