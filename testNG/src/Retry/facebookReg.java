package Retry;

import org.testng.annotations.Test;

import com.utility.TestUtility;
import com.utility.excelreader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class facebookReg {
 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 driver.get("https:www.facebook.com");
  }
  
  @DataProvider
  public Iterator<Object[]> getTestData() throws IOException{
	  //ArrayList<Object[]> testData=TestUtility.getDataFromExcel();
	  ArrayList<Object[]> testData = null;
//	try {
//		testData = excelreader.readexcel();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	  return testData.iterator();
  }
  
  
  @Test(dataProvider="getTestData")
  public void FacebookRegpage(String FirstName,String Surname,CharSequence[] MobNo,String NewPassword)
  {
	  ChromeDriver driver=new ChromeDriver();
	  driver.findElement(By.className("firstname")).clear();
	  driver.findElement(By.className("firstname")).sendKeys(FirstName);
	  driver.findElement(By.className("lastname")).clear();
	  driver.findElement(By.className("lastname")).sendKeys(Surname);
	  driver.findElement(By.xpath("//input[@name='reg_email__']")).clear();
	  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(MobNo);
	  driver.findElement(By.xpath("//input[@autocomplete='new-password']")).clear();
	  driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys(NewPassword);
  
    
  } 
  
  @AfterMethod()
  public void teardown(){
	  ChromeDriver driver=new ChromeDriver();
	  driver.quit();
  }}
