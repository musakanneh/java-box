package com.javabox.projects.emailApplication;

public class Name {
    public static String fullName(String firstName, String lastName) {
        return Validation.nullStringCheck(firstName) + " " + Validation.nullStringCheck(lastName);
    }
}
