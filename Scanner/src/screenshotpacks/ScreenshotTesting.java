package screenshotpacks;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;



@Listeners(ListenersClass.class)
public class ScreenshotTesting extends Base1{
@BeforeMethod
public void tearUp()
{
	initialization();
	}
	@AfterMethod
	public void tesrdown()
{
		driver.close();
		
}
@SuppressWarnings("deprecation")
@Test
public void test1()
{
Assert.assertEquals(23,42);
	}
@Test
public void test2()
{

	}
@Test
public void test3()
{
	}

}
