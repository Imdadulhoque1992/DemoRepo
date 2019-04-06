package ABCD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popups {
public static void main(String[] args)throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\chromedriver.exe");
	ChromeDriver browser=new ChromeDriver();
	browser.get("https://www.cleartrip.com/");
	browser.manage().window().maximize();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	//ChromeDriver driver=new ChromeDriver(options);
//		Alert alert=browser.switchTo().alert();
//		alert.dismiss();
//		String	text=alert.getText();
	JavascriptExecutor js=(JavascriptExecutor)browser;
	js.executeScript("window.scrollBy(0,100)");
	Thread.sleep(1000);
	browser.findElement(By.xpath("//input[@class='booking large']")).click();
	Thread.sleep(5000);	

//System.out.println(text);
browser.findElement(By.xpath("//input[@type='text']")).click();
browser.findElement(By.className("ui-state-default ")).click();
Thread.sleep(6000);

browser.close();
	
}
}
