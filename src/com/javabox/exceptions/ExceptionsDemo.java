package com.javabox.exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show(){
        Account account = new Account();
        try {
            account.withdraw(10);
        } catch (InsufficientFundsException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            account.viewAccountBalance(100);
        } catch (NoAccountException ex) {
            System.out.println(ex.getMessage());
        }
        sayHello(null);
        fileReader();
    };

    public static void sayHello(String name) {
        try {
            System.out.println(name.toUpperCase());
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void fileReader() {
        /**
         * try-with-resources statement
         * return: nothing
         */
        try (
            var reader = new FileReader("file.txt");
            var writer = new FileWriter("...");
        ) {
            var value = reader.read();
        } catch (IOException ex) {
            System.out.println("Could not read data");
        }
    }
}
