package FrameWorkPackage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrameWorkBase {
	WebDriver driver;
	@BeforeMethod
	public void tearUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://reg.ebay.in/reg/PartialReg");
	}
	@AfterMethod
	public void TearDown() {
		
		//driver.quit();
	}
	@DataProvider
	public Iterator<Object[]> getTestData() throws IOException {
		ArrayList<Object[]> testDataArrayList=UtilityClass.getDataFromExcell();
		return testDataArrayList.iterator();
		
	}
	@Test
	public void  EbayTest(String First_Name,String Last_Name,String Email_Adress,
			String Password ) {
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(First_Name);
		
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys(Last_Name);
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(Email_Adress);
		
		driver.findElement(By.name("PASSWORD")).clear();
		driver.findElement(By.name("PASSWORD")).sendKeys(Password);
		
	}
	

}
