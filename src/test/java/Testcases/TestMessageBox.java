package Testcases;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import PageActions.iMessageboxActions;
import Testbase.Baseclass;

public class TestMessageBox extends Baseclass {
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	iMessageboxActions iMessageboxActions;
	
	public TestMessageBox() {
		super();
	}
	
	@BeforeTest
	public void ExtentReport() {
	htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") +".//test-output//MessageBoxReport.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	htmlReporter.config().setDocumentTitle("Automation Report");
	htmlReporter.config().setReportName("Balaji report");
	htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	htmlReporter.config().setTheme(Theme.STANDARD);
	}
	
	@BeforeSuite
	public void initializethebrowser() {
	initialization();
	iMessageboxActions = new iMessageboxActions();
	}
	
	@BeforeMethod
	public void setup(ITestResult result) {
	driver.navigate().refresh();
	iMessageboxActions.messageBoxBtn();
	test = extent.createTest(result.getMethod().getMethodName()).assignAuthor("Balaji").assignDevice("Edge_Browser").assignCategory("MessageBox");
	}
	
	@Test(priority = 1)
	public void verifySample1() {
		iMessageboxActions.validateSample1();
	}
	
	@Test(priority = 2)
	public void verifySample2() {
		iMessageboxActions.validateSample2();
	}
	
	@Test(priority = 3)
	public void verifySample3() {
		iMessageboxActions.validateSample3();
	}
	
	@Test(priority = 4)
	public void verifySample4() {
		iMessageboxActions.validateSample4();
	}
	
	@Test(priority = 5)
	public void verifySample5() {
		iMessageboxActions.validateSample5();
	}
	
	@Test(priority = 6)
	public void verifySample6() {
		iMessageboxActions.validateSample6();
	}
	

	@Test(priority = 7)
	public void verifySample7() {
		iMessageboxActions.validateSample7();
	}
	
	@Test(priority = 8)
	public void verifySample8() throws InterruptedException {
		iMessageboxActions.validateSample8();
	}
	
	@AfterMethod

	public void teardown(ITestResult result) throws IOException {
	if(result.getStatus() == ITestResult.FAILURE) {
	test.log(Status.FAIL,result.getThrowable());
	test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(getbase64()).build());
	}
	else if(result.getStatus() == ITestResult.SUCCESS) {
	test.log(Status.PASS, result.getTestName());
	}
	else {
	test.log(Status.SKIP, result.getTestName());
	}

	}
	
	public String getbase64() {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		}
	
	@AfterTest
	public void Finalreport() {
	extent.flush();
	}
	
	@AfterSuite
	public void closethebrowser() {
	defaultframes(driver);
	driver.quit();



	}
	
//	@AfterMethod
//	public void teardown(ITestResult result) throws IOException {
//		if (ITestResult.FAILURE == result.getStatus()) {
//			screeenshot(result.getName());
//
//		}
//		defaultframes(driver);
//		driver.quit();
//	}

}
