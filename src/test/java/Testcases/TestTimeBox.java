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

import PageActions.iTimeBoxactions;
import Testbase.Baseclass;

public class TestTimeBox extends Baseclass {
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	iTimeBoxactions iTimeBoxactions;
	public TestTimeBox() {
		super();
	}
	
	@BeforeTest
	public void ExtentReport() {
	htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") +".//test-output//TimeBoxReport.html");
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
	iTimeBoxactions = new iTimeBoxactions();
	}
	
	@BeforeMethod
	public void setup(ITestResult result) {
	driver.navigate().refresh();
	iTimeBoxactions.timeBoxBtn();
	test = extent.createTest(result.getMethod().getMethodName()).assignAuthor("Balaji").assignDevice("Edge_Browser").assignCategory("TimeBox");
	}
	
	@Test(priority = 1)
	  public void verifySetText() {
		  iTimeBoxactions.validateSetText(); 
	  }
	
	@Test(priority = 2)
	  public void verifyGetText() {
		  iTimeBoxactions.validateGetText(); 
	  }
	
	
	@Test(priority = 3)
	  public void verifyClearText() throws IOException {
		  iTimeBoxactions.validateClearText(); 
	  }
	
	@Test(priority = 4)
	  public void verifyGetTime() throws IOException {
		  iTimeBoxactions.validateGetTime(); 
	  }
	
	@Test(priority = 5)
	  public void verifyIsValid() {
		  iTimeBoxactions.validateIsValid(); 
	  }
	
	@Test(priority = 6)
	  public void verifyEnableTrue() {
		  iTimeBoxactions.validateEnableTrue(); 
	  }
	
	@Test(priority = 7)
	  public void verifyEnableFalse() {
		  iTimeBoxactions.validateEnableFalse(); 
	  }
	
	@Test(priority = 8)
	  public void verifyVisibleTrue() {
		  iTimeBoxactions.validateVisibleTrue(); 
	  }
	
	@Test(priority = 9)
	  public void verifyVisibleFalse() {
		  iTimeBoxactions.validateVisibleFalse(); 
	  }
	
	@Test(priority = 10)
	  public void verifyReadOnlyTrue() {
		  iTimeBoxactions.validateReadOnlyTrue(); 
	  }
	
	@Test(priority = 11)
	  public void verifyReadOnlyFalse() {
		  iTimeBoxactions.validateReadOnlyFalse(); 
	  }
	
	@Test(priority = 12)
	  public void verifyMandatoryFalse() {
		  iTimeBoxactions.validateMandatoryFalse(); 
	  }
	
	@Test(priority = 13)
	  public void verifyMandatoryTrue() {
		  iTimeBoxactions.validateMandatoryTrue(); 
	  }
	
	@Test(priority = 14)
	  public void verifyDisplayTrue() {
		  iTimeBoxactions.validateDisplayedTrue(); 
	  }
	
	@Test(priority = 15)
	  public void verifyDisplayFalse() {
		  iTimeBoxactions.validateDisplayedFalse(); 
	  }
	
	@Test(priority = 16)
	  public void verifyShowToolTipTrue() {
		  iTimeBoxactions.validateShowToolTipTrue(); 
	  }
	@Test(priority = 17)
	  public void verifyShowToolTipFalse() {
		  iTimeBoxactions.validateShowToolTipFalse(); 
	  }
	
	@Test(priority = 18)
	  public void verifyClearAll() throws IOException {
		  iTimeBoxactions.validateClearAll(); 
	  }
	
	@Test(priority = 19)
	  public void verifyIsValidTime() throws IOException {
		  iTimeBoxactions.validateIsValidTime(); 
	  }
	
	@Test(priority = 20)
	  public void verifyTimeBox1Inc() {
		  iTimeBoxactions.validateTimeBox1Inc(); 
	  }
	
	@Test(priority = 21)
	  public void verifyTimeBox1Dec() {
		  iTimeBoxactions.validateTimeBox1Dec(); 
	  }
	
	@Test(priority = 22)
	  public void verifyAutoInc() {
		  iTimeBoxactions.validateAutoInc(); 
	  }
	
	@Test(priority = 23)
	  public void verifyAutoDec() {
		  iTimeBoxactions.validateAutoDec(); 
	  }
	
	@Test(priority = 24)
	  public void verifyTimeBox2Inc() {
		  iTimeBoxactions.validateTimeBox2Inc(); 
	  }

	@Test(priority = 25)
	  public void verifyTimeBox2Dec() {
		  iTimeBoxactions.validateTimeBox2Dec(); 
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

	

}
