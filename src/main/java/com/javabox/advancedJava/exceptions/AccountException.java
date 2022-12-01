package com.javabox.advancedJava.exceptions;

public class AccountException extends Exception{
    public AccountException(Exception cause) {
        super (cause);
    }
}