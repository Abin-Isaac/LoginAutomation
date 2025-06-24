package com.abin.selenium.tdd.automation.utils;

public class PasswordResetUtils {

    public static void pause(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("⏸️ Pause interrupted: " + e.getMessage());
        }
    }
}
