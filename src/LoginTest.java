package com.abin.selenium;

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

public class LoginTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10-second timeout
    }

    @Test
    public void testLogin() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginButton.click();

        wait.until(ExpectedConditions.urlContains("dashboard")); // Wait until redirected
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dashboard"), "Login failed - Dashboard not loaded.");
    }

    @Test
public void testInvalidLogin() {
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
    WebElement password = driver.findElement(By.name("password"));
    WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

    username.sendKeys("invalidUser");
    password.sendKeys("invalidPass");
    loginButton.click();

    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
    WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
    By.cssSelector("p.oxd-text.oxd-text--p.oxd-alert-content-text")
));

        Assert.assertTrue(error.isDisplayed(), "Error message not shown for invalid login.");
    } catch (TimeoutException e) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("error_screenshot.png"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        throw e;
    }
}

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
