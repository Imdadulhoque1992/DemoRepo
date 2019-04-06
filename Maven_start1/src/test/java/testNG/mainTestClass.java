package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class mainTestClass extends Base {
	
	@BeforeClass
	public void BM()
	{
		initialization();
	}
	
	@AfterClass
	public void AM() {
		driver.quit();
		
	}
	@Test
	public void T() {
		Assert.assertEquals(true, false);
	}
	}

	
	
	
	
	


