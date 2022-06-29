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

import PageActions.iAddrControlActions;
import PageActions.iFauxTabActions;
import PageActions.iTimeBoxactions;
import Testbase.Baseclass;

public class TestAddrControl extends Baseclass {
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	iAddrControlActions iAddrControlActions;
	public TestAddrControl() {
		super();
	}
	
	@BeforeTest
	public void ExtentReport() {
	htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") +".//test-output//AddrControlReport.html");
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
	iAddrControlActions = new iAddrControlActions();
	}
	
	@BeforeMethod
	public void setup(ITestResult result) {
	driver.navigate().refresh();
	iAddrControlActions.mainAddrControl();
	test = extent.createTest(result.getMethod().getMethodName()).assignAuthor("Balaji").assignDevice("Edge_Browser").assignCategory("AddrControl");
	}

	@Test(priority = 1)
	  public void verifyEnableSFSiconTrue() {
		iAddrControlActions.validateEnableSFSiconTrue(); 
	  }
	@Test(priority = 2)
	  public void verifyEnableSFSiconFalse() {
		iAddrControlActions.validateEnableSFSiconFalse(); 
	  }

	@Test(priority = 3)
	  public void verifyVisibleSFSiconTrue() {
		iAddrControlActions.validateVisibleSFSiconTrue(); 
	  }
	@Test(priority = 4)
	  public void verifyVisibleSFSiconFalse() {
		iAddrControlActions.validateVisibleSFSiconFalse(); 
	  }
	
	@Test(priority = 5)
	  public void verifyEnableAddressTrue() {
		iAddrControlActions.validateEnableAddressTrue(); 
	  }
	
	@Test(priority = 6)
	  public void verifyEnableAddressFalse() {
		iAddrControlActions.validateEnableAddressFalse(); 
	  }
	
	@Test(priority = 7)
	  public void verifyVisibleAddressTrue() {
		iAddrControlActions.validateVisibleAddressTrue(); 
	  }
	
	@Test(priority = 8)
	  public void verifyVisibleAddressFalse() {
		iAddrControlActions.validateVisibleAddressFalse(); 
	  }
	
	@Test(priority = 9)
	  public void verifyIsEnableAddressTrue() {
		iAddrControlActions.validateIsEnableAddressTrue(); 
	  }
	
	@Test(priority = 10)
	  public void verifyIsEnableAddressFalse() {
		iAddrControlActions.validateIsEnableAddressFalse(); 
	  }
	
	@Test(priority = 11)
	  public void verifyIsVisibleAddressTrue() {
		iAddrControlActions.validateIsVisibleAddressTrue(); 
	  }
	
	@Test(priority = 12)
	  public void verifyIsVisibleAddressFalse() {
		iAddrControlActions.validateIsVisibleAddressFalse(); 
	  }
	
	@Test(priority = 13)
	  public void verifyIsIsEnableSFSiconTrue() {
		iAddrControlActions.validateIsEnableSFSiconTrue(); 
	  }
	
	@Test(priority = 14)
	  public void verifyIsIsEnableSFSiconFalse() {
		iAddrControlActions.validateIsEnableSFSiconFalse(); 
	  }
	
	@Test(priority = 15)
	  public void verifyIsVisibleSFSiconTrue() {
		iAddrControlActions.validateIsVisibleSFSiconTrue(); 
	  }
	
	@Test(priority = 16)
	  public void verifyIsVisibleSFSiconFalse() {
		iAddrControlActions.validateIsVisibleSFSiconFalse(); 
	  }
	
	@Test(priority = 17)
	  public void verifySetFocus() {
		iAddrControlActions.validatesetFocus(); 
	  }
	
	@Test(priority = 18)
	  public void verifyGetCountryText() {
		iAddrControlActions.validateGetCountryText(); 
	  }
	
	@Test(priority = 19)
	  public void verifyGetCountryValue() {
		iAddrControlActions.validateGetCountryValue(); 
	  }
	
	@Test(priority = 20)
	  public void verifySetCountryText() {
		iAddrControlActions.validateSetCountryText(); 
	  }
	
	@Test(priority = 21)
	  public void verifySetCountryValue() {
		iAddrControlActions.validateSetCountryValue(); 
	  }
	
	@Test(priority = 22)
	  public void verifyShowAddress() {
		iAddrControlActions.validateShowAddress(); 
	  }
	
	@Test(priority = 23)
	  public void verifyShowAddressType() {
		iAddrControlActions.validateShowAddressType(); 
	  }
	
	@Test(priority = 24)
	  public void verifyShowToolTip() {
		iAddrControlActions.validateShowToolTip(); 
	  }
	
	@Test(priority = 25)
	  public void verifyGetSFSVisibleStatusTrue() {
		iAddrControlActions.validateGetSFSVisibleStatusTrue(); 
	  }

	@Test(priority = 26)
	  public void verifyGetSFSVisibleStatusFalse() {
		iAddrControlActions.validateGetSFSVisibleStatusFalse(); 
	  }
	
	@Test(priority = 27)
	  public void verifyGetSFSDisplayStatusTrue() {
		iAddrControlActions.validateGetSFSDisplayStatusTrue(); 
	  }
	
	@Test(priority = 28)
	  public void verifyGetSFSDisplayStatusFalse() {
		iAddrControlActions.validateGetSFSDisplayStatusFalse(); 
	  }
	
	@Test(priority = 29)
	  public void verifyGetAvailableCodes() throws InterruptedException, IOException {
		iAddrControlActions.validateGetAvailableCodes(); 
	  }
	
	@Test(priority = 30)
	  public void verifyGetMandatoryCodes() throws InterruptedException, IOException {
		iAddrControlActions.validateGetMandatoryCodes(); 
	  }
	
	@Test(priority = 31)
	  public void verifyGetEmptyFeildCodes() throws InterruptedException, IOException {
		iAddrControlActions.validateGetEmptyFeildCodes(); 
	  }
	
	@Test(priority = 32)
	  public void verifyGetAddress() throws InterruptedException, IOException {
		iAddrControlActions.validateGetAddress(); 
	  }
	
	
	@Test(priority = 33)
	  public void verifyGetCodeForLabel() throws InterruptedException, IOException {
		iAddrControlActions.validateGetCodeForLabel(); 
	  }
	
	@Test(priority = 34)
	  public void verifySetAddress() throws InterruptedException, IOException {
		iAddrControlActions.validateSetAddress(); 
	  }
	
	
	@Test(priority = 35)
	  public void verifyAddressAccessKey() throws InterruptedException, IOException, AWTException {
		iAddrControlActions.validateAddressAccessKey(); 
	  }
	
	@Test(priority = 36)
	  public void verifyTeleAccessKey() throws InterruptedException, IOException, AWTException {
		iAddrControlActions.validateTeleAccessKey(); 
	  }
	
	@Test(priority = 37)
	  public void verifyFaxAccessKey() throws InterruptedException, IOException, AWTException {
		iAddrControlActions.validateFaxAccessKey(); 
	  }
	
	@Test(priority = 38)
	  public void verifyEmailAccessKey() throws InterruptedException, IOException, AWTException {
		iAddrControlActions.validateEmailAccessKey(); 
	  }
	
	@Test(priority = 39)
	  public void verifyWebsiteAccessKey() throws InterruptedException, IOException, AWTException {
		iAddrControlActions.validateWebsiteAccessKey(); 
	  }
	
	@Test(priority = 40)
	  public void verifyPostalCode() throws InterruptedException, IOException, AWTException {
		iAddrControlActions.validatePostalCode(); 
	  }

	@Test(priority = 40)
	  public void verifyHorizontal() throws InterruptedException, IOException, AWTException {
		iAddrControlActions.validateHorizontal(); 
	  }
	
	@Test(priority = 40)
	  public void verifyVertical() throws InterruptedException, IOException, AWTException {
		iAddrControlActions.validateVertical(); 
	  }
	
	@Test(priority = 40)
	  public void verifyLargeAddressType() throws InterruptedException, IOException, AWTException {
		iAddrControlActions.validateLargeWizardSize(); 
	  }
	
	@Test(priority = 40)
	  public void verifyMediumAddressType() throws InterruptedException, IOException, AWTException {
		iAddrControlActions.validateMediumWizardSize(); 
	  }
	
	@Test(priority = 40)
	  public void verifySmallAddressType() throws InterruptedException, IOException, AWTException {
		iAddrControlActions.validateSmallWizardSize(); 
	  }
	
	@Test(priority = 40)
	  public void verifyAddress1Type() throws InterruptedException, IOException, AWTException {
		iAddrControlActions.validateAddress1Type(); 
	  }
	
	@Test(priority = 40)
	  public void verifyCommunicationAddressType() throws InterruptedException, IOException, AWTException {
		iAddrControlActions.validateCommunication(); 
	  }
	
	@Test(priority = 40)
	  public void verifyBothAddressType() throws InterruptedException, IOException, AWTException {
		iAddrControlActions.validateBothAddressType(); 
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
	
//	@BeforeMethod
//	  public void setup() {
//		  initialization();
//		  iAddrControlActions = new iAddrControlActions();
//		  iAddrControlActions.mainAddrControl();
//	}
	

	
//	@AfterMethod
//	  public void teardown() {
//		  defaultframes(driver);
//			driver.quit();
//	  }
//	
	

}
