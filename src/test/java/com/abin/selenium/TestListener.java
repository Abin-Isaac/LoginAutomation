package com.abon.framework.listeners;

import com.abon.framework.utils.ScreenshotUtils;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        ScreenshotUtils.captureScreenshot(result.getName());
    }
}
