package com.utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autoit {
  @Test
  public void f() throws IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/Rakesh/Desktop/File%20upload.html");
		 driver.findElement(By.id("1")).click();
		 Runtime.getRuntime().exec("C:\\Users\\Rakesh\\Desktop\\AutoIt\\Fileupload12.exe");
		 
  }
}
