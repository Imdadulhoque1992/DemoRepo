package Retry;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Retry.Listenerclass.class)
public class AssertClass123 {
	
WebDriver driver;
	
  @Test
  public void LogIn() throws InterruptedException {
	  Assert.assertEquals(12,13);
	  System.out.println("Loged in succfully");

driver.get("https://www.cnet.com/news/");
	
JavascriptExecutor js=(JavascriptExecutor)driver;
	
for(int i=0;i<=100;i++)
	{
js.executeScript("window.scrollBy(100,100)");
Thread.sleep(500);
	}
  }
//  @Test()
//  public void homepage() {
//	  
//	  System.out.println("Home page display successfully");
//  }
//  @Test
//  public void ALogout() {
//	  System.out.println("Loged out succfully");
//  }
//  
//  
    
}
