package org.learnautomation.testcases;

import java.io.IOException;

import org.learnautomation.factory.BrowserFactory;
import org.learnautomation.utility.Helper;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {

	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest logger;
	String path;

	@BeforeSuite
	public void setupTestSuite() {

		path=System.getProperty("user.dir") +"/Reports/FreeCRM.html";
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(path);

		report = new ExtentReports();

		report.attachReporter(htmlReporter);

	}

	/*@BeforeClass
	public void setup() {
		driver = BrowserFactory.startApplication(DataProviderFactory.getConfig().getStagingURL(),
				DataProviderFactory.getConfig().getBrowser());
	}*/
	
	@Parameters({"url","browser"})
	@BeforeClass
	public void setup(String testURL,String testBrowser) {
		driver = BrowserFactory.startApplication(testURL,testBrowser);
	}

	@AfterClass
	public void tearDown() {
		//BrowserFactory.closeApplication(driver);
		driver.get(path);
	}

	@AfterMethod
	public void tearDownTest(ITestResult result) {

		if (result.getStatus() == ITestResult.SUCCESS) {
			logger.pass("Test Passed");
		} else if (result.getStatus() == ITestResult.FAILURE) {
			try {
				logger.fail("Test Failed " + result.getThrowable().getMessage(), MediaEntityBuilder
						.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

		report.flush();
	}

}
