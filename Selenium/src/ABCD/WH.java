package ABCD;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class WH {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\chromedriver.exe");
		ChromeDriver browser=new ChromeDriver();
		browser.get("https://www.naukri.com/");
	int allWH=browser.getWindowHandles().size();
	// count=browser.getWindowHandles().size();
System.out.println(allWH);
//for(String all:allWH) {
//	System.out.println(all);
//	browser.switchTo().window(all);
//	browser.manage().window().maximize();

	
//	
//String	title=browser.getTitle();
//System.out.println(title);


browser.quit();	
	
	}}
