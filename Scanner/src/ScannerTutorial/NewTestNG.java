package ScannerTutorial;

import org.testng.annotations.Test;

public class NewTestNG {
  @Test(priority=1)
  public void g() {
	  System.out.println("1st method run successfully");
  }
  @Test(priority=2)
  public void f() {
	  System.out.println("2nd method run successfully");
  } 
}
