package com.javabox.exceptions;
import java.io.IOException;

public class Account {
    private float ACCOUNT_BALANCE;

    public void deposit (float value) throws IOException {
        if (value <= 0) {
            throw new IOException();
        }
    }

    public void withdraw(float value) throws AccountException {
        if (value > ACCOUNT_BALANCE) {
            // use chaining exception to throw an acc exception
            // that is caused by an insufficient funds exception
            throw new AccountException(new InsufficientFundsException());
        }
    }

    public float viewAccountBalance(float value) throws NoAccountException {
        if (value <= ACCOUNT_BALANCE) {
            throw new NoAccountException();
        }
        return value;
    }
}