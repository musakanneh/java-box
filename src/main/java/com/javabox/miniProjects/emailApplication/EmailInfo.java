package com.javabox.miniProjects.emailApplication;

public class EmailInfo {
    public static String emailInfo() {
        int mailboxCapacity = 10;
        String companySuffix = "company.com";
        String email = Validation.nullStringCheck(Name.extractUsername()).toLowerCase() + "@" +
               companySuffix.toLowerCase();

        return ("\nDisplay Name: " + Name.fullName() + "\n" +
                "Company Email: " + email + "\n" +
                "Mailbox Capacity: " + mailboxCapacity + " mb");
    }
}
