package com.javabox.advancedJava.exceptions;

public class NoAccountException extends Exception {
    public NoAccountException() {
        super("Account does not exists");
    }

    public NoAccountException(String message) {
        super(message);
    }
}
