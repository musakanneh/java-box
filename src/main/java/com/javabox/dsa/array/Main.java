package com.javabox.dsa.array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array number = new Array(100);
        number.insert(1);
        number.insert(2);
        number.insert(3);
        number.insert(4);
        number.insert(5);
        number.insertAt(99, 3);
        number.print();
    }
}
