package TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {

@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
public void Testing ()

{
	Assert.assertEquals(true, false);
	}
	
}
