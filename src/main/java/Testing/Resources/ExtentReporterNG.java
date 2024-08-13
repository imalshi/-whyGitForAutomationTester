package Testing.Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	public static ExtentReports getRepoterObject() {
		
		//ExtentReports, ExtentSparkReporter
				String path = System.getProperty("user.dir")+"\\reports\\index.html";
				ExtentSparkReporter reporter = new ExtentSparkReporter(path);
				reporter.config().setReportName("web Automation Results Report");
				reporter.config().setDocumentTitle("Test Results");
				
				//attach ExtentSparkReporter to main class ExtentReports
				ExtentReports extent = new ExtentReports();
				extent.attachReporter(reporter);
				extent.setSystemInfo("Tester", "Imalshi Somathilaka");
				
				return extent;
	}

}
