package Retry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass1234 {
	 WebDriver driver;
	 
@Test
public void starts() {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium chrome\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String url=driver.getCurrentUrl();
	Assert.assertTrue(url.contains("facebook.com"));
	System.out.println("======browser launched successfully==========");
}
 @Test(dependsOnMethods="starts")
 public void homepage() 
 {
 
	 driver.findElement(By.id("email")).sendKeys("rr.imdadul1992@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("Rakesh@92");
	 driver.findElement(By.xpath("//input[@value='Log In']")).click();
 boolean status=driver.findElement(By.xpath("//INPUT[@name='q']")).isDisplayed();
 Assert.assertTrue(status);
 System.out.println("Homepage displayed successfully");
 }
@Test(dependsOnMethods="homepage")
public void logout() {
driver.close();
System.out.println("comming soon");
}

}
    


















