package mavenproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","E:\\Selenium chrome\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			 driver.get("http://www.google.com");
			 System.out.println("Test run successfully");
			 Assert.assertEquals(12,134);
			 driver.close();
  }
}
