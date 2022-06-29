import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class label {
	
	public static void main(String[] args) throws Throwable {
	


		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\xnkumard2\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("http://dhhanzchne6238a/StandardsTestApp/start.html");
		driver.findElement(By.id("checkbox")).click();
		driver.switchTo().frame("mainframe");
		
		driver.findElement(By.id("ICommandButton28")).click();
		Boolean color1 = driver.findElement(By.xpath("//*[@id=\"iCA_ITestCheckBox7\"]")).getAttribute("tooltip").equals("Check to select/unselect checkbox");
	
		System.out.println("Tool tip is "+color1);
		if (color1) {
			System.out.println("successfully validated tooltip");
			
		}
		else {
			System.out.println("failed  tooltip validation");
		}
		driver.quit();
		
		
//		String bg = color1.getCssValue("color");
//		System.out.println(bg);
//		driver.quit();
//	String bg1 = Color.fromString(bg).asHex();
//		System.out.println(bg1);
	}
	}
