package com.javabox.projects.emailApplication;

public class EmailInfo {
    public static String emailInfo() {
        int mailboxCapacity = 10;
        String companySuffix = "company.com";
        String email = Validation.nullStringCheck(Name.fullName("Musa", "Kanneh")).toLowerCase() + "@" +
                Department.setDepartment() + "." + companySuffix.toLowerCase();

        return ("\nDisplay Name: " + Name.fullName("Musa", "Kanneh") + "\n" +
                "Company Email: " + email + "\n" +
                "Mailbox Capacity: " + mailboxCapacity + " mb");
    }
}
