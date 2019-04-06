package Retry;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	  @Test
	  @Parameters({"url","username","pass"}) 
	  public void a(String url, String username, String pass) {
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  Actions action=new  Actions(driver);

	driver.get(url);
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("pass")).sendKeys(pass);
    driver.findElement(By.xpath("//input[@value='Log In']")).click();
//	driver.manage().window()
//	((Object) driver).waitForVisible("[name=__CONFIRM__]");
//	driver.keys("Escape"); // Dismiss "notifications" dialog box.
    driver.manage().deleteAllCookies();
			
	WebElement dd = driver.findElement(By.id("userNavigationLabel"));
	dd.click();
	
	action.moveToElement(dd).perform();
	driver.findElement(By.linkText("Log Out")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	  }
	  
//@Test
//@Parameters({"url","username2","pass2"})
//public void b(String url,String username2,String pass2) {
//	System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\chromedriver.exe");
//	  ChromeDriver driver=new ChromeDriver();
//	  driver.get(url);
//	  driver.findElement(By.name("email")).sendKeys(username2);
//		driver.findElement(By.name("pass")).sendKeys(pass2);
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
//}
}
