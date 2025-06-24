package com.abin.selenium.tdd.automation.pages;
//import com.abin.selenium.tdd.automation.utils.DemoUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordResetPage {

    private WebDriver driver;

    private By usernameField = By.cssSelector("input[placeholder='Username']");
    private By resetButton = By.cssSelector("button[type='submit']");
    private By confirmationMessage = By.className("orangehrm-forgot-password-title");

    public PasswordResetPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void clickResetButton() {
        driver.findElement(resetButton).click();
    }

    public String getResetMessage() {
        return driver.findElement(confirmationMessage).getText();
    }
}
