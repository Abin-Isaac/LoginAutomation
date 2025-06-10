package com.abon.selenium;

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

public class test1 {

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
//name
  WebElement username = driver.findElement (By.cssSelector("input[name='email']"));
  WebElement pw = driver.findElement(By.cssSelector("input[name='pass']"));
  WebElement Loginbutton = driver.findElement(By.cssSelector("button[name='login']"));
  //WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
  //WebElement pw = driver.findElement(By.xpath("//input[@name='pass']"));
  //WebElement Loginbutton = driver.findElement(By.xpath("//button[@name ='login']"));
//id
  //WebElement username =driver.findElement (By.xpath("//input[@id='email']"));
  //WebElement pw = driver.findElement(By.xpath("//input[@id='pass']"));
  //WebElement Loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
  //WebElement username = driver.findElement(By.cssSelector("input#email"));
  //WebElement pw = driver.findElement(By.cssSelector("input#pass"));
  //WebElement Loginbutton = driver.findElement(By.cssSelector("[name='login']"));
//data testid
  //WebElement username = driver.findElement(By.xpath("//input[@data-testid='royal-email']"));
  //WebElement pw= driver.findElement(By.xpath("//input[@data-testid='royal-pass']"));
  //WebElement Loginbutton = driver.findElement(By.xpath("//button[@data-testid ='royal-login-button']"));
  //WebElement username = driver.findElement(By.cssSelector("input[data-testid='royal-email']"));
  //WebElement pw= driver.findElement(By.cssSelector("input[data-testid='royal-pass']"));
  //WebElement Loginbutton = driver.findElement(By.cssSelector("button[data-testid ='royal-login-button']"));
  username .sendKeys("asdfh");
  pw .sendKeys("Admin");
  Loginbutton.click();
  try {
            Thread.sleep(5000); // Replace with WebDriverWait in future
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
 @Test
 public void pwresetFunction() {
  driver.get("https://www.facebook.com");
  driver.manage().window().maximize();
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

 WebElement Pwreset = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Forgotten password?']")));
 Pwreset.click();

 wait.until(ExpectedConditions.titleContains("Forgotten Password | Can't Log In | Facebook"));
 Assert.assertTrue(driver.getTitle().contains("Forgotten Password | Can't Log In | Facebook"));
  
 }


 @AfterTest
 public void tearUp() {
 driver.quit();
 }
 
}


