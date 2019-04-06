package Retry;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javascript {
	WebDriver driver;

  @Test
  public void LogIn() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","E:\\Selenium chrome\\chromedriver.exe");
		driver =new ChromeDriver();
driver.get("https://www.cnet.com/news/");
	
JavascriptExecutor js=(JavascriptExecutor)driver;
	
for(int i=0;i<=100;i++)
	{
js.executeScript("window.scrollBy(100,300)");
Thread.sleep(500);
	}

System.out.println("Loged in succfully");
driver.close();
}}
