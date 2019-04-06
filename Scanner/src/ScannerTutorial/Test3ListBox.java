package ScannerTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3ListBox {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium chrome\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		Select select=new Select(driver.findElement(By.id("month")));
		
//		List<WebElement> AllSug = select.getOptions();
//		int count = AllSug.size();
//		System.out.println(count);
//		for(int i=0;i<count;i++) {
//		String text = AllSug.get(i).getText();
//			
//			System.out.println(text);
//			select.selectByIndex(i);
	//	}
//		select.deselectAll();
	
	if(select.isMultiple())
	{
			 
			select.selectByVisibleText("Feb");
	}
	else
		System.out.println("its not a multi select list box");
		driver.close();
}}
