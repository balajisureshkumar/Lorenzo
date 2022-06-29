package Testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import PageActions.iTextboxactions;
import Testbase.Baseclass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class TestTextBox extends Baseclass {
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	iTextboxactions iTextboxactions;

	public TestTextBox() {
		super();
	}
	
	
	@BeforeTest
	public void ExtentReport() {
	htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") +".//test-output//TextBox.html");
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
	iTextboxactions = new iTextboxactions();
	}
	
	@BeforeMethod
	public void setup(ITestResult result) {
	driver.navigate().refresh();
	iTextboxactions.txt();
	test = extent.createTest(result.getMethod().getMethodName()).assignAuthor("Balaji").assignDevice("Edge_Browser").assignCategory("TextBox");
	}

	@Test(priority = 1)
	public void verifyEnableYes() throws IOException {
		iTextboxactions.validateEnableYes();
	}
	
	@Test(priority = 2)
	public void verifyEnableNo() throws IOException {
		iTextboxactions.validateEnableNo();
	}

	@Test(priority = 3)
	public void verifyVisibleNo() {
		iTextboxactions.validateVisibleNo();
	}
	
	
	@Test(priority = 4)
	public void verifyVisibleYes() {
		iTextboxactions.validateVisibleYes();
	}

	@Test(priority = 5)
	public void verifyReadOnlyYes() throws IOException {
		iTextboxactions.validateReadOnlyYes();
	}

	@Test(priority = 6)
	public void verifyReadOnlyNo() throws IOException {
		iTextboxactions.validateReadOnlyNo();
	}

	@Test(priority = 7)
	public void verifyMandatoryNo() {
		iTextboxactions.validateMandatoryNo();
	}
	
	@Test(priority = 8)
	public void verifyMandatoryYes() {
		iTextboxactions.validateMandatoryYes();
	}

	@Test(priority = 9)
	public void verifyDisplayYes() {
		iTextboxactions.validateDisplayedYes();
	}
	
	
	@Test(priority = 10)
	public void verifyDisplayNo() {
		iTextboxactions.validateDisplayedNo();
	}

	@Test(priority = 11)
	public void verifyClearAll() {
		iTextboxactions.validateClearAll();
	}

	@Test(priority = 12)
	public void verifySetTextAlpha() throws IOException {
		iTextboxactions.validateAlphaSetText();

	}

	@Test(priority = 13)
	public void verifyAlphaGetText() throws IOException {
		iTextboxactions.validateAlphaGetText();

	}

	@Test(priority = 14)
	public void verifyAlphaVal() throws IOException {
		iTextboxactions.validateAlphaVal();

	}

	@Test(priority = 15)
	public void verifyAlphaNumSet() throws IOException {
		iTextboxactions.validateAlphaNumSet();

	}

	@Test(priority = 16)
	public void verifyAlphaNumGet() throws IOException {
		iTextboxactions.validateAlphaNumGet();

	}

	@Test(priority = 17)
	public void verifyAlphaNumVal() throws IOException {
		iTextboxactions.validateAlphaNumVal();

	}

	@Test(priority = 18)
	public void verifyMultiLineSet() throws IOException {
		iTextboxactions.validateMultiLineSet();
	}

	@Test(priority = 19)
	public void verifyMultiLineGet() throws IOException {
		iTextboxactions.validateMultiLineGet();
	}

	@Test(priority = 20)
	public void verifyNormalSet() throws IOException {
		iTextboxactions.validateNormalSet();
	}

	@Test(priority = 21)
	public void verifyNormalGet() throws IOException {
		iTextboxactions.validateNormalGet();
	}

	@Test(priority = 22)
	public void verifyNumGet() throws IOException {
		iTextboxactions.validateNumGetText();
	}

	@Test(priority = 23)
	public void verifyNumSet() throws IOException {
		iTextboxactions.validateNumSetText();
	}

	@Test(priority = 24)
	public void verifyNumValData() throws IOException {
		iTextboxactions.validateNumValData();
	}

	@Test(priority = 25)
	public void verifyValReq() throws IOException {
		iTextboxactions.validateNumValReq();
	}

	@Test(priority = 26)
	public void verifyValRange() throws IOException {
		iTextboxactions.validateNumValRange();
	}

	@Test(priority = 27)
	public void verifyPassGet() throws IOException {
		iTextboxactions.validatePassGet();
	}

	@Test(priority = 28)
	public void verifyPassSet() throws IOException {
		iTextboxactions.validatePassSet();
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
