package com.javabox.miniProjects.emailApplication;

public class Name {
    private static final String firstName = "Musa";
    private static final String lastName = "Kanneh";

    static String firstNameToLoserCase = firstName.toLowerCase();
    static String lastNameToLoserCase = lastName.toLowerCase();

    public static String fullName() {
        return Validation.nullStringCheck(firstName) + " " +
                Validation.nullStringCheck(lastName);
    }

    public static String extractUsername() {
        return firstNameToLoserCase + lastNameToLoserCase;
    }
}
