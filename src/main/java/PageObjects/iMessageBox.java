package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testbase.Baseclass;

public class iMessageBox extends Baseclass {
	
	public iMessageBox() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='messagebox']")
	public static WebElement messageBox;
	
	@FindBy(xpath = "(//td[@title='SetValue'])[1]")
	public static WebElement sample1;
	
	@FindBy(xpath = "(//td[@title='SetValue'])[2]")
	public static WebElement sample2;
	
	@FindBy(xpath = "(//td[@class='Cmd_TTE'])[1]")
	public static WebElement sample2Yes;
	
	@FindBy(xpath = "(//td[@class='Cmd_TTE'])[2]")
	public static WebElement sample2No;
	
	@FindBy(xpath = "(//td[@class='Cmd_TTE'])[3]")
	public static WebElement sample2Cancel;
	
	@FindBy(xpath = "(//td[@title='SetValue'])[3]")
	public static WebElement sample3;
	
	@FindBy(xpath = "(//td[@class='Cmd_TTE'])[1]")
	public static WebElement sample3Yes;
	
	@FindBy(xpath = "(//td[@class='Cmd_TTE'])[2]")
	public static WebElement sample3No;
	
	@FindBy(xpath = "(//td[@title='SetValue'])[4]")
	public static WebElement sample4;
	
	@FindBy(xpath = "(//td[@class='Cmd_TTE'])[1]")
	public static WebElement sample4Abort;
	
	@FindBy(xpath = "(//td[@class='Cmd_TTE'])[2]")
	public static WebElement sample4Retry;
	
	@FindBy(xpath = "(//td[@class='Cmd_TTE'])[3]")
	public static WebElement sample4Ignore;
	
	@FindBy(xpath = "(//td[@title='SetValue'])[5]")
	public static WebElement sample5;
	
	@FindBy(xpath = "(//td[@class='Cmd_TTE'])[1]")
	public static WebElement sample5Ok;
	
	@FindBy(xpath = "(//td[@class='Cmd_TTE'])[2]")
	public static WebElement sample5Cancel;
	
	@FindBy(xpath = "//td[@title='Show Message With Retry/Cancel']")
	public static WebElement sample6;
	
	@FindBy(xpath = "(//td[@class='Cmd_TTE'])[1]")
	public static WebElement sample6Retry;
	
	@FindBy(xpath = "(//td[@class='Cmd_TTE'])[2]")
	public static WebElement sample6Cancel;
	
	@FindBy(xpath = "//td[@title='Show Message on Modal']")
	public static WebElement sample7;
	
	@FindBy(xpath = "//td[@title='Show Messagebox with Multiple Parameter']")
	public static WebElement sample8;
	
	@FindBy(xpath = "(//div[@class='msgbox_AL']//div)[2]")
	public static WebElement sample8MessageBox;
	
	@FindBy(xpath = "//a[@id='dialog-close']")
	public static WebElement close;
	
	@FindBy(xpath = "(//td[@class='Cmd_TTE'])[1]")
	public static WebElement sample1Yes;

}
