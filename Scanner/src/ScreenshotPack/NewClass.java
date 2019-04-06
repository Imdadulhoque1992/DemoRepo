package ScreenshotPack;

import java.io.File;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class NewClass implements IRetryAnalyzer {
int initial=0;
int RetryValue=3;
	public boolean retry(ITestResult result) {
		if(initial<RetryValue)
		{
			return true;
		}
		return false;
	}
public void failed() {
	
	//File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(srcFile, new File("D:\\Ecmmerce\\Scanner\\Screenshots"+
	"Screenshot.jpg"));
}
}
