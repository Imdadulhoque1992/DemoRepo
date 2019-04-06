package ScannerTutorial;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class  TestNGRun {
	 @BeforeMethod
	  public void beforeMethod() {
		 
	  }
	public WebDriver driver;
  @Test
  @Parameters({"url","username","pass"})
  public void a(String url, String username, String pass) {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();

driver.get(url);
driver.findElement(By.name("email")).sendKeys(username);
driver.findElement(By.name("pass")).sendKeys(pass);
driver.findElement(By.xpath("//input[@value='Log In']")).click();
  }}
