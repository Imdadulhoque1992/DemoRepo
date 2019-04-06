package Analyzer3;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_logic implements IRetryAnalyzer {
	
	int retryNo=4;
	int tryInitial=0;
	public boolean retry(ITestResult result) {
		
		
		if(tryInitial<retryNo) {
			tryInitial++;
			return true;			
			
		}else {
			return false;
		}
		
		
	}

	
}
