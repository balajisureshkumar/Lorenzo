package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testbase.Baseclass;

public class ITimeBox extends Baseclass {
	
	public ITimeBox() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='timebox']")
	public static WebElement timeBox;
	
	@FindBy(id = "itimebox_Value_iTimeBox1")
	public static WebElement timeBox1;
	
	@FindBy(id = "itimebox_Control_iTimeBox1")
	public static WebElement timeBox1Cntrol;
	
	@FindBy(id = "itimebox_AMPM_iTimeBox1")
	public static WebElement timeBox1rowSpan;
	
	@FindBy(id = "itimebox_Control_iTimeBox1")
	public static WebElement timeBox1ToolTip;
	
	@FindBy(xpath = "//img[@id='itimebox_Up_iTimeBox1']")
	public static WebElement timeBox1Inc;
	
	@FindBy(xpath = "//img[@id='itimebox_Down_iTimeBox1']")
	public static WebElement timeBox1Dec;
	
	@FindBy(id = "it_C_iTxtTextBox")
	public static WebElement textBox;
	
	@FindBy(xpath = "//td[@title='SetText/SetValue']")
	public static WebElement setText;
	
	@FindBy(xpath = "//td[@title='GetText/GetValue']")
	public static WebElement GetText;
	
	@FindBy(xpath = "//td[@title='Clear Text']")
	public static WebElement clearText;
	
	@FindBy(xpath = "//td[@title='GetTime']")
	public static WebElement getTime; 	
	
	@FindBy(xpath = "//td[@title='Start Auto Increment']")
	public static WebElement setAutoInc;
	
	@FindBy(xpath = "//td[@title='Start Auto Decrement']")
	public static WebElement setAutoDec;
	
	@FindBy(xpath = "//td[@title='Stop']")
	public static WebElement stop;
	
	@FindBy(xpath = "//td[@title='IsValid']")
	public static WebElement isValid;
	
	@FindBy(id = "iO_A_IoptionEnableDisable_0")
	public static WebElement enableTrue;
	
	@FindBy(id = "iO_A_IoptionEnableDisable_1")
	public static WebElement enableFalse;
	
	@FindBy(id = "iO_A_IoptionVisibleInvisible_0")
	public static WebElement visibleTrue;
	
	@FindBy(id = "iO_A_IoptionVisibleInvisible_1")
	public static WebElement visibleFalse;	
	
	@FindBy(id = "iO_A_IoptionReadOnly_0")
	public static WebElement readOnlyTrue;
	
	@FindBy(id = "iO_A_IoptionReadOnly_1")
	public static WebElement readOnlyFalse;
	
	@FindBy(id = "iO_A_IoptionMandatory_0")
	public static WebElement mandTrue;
	
	@FindBy(id = "iO_A_IoptionMandatory_1")
	public static WebElement mandFalse;
	
	@FindBy(id = "iO_A_IoptionDisplayed_0")
	public static WebElement displayTrue;
	
	@FindBy(id = "iO_A_IoptionDisplayed_1")
	public static WebElement displayFalse;
	
	@FindBy(id = "iO_A_ioptionShowToolTip_0")
	public static WebElement showToolTipTrue;
	
	@FindBy(id = "iO_A_ioptionShowToolTip_1")
	public static WebElement showToolTipFalse;

	@FindBy(xpath = "//td[@title='Clear All']")
	public static WebElement clearAll;
	
	@FindBy(id = "itimebox_Text_iTimeBox2")
	public static WebElement timeBox2;
	
	@FindBy(xpath = "//img[@id='itimebox_Up_iTimeBox2']")
	public static WebElement timeBox2Inc;
	
	@FindBy(xpath = "//img[@id='itimebox_Down_iTimeBox2']")
	public static WebElement timeBox2Dec;
	
	@FindBy(xpath = "//td[@title='IsValid Time']")
	public static WebElement isValidTime;
	
	@FindBy(xpath = "(//input[@class='Timebox_Normal iTB_T_HR'])[2]")
	public static WebElement timeBox2Hours;
	
	@FindBy(id = "itimebox_Text_iTimeBox2")
	public static WebElement timeBox2HoursOutBox;

	@FindBy(id = "itimebox_Min_iTimeBox2")
	public static WebElement timeBox2Mins;
	
	@FindBy(id = "itimebox_Value_iTimeBox2")
	public static WebElement timeBox2Hidden;
	
	
}
