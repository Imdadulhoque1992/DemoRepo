package TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
	
	
	@Test(retryAnalyzer=Analyzer2.Logic_Class.class)
	public void meth()
	{
		Assert.assertEquals(true, false);
		
	}
}
