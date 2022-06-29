package Testcases;

import java.awt.AWTException;
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
import PageActions.iToolbarActions;
import Testbase.Baseclass;

public class TestToolBar extends Baseclass {
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	iToolbarActions iToolbarActions;
	public TestToolBar() {
		super();
	}
	
	@BeforeTest
	public void ExtentReport() {
	htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") +".//test-output//ToolBar.html");
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
	iToolbarActions = new iToolbarActions();
	}
	
	@BeforeMethod
	public void setup(ITestResult result) {
	driver.navigate().refresh();
	iToolbarActions.toolBarButton();
	test = extent.createTest(result.getMethod().getMethodName()).assignAuthor("Balaji").assignDevice("Edge_Browser").assignCategory("ToolBar");
	}
	
	@Test(priority = 1)
	public void verifyVisibleYes() {
		iToolbarActions.validateVisibleYes();
	}
	
	
	@Test(priority = 2)
	public void verifyVisibleNo() {
		iToolbarActions.validateVisibleNo();
	}
	
	@Test(priority = 3)
	public void verifyEnableYes() {
		iToolbarActions.validateEnableYes();
	}
	
	@Test(priority = 4)
	public void verifyEnableNo() {
		iToolbarActions.validateEnableNo();
	}
	
	@Test(priority = 5)
	public void verifyShowTooltip() {
		iToolbarActions.validateShowToolTip();
	}
	
	@Test(priority = 6)
	public void verifyHiddenTooltip() {
		iToolbarActions.validateHiddenToolTip();
	}
	
	@Test(priority = 7)
	public void verifySample4GetText() {
		iToolbarActions.validateSample4GetText();
	}
	
	@Test(priority = 8)
	public void verifySample4SetText() {
		iToolbarActions.validateSample4SetText();
	}
	
	@Test(priority = 9)
	public void verifySample5ShowList() {
		iToolbarActions.validateSample5ShowList();
	}
	@Test(priority = 10)
	public void verifySample5HideDrp() {
		iToolbarActions.validateSample5HideDrop();
	}
	@Test(priority = 11)
	public void verifySample5GetCount() {
		iToolbarActions.validateSample5GetCount();
	}
	@Test(priority = 12)
	public void verifySample5Focus() {
		iToolbarActions.validateSample5Focus();
	}
	
	@Test(priority = 14)
	public void verifySample5KeyDown1() throws AWTException {
		iToolbarActions.validateSample5KeyDown1();
	}
	
	@Test(priority = 15)
	public void verifySample5KeyDown2() throws AWTException {
		iToolbarActions.validateSample5KeyDown2();
	}
	
	@Test(priority = 16)
	public void verifySample5KeyDown3() throws AWTException {
		iToolbarActions.validateSample5KeyDown3();
	}
	
	@Test(priority = 17)
	public void verifySample5KeyDown4() throws AWTException {
		iToolbarActions.validateSample5KeyDown4();
	}
	
	@Test(priority = 18)
	public void verifySample5KeyDown5() throws AWTException {
		iToolbarActions.validateSample5KeyDown5();
	}
	
	@Test(priority = 19)
	public void verifySample6AddITem() {
		iToolbarActions.validateSample6AddItem();
	}
	
	@Test(priority = 20)
	public void verifySample6Remove() throws InterruptedException {
		iToolbarActions.validateSample6Remove();
	}
	
	@Test(priority = 21)
	public void verifySample6Clear() throws InterruptedException {
		iToolbarActions.validateSample6ClearItem();
	}
	
	@Test(priority = 22)
	public void verifySample7() {
		iToolbarActions.validateSample7();
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
