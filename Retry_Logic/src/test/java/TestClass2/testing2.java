package TestClass2;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testing2 {

@Test(retryAnalyzer=Analyzer3.Retry_logic.class)
public void meth()
{
Assert.assertEquals(true,false);	
}}
