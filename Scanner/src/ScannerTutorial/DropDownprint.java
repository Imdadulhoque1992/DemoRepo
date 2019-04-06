package ScannerTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownprint {
	public void g() throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rr.imdadul1992@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rakesh@92");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
//				driver.close();
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[contains(@href,'ZgBCAg')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[contains(@href,'ZgBCAc')]")).click();
//		Thread.sleep(3000);
//		driver.close();
		}
	public void f()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.findElement(By.xpath("//div[@dir='ltr']")).click();
		driver.findElement(((WebElement) By.className("_2jq5 _p")).click();
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rr.imdadul1992@gmail.com");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rakesh@92");
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
//		driver.close();
		
		
	}
	public static  void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();	
		DropDownprint d=new DropDownprint();
		d.g();
		d.f();
		
	
	}}

