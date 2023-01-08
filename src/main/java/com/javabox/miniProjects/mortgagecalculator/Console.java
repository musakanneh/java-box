package com.javabox.miniProjects.mortgagecalculator;
import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

    // overload method
    public static double readNumber() {
        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max) break;
            System.out.println("Enter a value between: " + (int)min + " and " + (int)max);
        }

        return value;
    }
}