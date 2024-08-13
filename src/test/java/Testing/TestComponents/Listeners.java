package Testing.TestComponents;

import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Testing.Resources.ExtentReporterNG;

public class Listeners implements ITestListener {
	
	ExtentTest test;
	ExtentReports extent = ExtentReporterNG.getRepoterObject();	
	
	
	public void onTestStart(ITestResult result) {
	    
		test = extent.createTest(result.getMethod().getMethodName());
		
	  }
	
	
	
	public void onTestSuccess(ITestResult result) {
	    
		test.log(Status.PASS, "Test passed");
	  }
	
	
	
	public void onTestFailure(ITestResult result) {
	    
		test.fail(result.getTestName());
		
		//screenshot, attached in to the report
		//test.addScreenCaptureFromPath(null, null)
	  }


}
