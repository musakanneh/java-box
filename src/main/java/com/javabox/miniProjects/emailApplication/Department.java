package com.javabox.miniProjects.emailApplication;

import java.util.Scanner;

public class Department {
    public static final String DEVELOPMENT = "Development";
    public static final String ACCOUNTING = "Accounting";
    public static final String SALES = "sales";

    public static String setDepartment() {
        System.out.println("Department Code:\n1 => Sales\n2 => Development\n3 => Accounting\n0 => none\nEnter Code: ");
        Scanner scanner = new Scanner(System.in);
        int departmentSelected =  scanner.nextInt();
        if (departmentSelected == 1) {
            return SALES;
        } else if (departmentSelected == 2) {
            return DEVELOPMENT;
        } else if (departmentSelected == 3) {
            return ACCOUNTING;
        } else {
            throw new IllegalArgumentException("Enter number b/w 1 & 3");
        }
    }
}
