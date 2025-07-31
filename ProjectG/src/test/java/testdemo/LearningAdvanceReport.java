package testdemo;

import org.testng.SkipException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LearningAdvanceReport {

	public static void main(String[] args) {
		
		//Create the SparkReport
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReports/report.html");
		
		//Configure the SparkReport Information
		spark.config().setDocumentTitle("Regression Testing for the SwagLabs");
		spark.config().setReportName("RegressionTestSuite");
		spark.config().setTheme(Theme.STANDARD);
		
		//Create the Extent Report
		ExtentReports report=new ExtentReports();
		
		//Attach the SparkReport and Extent Report
		report.attachReporter(spark);
		
		//Configure the System Information in ExtentReport
		report.setSystemInfo("Device Name:","Keerthi ch");
		report.setSystemInfo("Operating System:", "Windows 11");
		report.setSystemInfo("Browser:", "Chrome");
		report.setSystemInfo("Browser Version:", " chrome-138.0.7204.169");
		
		//Create the Test Information
		ExtentTest test = report.createTest("RegressionTest");
		
		//Steps Information
		test.log(Status.INFO, "step1: Launching the Browser Successful");
		test.log(Status.INFO, "step2: Navigating to the Application via Url Successful");
		test.log(Status.PASS, "step3: Verified the Page Succesful");
		if(true==true)
		{
			test.log(Status.PASS, "step4: Verified the WebElement Displayed Successful");
			
		}
		else
		{
			test.log(Status.FAIL, "step4: Verified the WebElement not Displayed");
		}
		test.log(Status.SKIP,"Step5: Element is Hidden");
		//Flush the Report Information'
		report.flush();
		System.out.println("Execution Done");
	}

}
