package com.javabox.dsa.array;
import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;
    private int ITEM_NOT_FOUND = -1;

    public Array(int length) {
        items = new int[length];
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
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Cannot perform operation");
        }

        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    // Extend the Array class and add a new method to
    // insert an item at a given index: public void
    // insertAt(int item, int index)
    public void insertAt(int item, int index) {
        items[index] = item;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return ITEM_NOT_FOUND;
    }

    public int max() {
        int maxNumber = count;
        for (int i = 0; i < count; i++) {
            if (items[i] > maxNumber) {
                maxNumber = items[i];
                return maxNumber;
            }
        }
        return ITEM_NOT_FOUND;
    }

    // Extend the Array class and add a method to return the
    // common items in this array and another array.
    public void intersect() {

    }

    // Extend the Array class and add a method to reverse the array.
    // For example, if the array includes [1, 2, 3, 4],
    // after reversing and printing it, we should see [4, 3, 2, 1].
    public void reverse() {
        int left = items[0];
        int right = items[items.length - 1];
        for (int i = 0; i < count; i--) {
            while (left < right) {
                int temp;
                temp = left;
                left = right;
                right = temp;
            }
            left++;
            right--;
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}