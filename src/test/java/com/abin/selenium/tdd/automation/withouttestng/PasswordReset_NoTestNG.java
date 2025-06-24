package com.abin.selenium.tdd.automation.withouttestng;

import com.abin.selenium.tdd.automation.utils.DemoUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordReset_NoTestNG {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode");

        DemoUtils.pause(2); // Wait for page to load

        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");

        DemoUtils.pause(1);

        driver.findElement(By.cssSelector("button[type='submit']")).click();
        DemoUtils.pause(2); // Wait for result to appear

        String result = driver.findElement(By.className("orangehrm-forgot-password-title")).getText();

        if (result.contains("Reset Password link sent successfully")) {
            System.out.println("Password reset message displayed.");
        } else {
            System.out.println("Reset failed or wrong message.");
        }

        DemoUtils.pause(1);
        driver.quit();
    }
}
