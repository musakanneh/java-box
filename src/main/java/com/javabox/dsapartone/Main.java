package com.javabox.dsapartone;

import com.javabox.dsa.Array;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(10);
        numbers.insert(10);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);
        numbers.insert(60);
        numbers.insert(70);
        numbers.insert(80);
        numbers.insert(90);
        numbers.insert(91);
        System.out.println(numbers.indexOf(30));
        System.out.println(numbers.indexOf(30));
        System.out.println("max " + numbers.max());
        System.out.println(numbers.reverse());
        numbers.print();
    }
}
