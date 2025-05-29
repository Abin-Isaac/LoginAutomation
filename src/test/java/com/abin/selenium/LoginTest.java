package com.abin.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

public class LoginTest {

    WebDriver driver; // ✅ Declare this variable at class level

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup(); // ✅ chromedriver setup
        driver = new ChromeDriver();             // ✅ initialize the driver
    }

    @Test
    public void testLogin() {
        driver.get("https://facebook.com");
        try {
            Thread.sleep(5000); // ⏳ Wait to visually confirm the browser opens
        } catch (InterruptedException e) {
            e.printStackTrace(); // Optional: log or handle it as needed
        }

        // Add your test steps here
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
