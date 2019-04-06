package mavenproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mavenclass {
	
	@Test
	public void tc_01()
	{
System.setProperty("webdriver.chrome.driver","E:\\Selenium chrome\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
		 driver.get("http://www.google.com");
		
		 System.out.println("Test run successfully");
		 Assert.assertEquals(12,134);
		 driver.close();
	}
}
