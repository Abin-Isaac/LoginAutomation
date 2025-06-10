package com.abon.selenium;
// June  Assignmnet 2
//🧪 Assignment 2: Text-Based and Partial Matching
//Page: https://www.wikipedia.org/

//Tasks:

//Locate the link that says "English" using:

//XPath: //a[text()='English']

//XPath (partial): //a[contains(text(), 'Eng')]

//CSS (not direct match, but try using title or other attrs)

//✅ Goal: Learn text(), contains(), and XPath functions.*/

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

public class test2 {

 WebDriver driver;

 @BeforeTest
 public void setUp() {
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  
}


 @Test
public void clickEnglishUsingExactTextXPath() {
    driver.get("https://www.wikipedia.org/");
    driver.manage().window().maximize();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement englishLink = wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//a[.//strong[text()='English']]")));
    englishLink.click();

    wait.until(ExpectedConditions.titleContains("Wikipedia"));
    Assert.assertTrue(driver.getTitle().contains("Wikipedia"));
}

@Test
public void clickEnglishUsingContainsTextXPath() {
    driver.get("https://www.wikipedia.org/");
    driver.manage().window().maximize();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement englishLink = wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//a[.//strong[contains(text(), 'Eng')]]")));
    englishLink.click();

    wait.until(ExpectedConditions.titleContains("Wikipedia"));
    Assert.assertTrue(driver.getTitle().contains("Wikipedia"));
}
    // 3️⃣ Locate using CSS selector (using title attribute)
    @Test
    public void clickEnglishUsingCssSelector() {
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement englishLink = wait.until(ExpectedConditions.elementToBeClickable(
            By.cssSelector("a[title='English — Wikipedia — The Free Encyclopedia']")));
        englishLink.click();

        wait.until(ExpectedConditions.titleContains("Википедия — свободная энциклопедия"));
        Assert.assertTrue(driver.getTitle().contains("Википедия — свободная энциклопедия"));
    }

 @AfterTest
 public void tearUp() {
 driver.quit();
 }
 
}


