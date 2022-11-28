package com.javabox.exceptions;
import java.io.IOException;

public class Account {
    private float balance;

    public void deposit (float value) throws IOException {
        if (value <= 0) {
            throw new IOException();
        }
    }

    public void withdraw(float value) throws InsufficientFundsException {
        if (value > balance) {
            throw new InsufficientFundsException();
        }
    }

    public float viewAccountBalance(float value) throws NoAccountException {
        if (value <= balance) {
            throw new NoAccountException();
        }
        return value;
    }
}