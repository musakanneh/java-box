package com.javabox.projects.emailApplication;

public class Validation {

    static String nullStringCheck(String value) {
        if (value.length() > 0) {
            if (value.equals(" ") || value.equals("_")) {
                throw new IllegalArgumentException("Invalid first or last name");
            }
        }

        return value;
    }
}
