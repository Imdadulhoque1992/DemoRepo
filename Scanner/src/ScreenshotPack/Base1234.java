package ScreenshotPack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Base1234 implements IRetryAnalyzer{
	public static  WebDriver driver;
	int retry=2;
	int retryint=0;
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\chromedriver.exe");
		driver=new ChromeDriver();	
	driver.get("https://www.facebook.com");	

	
	}
public void failed2()
{
File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(srcFile, new File("D:\\Ecmmerce\\Scanner\\Screenshots\\screenshot"
				+this.getClass().getMethods()+"Screenshot.jpg"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}


@Override
public boolean retry(ITestResult result) 
	{
		
		
		if(retryint<retry) {
			retryint++;
			return true;
		}
		
			return false;
		
	}
}












