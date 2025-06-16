package com.abin.test.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.*;
import com.abin.selenium.utils.DemoUtils;// ✅ Correct utility import

public class OrangeHRMLoginTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testLogin() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        DemoUtils.pause(1);

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        DemoUtils.pause(1);
        WebElement password = driver.findElement(By.name("password"));
        DemoUtils.pause(1);
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        DemoUtils.pause(1);

        username.sendKeys("Admin");
        DemoUtils.pause(1);
        password.sendKeys("admin123");
        DemoUtils.pause(1);
        loginButton.click();

        wait.until(ExpectedConditions.urlContains("dashboard"));
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dashboard"), "Login failed - Dashboard not loaded.");
    }

    @Test
    public void testInvalidLogin() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        DemoUtils.pause(1);

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        DemoUtils.pause(1);
        WebElement password = driver.findElement(By.name("password"));
        DemoUtils.pause(1);
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        DemoUtils.pause(1);

        username.sendKeys("invalidUser");
        DemoUtils.pause(1);
        password.sendKeys("invalidPass");
        DemoUtils.pause(1);
        loginButton.click();

        WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.cssSelector("p.oxd-text")
        ));
        Assert.assertTrue(error.isDisplayed(), "Error message not shown for invalid login.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
