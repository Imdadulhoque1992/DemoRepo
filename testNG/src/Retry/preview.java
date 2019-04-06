package Retry;

import org.testng.annotations.Test;
import org.testng.SkipException;
import org.testng.annotations.Parameters;

public class preview {
	 
  @Test(priority=1,enabled=false)
  @Parameters({"test-browser","test-browser 1","test-browser 3", "test-browser 4"})
  public void f(String url1,String url2,String url3 ,String url4 )   
  {

	  System.out.println(url1);	  
	  System.out.println(url2); 
	  System.out.println(url3);
	  System.out.println(url4);

  }
  
 
}
