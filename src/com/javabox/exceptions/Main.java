package com.javabox.exceptions;

public class Main {
    /**
     * TODO:
     * - look up stack trace
     * - type of exceptions:
     * - 1. checked exceptions: dev anticipates and handles
     * - 2. unchecked/ runtime exceptions:
     * - 3. errors
     */
    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        } catch (Throwable ex) {
            System.out.println("An unexpected error happened");
        }
    }
}
