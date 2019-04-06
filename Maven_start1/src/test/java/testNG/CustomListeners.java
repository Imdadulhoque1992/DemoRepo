package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners extends Base implements ITestListener{

	public void onTestStart(ITestResult result) {
	System.out.println("onTestStart");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
		
	}

	public void onTestFailure(ITestResult result) {
	System.out.println("Failed test");
	failed();
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
		
	}

	

}
