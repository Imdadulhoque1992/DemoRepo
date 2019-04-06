package ScannerTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {
	public void a() {

	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.actimind.com/");
	WebElement menu = driver.findElement(By.xpath("//a[@class='c-link dropdown-toggle']"));
	driver.manage().window().maximize();
	
	Actions actions=new Actions(driver);
	
	actions.moveToElement(menu).perform();
	driver.findElement(By.xpath("//a[text()='Web Crawling']")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.navigate().back();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement menu1 = driver.findElement(By.xpath("//a[@class='c-link dropdown-toggle']"));
	actions.moveToElement(menu1).perform();
	driver.findElement(By.xpath("//a[text()='Cloud Applications']")).click();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	driver.navigate().back();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void b() {
		
		ChromeDriver driver=new ChromeDriver();
	WebElement menu2 = driver.findElement(By.xpath("//a[@class='c-link dropdown-toggle']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(menu2).perform();
	
	driver.findElement(By.xpath("//a[text()='Web Browser Plug-ins']")).click();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	driver.navigate().back();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	WebElement menu3 = driver.findElement(By.xpath("//a[@class='c-link dropdown-toggle']"));
	actions.moveToElement(menu3).perform();
	
	driver.findElement(By.xpath("//a[text()='Data Science Applications']")).click();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	driver.navigate().back();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	WebElement menu4 = driver.findElement(By.xpath("//a[@class='c-link dropdown-toggle']"));
	actions.moveToElement(menu4).perform();
	}
	public void c() {
		ChromeDriver driver=new ChromeDriver();
	
	driver.findElement(By.xpath("//a[text()='UI/UX Design']")).click();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	driver.navigate().back();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	driver.close();
	}
	public static void main(String[] args)throws InterruptedException
	{		System.setProperty("webdriver.chrome.driver", "C:\\Selenium chrome\\chromedriver.exe");
	DropDown r=new DropDown();
	r.a();
	r.b();
	r.c();
 
}}
