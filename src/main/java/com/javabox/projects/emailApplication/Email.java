package com.javabox.projects.emailApplication;
import java.util.Scanner;

public class Email {
    /***
     * TODO: Improve code, write unit tests
     */
    private final String firstName;
    private final String lastName;
    private String password;
    private String department;
    private  String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "company.com";

    private String SALES = "sales";
    private String DEVELOPMENT = "Development";
    private String ACCOUNTING = "Accounting";

    public Email (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = generateRandomPassword(10);
        System.out.println("Password is: " + this.password);
        email = nullStringCheck(firstName).toLowerCase() +
                nullStringCheck(lastName).toLowerCase() + "@" +
                this.department + "." + this.companySuffix;
    }

    private String nullStringCheck(String value) {
        if (value.length() > 0) {
            if (value.equals(" ") || value.equals("_")) {
                throw new IllegalArgumentException("Invalid input");
            }
        }
        return value;
    }

    public String setDepartment() {
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

    public String generateRandomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@£$%";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int randomPassword = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomPassword);
        }
        return new String(password);
    }

    public void setMailBoxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmailAddress(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmailAddress() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return ("\nDisplay Name: " + firstName + " " + lastName + "\n" +
                "Company Email: " + email + "\n" +
                "Mailbox capacity: " + mailboxCapacity + " mb");
    }
}
