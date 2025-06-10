package com.abon.framework.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenshotUtils {

    public static void captureScreenshot(String testName) {
        try {
            WebDriver driver = DriverManager.getDriver();
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("screenshots/" + testName + ".png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
