package com.javabox.projects.emailApplication;

public class Main {
    public static void main(String[] args) {
        String employeeName = Name.fullName();

        String department = Department.setDepartment();

        System.out.println("===EMPLOYEE DETAILS===");
        System.out.println("DEPARTMENT: " + department);

        String password = Password.generateRandomPassword(10);
        System.out.println("PASSWORD: " + password);

        String emailDetails = EmailInfo.emailInfo();
        System.out.println("EMPLOYEE: " + employeeName);
        System.out.println("EMAIL INFO: " + emailDetails);
    }
}