package com.abon.selenium;
// June  Assignmnet 2
//🧪 Assignment 2: Text-Based and Partial Matching
//Page: https://www.wikipedia.org/

//Tasks: Click on additional links other tyhan English (add on)

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

public class test201 {

 WebDriver driver;

 @BeforeTest
 public void setUp() {
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  
}

 @Test
 public void RussianLinkClickerusingxpath() {
 driver.get("https://www.wikipedia.org");

 driver.manage().window().maximize(); 
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

 WebElement RussianLinkLocator = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.//strong[text()='Русский']]")));
 RussianLinkLocator.click();

 wait.until(ExpectedConditions.titleContains("Википедия "));
 Assert.assertTrue(driver.getTitle().contains("Википедия "));
  
}

 @AfterTest
 public void tearUp() {
 driver.quit();
 }
 
}


