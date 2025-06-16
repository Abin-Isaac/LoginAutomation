package com.abin.selenium.base;

import com.abin.selenium.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverManager.initDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Recommended implicit wait
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }

    // Utility method to send input text
    protected void sendKeys(By locator, String value) {
        WebElement element = driver.findElement(locator);
        element.clear(); // Optional but recommended
        element.sendKeys(value);
    }

    // Utility method to perform click action
    protected void click(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    // Utility method to get text from an element
    protected String getText(By locator) {
        WebElement element = driver.findElement(locator);
        return element.getText();
    }
}
