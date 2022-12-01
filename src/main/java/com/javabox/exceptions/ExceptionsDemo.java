package com.javabox.exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsDemo {

    public static void show(){
        Account account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException ex) {
            var cause = ex.getCause();
            System.out.println(cause.getCause());
        }
        fileReader();
    };

    public static void fileReader() {
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