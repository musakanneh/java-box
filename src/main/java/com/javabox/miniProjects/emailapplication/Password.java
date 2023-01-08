package com.javabox.miniProjects.emailapplication;

public class Password {
    public static String generateRandomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@£$%";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int randomPassword = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomPassword);
        }
        return new String(password);
    }
}
