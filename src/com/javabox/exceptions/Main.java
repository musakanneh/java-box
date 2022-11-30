package com.javabox.exceptions;

public class Main {
    /**
     * TODO:
     * - look up stack trace
     * - type of exceptions:
     * - 1. checked exceptions: dev anticipates and handles
     * - 2. unchecked/ runtime exceptions: occurs as  result dev errors
     * - 3. errors: represents external errors
     *
     * To:
     * 1. handle an exception: wrap code inside try-catch-blocks
     * 2. throw an exception: use the "throw" keyword
     * 3. create an exception: use a custom exception by
     * --sub-classing the exception/ run time exce class
     * 4.
     */
    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        } catch (Throwable ex) {
            System.out.println("An unexpected error happened");
        }
    }
}