package Analyzer4;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import javax.print.attribute.standard.OutputDeviceAssigned;
import javax.xml.transform.OutputKeys;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.reporters.jq.Main;

public class BaseClassPractice implements IRetryAnalyzer{

	//retry logic for failed test cases
	int tryNo=0;
	int retryNo=3;
	public boolean retry(ITestResult result) {
	if(tryNo>retryNo)
	{
		tryNo++;
		return true;
		
	}else 
		return false;
	}
	
	//retry logic for failed test cases	
	public void failedScreenshot() {
File srcFile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	}

}







