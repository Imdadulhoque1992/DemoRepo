package Analyzer2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Logic_Class implements IRetryAnalyzer{

	public boolean retry(ITestResult result) {
		int stry=4;
		int retry=0;
		if(retry<stry)
		{
			retry++;
			return true;
			
		}else {
		return false;
	}}

}
