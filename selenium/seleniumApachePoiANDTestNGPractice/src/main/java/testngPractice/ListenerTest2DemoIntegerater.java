package testngPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest2DemoIntegerater implements ITestListener {
	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart method...");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("ontestStart method...");
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("ontest success method...");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTest failure method...");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("ontest skipped method...");
	}

}
