package com.javabox.exceptions;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super ("Insufficient funds exceptions");
    }

    public InsufficientFundsException(String message) {
        super (message);
    }
}
