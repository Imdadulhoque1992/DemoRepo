package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.reporters.Files;


public class Base {
	public static WebDriver driver  ;
	
	
	public void initialization() {
		System.setProperty("webDriver.chrome.driver", "C:\\Selenium chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("www.google.co.in");
		
	}
	
public void failed() {
	
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	

		try {
			FileUtils.copyFile(src, new File("D:\\Ecmmerce\\Maven_start1\\Scren shot folder.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}}


