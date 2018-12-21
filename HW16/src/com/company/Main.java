package com.company;



public class Main {

    public static void main(String[] args) {
        IntArrayList intList = new IntArrayList();
        intList.add(0);// Добавление элемента
        intList.add(4);// Добавление элемента
        intList.add(2);// Добавление элемента
        intList.add(8);// Добавление элемента
        intList.add(3);// Добавление элемента
        IntArrayList testArrayList = new IntArrayList();
        testArrayList.add(423);// Добавление элемента
        testArrayList.add(1);// Добавление элемента
        testArrayList.add(12);// Добавление элемента
        intList.add(-12, 2);// Добавление элемента под индексом 3
        intList.remove(0);// Удаление элемента
        intList.addAll(testArrayList, 5);// Добавление всех элементов 2 массива начиная с индекса 5
        //intList.sort(); // Сортировка массива

        System.out.println(intList.contains(1));// Проверка на содержание элемента в массиве
        System.out.println(intList.get(7));// Получение элемента под индексом 7
        System.out.println();

        for (int i = 0; i < intList.size(); ++i) {// Вывод массива
            System.out.println("Element " + i + " = " + intList.get(i));
        }
    }
}