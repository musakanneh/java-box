package com.javabox.miniProjects.emailApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void testGenerateRandomPassword() {
        int res = Password.generateRandomPassword(10).length();
        assertEquals(res, Password.generateRandomPassword(10));
    }
}