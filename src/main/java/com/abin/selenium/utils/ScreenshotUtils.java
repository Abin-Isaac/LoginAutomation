package com.abin.selenium.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.abin.selenium.utils.DriverManager;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class ScreenshotUtils {

    public static void captureScreenshot(String testName) {
        WebDriver driver = DriverManager.getDriver();

        // Create a timestamp for uniqueness
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // Take screenshot and create file object
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("screenshots/" + testName + "_" + timestamp + ".png");

        // Save the screenshot to the target folder
        try {
            FileUtils.copyFile(src, dest);
            System.out.println("📸 Screenshot captured: " + dest.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("❌ Failed to save screenshot.");
            e.printStackTrace();
        }
    }
}
