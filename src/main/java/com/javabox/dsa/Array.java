package com.javabox.dsa;

public class Array {
    private int[] items;
    private int count;
    private int ITEM_NOT_FOUND = -1;

    public Array(int length) {
        items = new int[length];
    }

    public boolean inputIsValid(int value) {
        if (value < 0 || value >= count) {
            throw new IllegalArgumentException("cannot perform operation");
        }
        return false;
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int [count * 2];

            for (int i =  0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (inputIsValid(index)) {
            for (int i = index; i < count; i++) {
                items[i] = items[i + 1];
            }
            count--;
        }
    }

    public int indexOf(int searchableItem) {
        for (int i = 0; i < count; i++) {
            if (items[i] == searchableItem) {
                return i;
            }
        }
        return ITEM_NOT_FOUND;
    }

    public int max() {
        int maxNumber = 0;
        for (int i = 0; i < count; i++) {
            if (items[i] > maxNumber) {
                maxNumber = items[i];
                items[i]++;
            }
        }
        return maxNumber;
    }

    public int reverse() {
        return ITEM_NOT_FOUND;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}