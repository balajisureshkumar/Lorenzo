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

import PageActions.iFauxTabActions;
import PageActions.iMessageboxActions;

public class TestFauxTab extends iFauxTabActions {
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	iFauxTabActions iFauxTabActions;
	public TestFauxTab() {
		super();
	}
	
	@BeforeTest
	public void ExtentReport() {
	htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") +".//test-output//FauxTabReport.html");
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
	iFauxTabActions = new iFauxTabActions();
	}
	
	@BeforeMethod
	public void setup(ITestResult result) {
	driver.navigate().refresh();
	iFauxTabActions.fauxTabBtn();
	test = extent.createTest(result.getMethod().getMethodName()).assignAuthor("Balaji").assignDevice("Edge_Browser").assignCategory("FauxTab");
	}
	
	@Test(priority = 1)
	  public void verifyDisplayName() {
		iFauxTabActions.validateDisplayName(); 
	  }
	
	@Test(priority = 2)
	  public void verifyEnableTrue() {
		iFauxTabActions.validateEnableTrue(); 
	  }
	
	@Test(priority = 3)
	  public void verifyEnableFalse() {
		iFauxTabActions.validateEnableFalse(); 
	  }
	
	@Test(priority = 4)
	  public void verifyVisibleTrue() {
		iFauxTabActions.validateVisibleTrue(); 
	  }
	
	@Test(priority = 5)
	  public void verifyVisibleFalse() {
		iFauxTabActions.validateVisibleFalse(); 
	  }
	
	@Test(priority = 6)
	  public void verifyShowToolTipTrue() {
		iFauxTabActions.validateShowToolTipTrue(); 
	  }
	
	@Test(priority = 7)
	  public void verifyShowToolTipFalse() {
		iFauxTabActions.validateShowToolTipFalse(); 
	  }
	
	@Test(priority = 8)
	  public void verifyGetActiveTabIndex() {
		iFauxTabActions.validateGetActiveTabIndex(); 
	  }
	
	@Test(priority = 9)
	  public void verifyGetActiveTabName() {
		iFauxTabActions.validateGetActiveTabName(); 
	  }
	
	@Test(priority = 10)
	  public void verifyGetActiveTabKey() {
		iFauxTabActions.validateGetActiveTabKey(); 
	  }
	
	@Test(priority = 11)
	  public void verifyTabCount() {
		iFauxTabActions.validateTabCount(); 
	  }
	@Test(priority = 12)
	  public void verifyFrameLoaded() {
		iFauxTabActions.validateFrameLoaded(); 
	  }
	
	@Test(priority = 13)
	  public void verifySelectedTabId() {
		iFauxTabActions.validateSelectTabId(); 
	  }
	
	@Test(priority = 14)
	  public void verifyLockTab() {
		iFauxTabActions.validateLockTab(); 
	  }
	
	@Test(priority = 15)
	  public void verifyUnLockTab() {
		iFauxTabActions.validateUnLockTab(); 
	  }
	
	@Test(priority = 16)
	  public void verifyEnableTrueDrop() {
		iFauxTabActions.validateEnableTrueDrop(); 
	  }
	
	@Test(priority = 17)
	  public void verifyEnableFalseDrop() {
		iFauxTabActions.validateEnableFalseDrop(); 
	  }
	
	
	@Test(priority = 18)
	  public void verifyVisible1False() {
		iFauxTabActions.validateVisible1False(); 
	  }
	
	@Test(priority = 19)
	  public void verifyVisible1True() {
		iFauxTabActions.validateVisible1True(); 
	  }
	
	@Test(priority = 20)
	  public void verifySetMandatoryFalse() {
		iFauxTabActions.validateSetMandatoryFalse(); 
	  }

	@Test(priority = 21)
	  public void verifySetMandatoryTrue() {
		iFauxTabActions.validateSetMandatoryTrue(); 
	  }
	
	@Test(priority = 22)
	  public void verifySetToolTip() {
		iFauxTabActions.validateSetToolTip(); 
	  }
	
	@Test(priority = 23)
	  public void verifyEnable2TrueDrop() {
		iFauxTabActions.validateEnable2TrueDrop(); 
	  }
	
	@Test(priority = 24)
	  public void verifyEnable2FalseDrop() {
		iFauxTabActions.validateEnable2FalseDrop(); 
	  }
	
	@Test(priority = 25)
	  public void verifyVisible2True() {
		iFauxTabActions.validateVisible2True(); 
	  }
	
	@Test(priority = 26)
	  public void verifyVisible2False() {
		iFauxTabActions.validateVisible2False(); 
	  }
	
	@Test(priority = 27)
	  public void verifySetActive() {
		iFauxTabActions.validateSetActive(); 
	  }
	
	@Test(priority = 28)
	  public void verifySelectTab() {
		iFauxTabActions.validateSelectTab(); 
	  }
	
	@Test(priority = 29)
	  public void verifyGetSetTag() throws IOException {
		iFauxTabActions.validateGetSetTag(); 
	  }
	
	@Test(priority = 30)
	  public void verifyIsShow() {
		iFauxTabActions.validateIsShow(); 
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
//	  public void teardown() {
//		  defaultframes(driver);
//			driver.quit();
//	  }

}
