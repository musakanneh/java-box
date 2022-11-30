package com.javabox.generics;

public class Main {
    /***
     * Generics
     *
     * TODO:
     * 1. Boxing
     * 2. Unboxing
     * 3. Reference & primitive types
     * 4. Comparable
     * 5. Type erasure
     */
    public static void main(String[] args) {
        var list = new GenericList<Integer>();
        list.add(10);
    }
}
