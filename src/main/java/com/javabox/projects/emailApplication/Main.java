package com.javabox.projects.emailApplication;

public class Main {
    public static void main(String[] args) {
        String employeeName = Name.fullName("Musa", "Kanneh");
        System.out.println(employeeName);

        String department = Department.setDepartment();
        System.out.println("Your department is: " + department);

        String password = Password.generateRandomPassword(10);
        System.out.println("Your password is: " + password);

        String emailDetails = EmailInfo.emailInfo();
        System.out.println("Your email Info:" + emailDetails);
    }
}