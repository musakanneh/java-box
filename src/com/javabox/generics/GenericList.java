package com.javabox.generics;

public class GenericList<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
        System.out.println(item);
    }

    public T get(int index) {
        return items[index];
    }
}
