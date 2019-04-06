package ABCD;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {   
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("www.google.com");
	  
  }
}
