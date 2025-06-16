package com.abin.selenium.regression;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import com.abin.selenium.base.BaseTest;
import com.abin.selenium.utils.DemoUtils;
import com.abin.selenium.utils.ScreenshotUtils;

public class RegressionLoginTest extends BaseTest {

    @Test(priority = 1)
    public void validLoginTest() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        DemoUtils.pause(1);

        sendKeys(By.name("username"), "Admin");
        DemoUtils.pause(1);

        sendKeys(By.name("password"), "admin123");
        DemoUtils.pause(1);

        click(By.tagName("button"));
        DemoUtils.pause(2);

        ScreenshotUtils.captureScreenshot("validLoginTest");

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dashboard"), "❌ Login failed or dashboard not reached.");
    }

    @Test(priority = 2)
    public void invalidLoginTest() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        DemoUtils.pause(1);

        sendKeys(By.name("username"), "invalidUser");
        DemoUtils.pause(1);

        sendKeys(By.name("password"), "wrongPass");
        DemoUtils.pause(1);

        click(By.tagName("button"));
        DemoUtils.pause(2);

        ScreenshotUtils.captureScreenshot("invalidLoginTest");

        String errorMsg = getText(By.className("oxd-alert-content-text"));
        Assert.assertTrue(errorMsg.contains("Invalid credentials"), "❌ Expected error message not shown.");
    }

    @Test(priority = 3)
    public void emptyLoginTest() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        DemoUtils.pause(1);

        click(By.tagName("button"));
        DemoUtils.pause(2);

        ScreenshotUtils.captureScreenshot("emptyLoginTest");

        String errorText = getText(By.className("oxd-input-field-error-message"));
        Assert.assertTrue(errorText.contains("Required"), "❌ 'Required' error not displayed for blank fields.");
    }

    @Test(priority = 4)
    public void usernameOnlyTest() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        DemoUtils.pause(1);

        sendKeys(By.name("username"), "Admin");
        DemoUtils.pause(1);

        click(By.tagName("button"));
        DemoUtils.pause(2);

        ScreenshotUtils.captureScreenshot("usernameOnlyTest");

        String errorText = getText(By.className("oxd-input-field-error-message"));
        Assert.assertTrue(errorText.contains("Required"), "❌ Password field did not show 'Required' error.");
    }

    @Test(priority = 5)
    public void passwordOnlyTest() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        DemoUtils.pause(1);

        sendKeys(By.name("password"), "admin123");
        DemoUtils.pause(1);

        click(By.tagName("button"));
        DemoUtils.pause(2);

        ScreenshotUtils.captureScreenshot("passwordOnlyTest");

        String errorText = getText(By.className("oxd-input-field-error-message"));
        Assert.assertTrue(errorText.contains("Required"), "❌ Username field did not show 'Required' error.");
    }
}
