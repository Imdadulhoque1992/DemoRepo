package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertClass12 {
	 WebDriver driver;
	@BeforeClass()
	public void starBrowser()
	{
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	}	 

	
//  @Test()
//  public void LogIn(){
//	 
//	  ChromeDriver driver=new ChromeDriver();
//	  //driver.get("https://www.facebook.com/");
//	  
 // }
  @Test()
  public void homepage()throws Exception {
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.id("email")).sendKeys("rr.imdadul1992@gmail.com");	
	  driver.findElement(By.id("pass")).sendKeys("Rakesh@92");
	  driver.findElement(By.xpath("//input[@value='Log In']")).click();
	  Thread.sleep(3000);
	 boolean status=driver.findElement(By.xpath("/input[@name='q']")).isDisplayed();
	 Assert.assertTrue(status);
	 System.out.println("Successfully loged in");
  }
  @Test(dependsOnMethods="homepage")
  public void Logout()  throws Exception{
	  ChromeDriver driver=new ChromeDriver();
	  Object sb = driver.findElement(By.id("userNavigationLabel"));
	  ((WebElement) sb).click();
	  Actions action=new Actions(driver);
	  action.moveToElement((WebElement) sb).perform();
	  driver.findElement(By.linkText("Log out")).click();
	  Thread.sleep(3000);
	  boolean sb1=driver.findElement(By.id("email")).isDisplayed();
	  System.out.println("Loged out succfully"+sb1);
  }
  @AfterClass()
 public  void closebrowser(){
	  driver.close();
  }
  
    
}
