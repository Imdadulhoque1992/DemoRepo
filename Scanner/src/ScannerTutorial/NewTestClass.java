package ScannerTutorial;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class NewTestClass {
	@BeforeMethod
	  public void beforeMethod() {
	          	  System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		
		 
	  }
  @Test
  public void f() {
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	driver.findElement(By.id("search")).sendKeys(("how to pass xls files from selenium webdriver"));
	driver.findElement(By.id("search-icon-legacy")).click();
		 
		
  }
  
  @AfterMethod
  public void close()
  {
	  ChromeDriver driver=new ChromeDriver();
	  driver.close();
  }

}
