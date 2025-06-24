package com.abin.selenium.utils;

import com.abin.selenium.utils.DemoUtils;


public class DemoUtils {
    public static void pause(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Pause interrupted: " + e.getMessage());
        }
    }
}
