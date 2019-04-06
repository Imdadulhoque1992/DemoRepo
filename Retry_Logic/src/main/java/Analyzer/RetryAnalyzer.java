package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	
	int counter=0;
	int retry=5;
	
	public boolean retry(ITestResult result) {
if(counter<5)
{
	counter++;
	return true;
	}
else {
		return false;
	}		
		
	}}
