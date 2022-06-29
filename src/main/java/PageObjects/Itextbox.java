package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import PageActions.staticString;
import Testbase.Baseclass;
import exceldata.DataGetTest;

public class Itextbox extends Baseclass {

	public Itextbox() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "textbox")
	public static WebElement txtBox;

	@FindBy(id = "it_C_iTxtNormal")
	public static WebElement text;

	@FindBy(id = "iO_A_IoptionEnableDisable_0")
	public static WebElement enableYes;

	@FindBy(id = "iO_A_IoptionEnableDisable_1")
	public static WebElement enableNo;

	@FindBy(id = "iO_A_IoptionVisibleInvisible_1")
	public static WebElement visibleNo;

	@FindBy(id = "iO_A_IoptionVisibleInvisible_0")
	public static WebElement visibleYes;

	@FindBy(id = "iO_A_IoptionReadOnly_1")
	public static WebElement readOnlyNo;

	@FindBy(id = "iO_A_IoptionReadOnly_0")
	public static WebElement readOnlyYes;

	@FindBy(id = "iO_I_IoptionMandatory_1")
	public static WebElement mandNo;

	@FindBy(id = "iO_A_IoptionMandatory_0")
	public static WebElement mandYes;

	@FindBy(id = "iO_A_IoptionDisplayed_1")
	public static WebElement displayNo;

	@FindBy(id = "iO_A_IoptionDisplayed_0")
	public static WebElement displayYes;

	@FindBy(xpath = "//td[text()='Clear All']")
	public static WebElement clearAll;

	@FindBy(xpath = "//input[@id='it_C_iTxtAlpha1']")
	public static WebElement textAlpha;

	@FindBy(xpath = "(//td[@title='SetText'])[4]")
	public static WebElement setAlpha;

	@FindBy(xpath = "(//td[@title='GetText'])[4]")
	public static WebElement getAlpha;

	@FindBy(xpath = "(//td[@title='Validate'])[1]")
	public static WebElement ValAlpha;

	@FindBy(id = "it_C_iTxtAlphaNumeric")
	public static WebElement textAlphaNum;

	@FindBy(xpath = "(//td[@title='SetText'])[5]")
	public static WebElement setAlphaNum;

	@FindBy(xpath = "(//td[@title='GetText'])[5]")
	public static WebElement getAlphaNum;

	@FindBy(xpath = "(//td[@title='Validate'])[2]")
	public static WebElement ValAlphaNum;

	@FindBy(id = "it_C_iTxtMultiline")
	public static WebElement textMulti;

	@FindBy(xpath = "(//td[@title='SetText'])[2]")
	public static WebElement setMulti;

	@FindBy(xpath = "(//td[@title='GetText'])[2]")
	public static WebElement getMulti;

	@FindBy(xpath = "//td[@title='SetText/SetValue']")
	public static WebElement normalSet;

	@FindBy(xpath = "//td[@title='GetText/GetValue']")
	public static WebElement normalGet;

	@FindBy(id = "it_C_iTxtNumeric")
	public static WebElement numText;

	@FindBy(xpath = "(//td[@title='GetText'])[3]")
	public static WebElement numGet;;

	@FindBy(xpath = "(//td[@title='SetText'])[3]")
	public static WebElement numSet;

	@FindBy(xpath = "//td[@title='Validate DataType']")
	public static WebElement numValData;

	@FindBy(xpath = "//td[@title='Validate Required']")
	public static WebElement numValReq;

	@FindBy(xpath = "//td[@title='Validate Range']")
	public static WebElement numValRange;

	@FindBy(id = "it_C_itxtTextPwd")
	public static WebElement textpass;

	@FindBy(xpath = "(//td[@title='SetText'])[1]")
	public static WebElement passSet;

	@FindBy(xpath = "(//td[@title='GetText'])[1]")
	public static WebElement passGet;

}
