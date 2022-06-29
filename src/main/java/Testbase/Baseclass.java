package Testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import exceldata.DataGetTest;

public class Baseclass {
	public static WebDriver driver;
	public static Properties prop;

	public Baseclass() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\xbsureshkuma2\\eclipse-workspace\\Lorenzo\\src\\main\\java\\lorenzo\\config\\config.properties");
			prop.load(ip);

		} catch (FileSystemNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void initialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("Edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\xbsureshkuma2\\eclipse-workspace\\Lorenzo\\Drivers\\msedgedriver.exe");
			 driver = new EdgeDriver();
		}
		else if (browsername.equals("ie")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\xbsureshkuma2\\eclipse-workspace\\Lorenzo\\Drivers\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("url"));
		
	}
	

	public static void clickonelement(WebElement element) {
		element.click();
	}

	public static void inputvalue(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}
	
	public static void Currenturl(String currenturl) {
		driver.getCurrentUrl();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	public static void explicitwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement exwait = wait.until(ExpectedConditions.visibilityOf(element));
	}


	public static void dropdown(WebElement element, String value) {
	Select sel = new Select(element);
	sel.selectByVisibleText(value);
	}



	public static void mouseactions(WebElement element, String value) {
		Actions act = new Actions(driver);
		if (value.equalsIgnoreCase("click")) {
			act.click(element).build().perform();

		} else if (value.equalsIgnoreCase("doubleclick")) {
			act.doubleClick(element).build().perform();
		} else if (value.equalsIgnoreCase("rightclick")) {
			act.contextClick(element).build().perform();

		} else if (value.equalsIgnoreCase("Mousehover")) {
			act.moveToElement(element).build().perform();

		}
	}

	public static void screeenshot(String value) throws IOException {
		try {
			TakesScreenshot pic = (TakesScreenshot) driver;
			File format = pic.getScreenshotAs(OutputType.FILE);
			File path = new File(
					"C:\\Users\\xbsureshkuma2\\eclipse-workspace\\Lorenzo\\Screenshots\\"+value+".png");
			FileUtils.copyFile(format, path);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void frames( WebElement element,String value) {

		driver.switchTo().frame(value);

	}

	public static void defaultframes(WebDriver driv) {

		driver.switchTo().defaultContent();

	}
	
	public static boolean checkisdisplayed (WebElement element) {
		if( element.isDisplayed()){
			System.out.println("Element is Visible");
			}else{
			System.out.println("Element is InVisible");
			}
         return element.isDisplayed();
	}	

	public static boolean checkisenable (WebElement element) {
		if( element.isEnabled()){
			System.out.println("Element is Enable");
			}
		else{
			System.out.println("Element is disable");
			}
		return element.isEnabled();
	}
	public static void Mousefocus(WebElement element) {
		if(element.equals(driver.switchTo().activeElement()))
		System.out.println("Element is focused");
		else
		System.out.println("Element is not focused");
		}

	public static boolean alertext(String Value) {
		Alert alert = driver.switchTo().alert();
		boolean checkalerttext= alert.getText().equals(Value);
		if(checkalerttext) {
		System.out.println(Value + "Is the Alert text");}
		else {
		System.out.println("Alert text is different");
		}
		alert.accept();
		return checkalerttext;

		}
	public Boolean checkshowTooltip(WebElement element, String value) {
		Boolean Tooltip = element.getAttribute("title").equals(value);
		System.out.println("Tool tip is " + Tooltip);
		if(Tooltip) {
		System.out.println(" show tool tip");
		} else{
		System.out.println(" tooltip is hidden");
		}
		return Tooltip;
		}
	
	public static void dropdownbytext(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByVisibleText(value);
		}

	public static void dropdownbyvalue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
		}
	public static void dropdownbyindex(WebElement element, int value) {
		Select sel = new Select(element);
		sel.selectByIndex(value);
		}
	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public static String excelRead(int rowNo, int cellNo, String sheetName) throws IOException {
		
		File f = new File("C:\\Users\\xbsureshkuma2\\eclipse-workspace\\Lorenzo\\datafiles\\Testdata.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet(sheetName);
		
		                 Row r = s.getRow(rowNo);
		        Cell c = r.getCell(cellNo);
		        
		        int type = c.getCellType();
		        String value = "";
		        if(type == 1) {
		        	value = c.getStringCellValue();
		        }
		        else if (DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();
		        	SimpleDateFormat sim = new SimpleDateFormat("dd-MM-YYYY");
		        	value = sim.format(d);
				}
		        else {
					double dd = c.getNumericCellValue();
					long l = (long)dd;
					value = String.valueOf(l);
				}
		        return value;
	}
	
	public Boolean checkTextvalidation(WebElement element, String input) {
		Boolean Textvalidation = element.getAttribute("value").equals(input);
		System.out.println("Inside the text box " + Textvalidation);
		if (Textvalidation) {
		System.out.println(" Successfully validated the text box value");
		} else {
		System.out.println(" Failed validating the text box value");
		}
		return Textvalidation;
		}
	
	public static void implicitwait(WebDriver driver, int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		}



	public static void explicitwait(WebDriver driver, WebElement element, int sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		WebElement exwait = wait.until(ExpectedConditions.visibilityOf(element));
		}
	
	public static boolean verifycolour(WebElement element, String value) {
		WebElement actualcolor = element;
		String bgcolor = actualcolor.getCssValue("color");
		System.out.println(bgcolor);
		String hexcolor = Color.fromString(bgcolor).asHex();
		System.out.println(hexcolor);
		boolean verify = hexcolor.equals(value);
		if (verify) {
		System.out.println("Successfully verified color");
		}
		else {
		System.out.println("not verified color");
		}
		return verify;
		}
	
	public boolean checkisSelected (WebElement element) {
		if(element.isSelected()){
			System.out.println("Element is Selected");
			}
		else{
			System.out.println("Element is UnSelected");
			}
        return element.isSelected();
	    }
	
	
	
}
