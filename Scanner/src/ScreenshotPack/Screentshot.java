package ScreenshotPack;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersClass.class)
public class Screentshot extends Base1234 {

	
	@BeforeMethod
	public void tearup()
{
		initialization();
}
@AfterMethod
public void tearDown()
{
	driver.close();
}
@Test (enabled=false,retryAnalyzer=ScreenshotPack.Base1234.class)
public void tesing1()
{String pageTitle=driver.getTitle();
String ActualpageTitle="Facebook";
driver.findElement(By.id("email")).sendKeys("rr.imdadul1992@gmail.com");
driver.findElement(By.id("pass")).sendKeys("12345");
driver.findElement(By.xpath("//input[@value='Log In']")).click();

Assert.assertEquals(pageTitle,ActualpageTitle);
}
//
//@Test(retryAnalyzer=ScreenshotPack.Base1234.class)
//public void testing2()
//{String pageTitle=driver.getTitle();
//String ActualpageTitle="Facebook";
////	driver.findElement(By.id("email")).sendKeys("rr.imdadul1992@gmail.com");
////	driver.findElement(By.id("pass")).sendKeys("Rakesg@92");
////	driver.findElement(By.xpath("//input[@value='Log In']")).click();
////	Assert.assertEquals(pageTitle,ActualpageTitle);
//}
@Test(retryAnalyzer=ScreenshotPack.Base1234.class)
public void testing3()
{String pageTitle=driver.getTitle();
String ActualpageTitle="Facebook";
	driver.findElement(By.id("email")).sendKeys("rr.imdadul1992@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Rakesg@92");
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rakesg@92");
	driver.findElement(By.xpath("//button[@value='1']")).click();
	Assert.assertEquals(pageTitle,ActualpageTitle);
	}

}





