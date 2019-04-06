package MavenTestScreenshot.MavenTestScreenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersClass.class)
public class Screenshot extends Base {
	
	@BeforeMethod
	public void setup()
	{
		starup();		
	}	
	
	
	@AfterMethod
	public void tearDown()
	{driver.close();
		}
	
	@Test
	public void takesScreenShot()
{
		Assert.assertEquals(true, false);
		
}}
