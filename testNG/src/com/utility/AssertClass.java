package com.utility;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssertClass {
  @Test
  public void f() {
	  SoftAssert assertion=new SoftAssert();
	  assertion.assertEquals(true, false);//E
	  System.out.println("Line no 1");
	  assertion.assertAll();
  }
  @Test
  public void g() {
	  SoftAssert assertion=new SoftAssert();
	  assertion.assertEquals(true, true);//NE
	  System.out.println("Line no 2");
  }
	  
  @Test
  public void h() {
	  SoftAssert assertion=new SoftAssert();
	  Assert.assertEquals(false, true);//NE
	  System.out.println("Line no 3");
	  
	  Assert.assertEquals(false, false);//E
	  System.out.println("Line no 4");
	  assertion.assertAll();
  }
  }

