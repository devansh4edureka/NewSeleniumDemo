package com.mycompany.app.addressbook_selenium_ide;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App
{
 @Test
 public static void main(String[] args) {


// System.setProperty("webdriver.chrome.driver","C:\\Edureka\\chromedriver.exe");
 System.setProperty("webdriver.chrome.driver","/home/ubuntu/selenium/chromedriver");
 ChromeOptions chromeOptions = new ChromeOptions();
chromeOptions.addArguments("--headless");
 WebDriver driver = new ChromeDriver(chromeOptions);

 System.out.println("Hi, Welcome to Demo for Selenium WebDriver");


 driver.get("http://13.234.117.6:8888/");

 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 driver.findElement(By.className("v-button")).click();
 driver.findElement(By.id("gwt-uid-5")).sendKeys("Devansh4Edureka2");
 driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps2");
 driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562701");
 driver.findElement(By.id("gwt-uid-11")).sendKeys("Devansh4Edureka2@edureka.co");
 driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2022");
 driver.findElement(By.className("v-button-primary")).click();
 //Thread.sleep(5000);
 //driver.quit();
 }

}
