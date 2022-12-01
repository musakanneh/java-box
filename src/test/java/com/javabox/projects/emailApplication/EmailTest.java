package com.javabox.projects.emailApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {
    /***
     * TODO:
     * lookup: local var type inference
     */
    Email testCase = new Email("Musa", "Kanneh");
    @Test
    void testGenerateRandomPassword() {
        assertEquals(10, testCase.generateRandomPassword(10));
    }
}