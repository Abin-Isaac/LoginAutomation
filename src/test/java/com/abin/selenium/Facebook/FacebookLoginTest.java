	

// For Facebook
package com.abin.test.facebook;

import com.abin.selenium.utils.DemoUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FacebookLoginTest {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testLogin() {
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        DemoUtils.pause(2); // Let the page render visually

        WebElement username = driver.findElement(By.cssSelector("input[name='email']"));
        WebElement pw = driver.findElement(By.cssSelector("input[name='pass']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[name='login']"));

        DemoUtils.pause(1); // Just before typing

        username.sendKeys("asdfh");
        pw.sendKeys("Admin");

        DemoUtils.pause(1); // Before clicking login

        loginButton.click();

        DemoUtils.pause(3); // To observe the result visually
    }

    @Test
    public void pwresetFunction() {
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        DemoUtils.pause(2); // Page load visibility

        WebElement pwReset = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Forgotten password?']")));
        pwReset.click();

        DemoUtils.pause(2); // See navigation visually

        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identify_email")));
        emailInput.sendKeys("asdf@gmial.com");

        DemoUtils.pause(1); // Before submit

        WebElement submitBtn = driver.findElement(By.id("did_submit"));
        submitBtn.click();

        wait.until(ExpectedConditions.titleContains("Forgotten Password | Can't Log In | Facebook"));
        Assert.assertTrue(driver.getTitle().contains("Forgotten Password | Can't Log In | Facebook"));

        DemoUtils.pause(3); // Final confirmation pause
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
