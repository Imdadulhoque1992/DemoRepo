package screenshotpacks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {
	public static WebDriver driver;	
public static void initialization()
{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.facebook.com");
}
public void failed()
{
File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
	FileUtils.copyFile(srcFile, new File("D:\\Ecmmerce\\Scanner\\Screenshots\\screenshot"+"\\screenshot.jpg"));
} catch (IOException e) {
	
	e.printStackTrace();
}
}
}
