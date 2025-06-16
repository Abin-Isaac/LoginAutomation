package com.abin.selenium.listeners;  // ✅ Adjusted to match your folder structure

import com.abin.selenium.utils.ScreenshotUtils;  // ✅ Corrected import path
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        ScreenshotUtils.captureScreenshot(result.getName());
    }
}
