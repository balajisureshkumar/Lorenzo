package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testbase.Baseclass;

public class IToolBarbutton extends Baseclass {
	
	public IToolBarbutton() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "toolbarbutton")
	public static WebElement toolBarBtn;
	
	@FindBy(xpath = "//td[@title='Visible']")
	public static WebElement visible;
	
	@FindBy(xpath = "//td[@id='itoolbutton_LabelArea_IToolBarButton1']")
	public static WebElement toolBtn1;
	
	@FindBy(xpath = "//input[@id='itoolbutton_Value_IToolBarButton2']")
	public static WebElement toolBtn2;
	

	@FindBy(xpath = "//td[@title='Enable Sample2']")
	public static WebElement enable;
	
	@FindBy(xpath = "//td[@title='Show Tooltip']")
	public static WebElement showToolTip;
	
	@FindBy(xpath = "(//span[@class='ToolbarButton_TDS'])[11]")
	public static WebElement sampleIconBtn3;	
	
	@FindBy(xpath = "//td[@title='Hide Tooltip']")
	public static WebElement hideTooltip;
	
	@FindBy(xpath = "//td[@title='GetText']")
	public static WebElement getText;
	
	@FindBy(xpath = "//td[@title='SetText']")
	public static WebElement setText;
	
	@FindBy(id = "iCLBC_chklsCity")
	public static WebElement sample6Item;
	
	@FindBy(xpath = "//td[@title='Add Item']")
	public static WebElement addItem;
	
	@FindBy(xpath = "//td[@title='Remove Item']")
	public static WebElement remItem;
	
	@FindBy(xpath = "//td[@title='Clear/uncheck']")
	public static WebElement clearItem;
	
	@FindBy(xpath = "//td[@title='Add Image Item']")
	public static WebElement addImg;
	
	@FindBy(xpath = "//label[text()='Sample1']")
	public static WebElement newAdd1;
	
	@FindBy(id = "iC_IIm_0_chklsCity")
	public static WebElement sam6Bangalore;	
	
	@FindBy(xpath = "//td[@id='iC_I_0_chklsCity']")
	public static WebElement sam6BangaloreCheck;
	
	@FindBy(id = "itoolbutton_Arrow_IToolBarButton7")
	public static WebElement sample7Arrow;
	
	@FindBy(xpath = "(//span[@class='ToolbarButton_TDS'])[29]")
	public static WebElement sample7Item1;
	
	@FindBy(xpath = "//td[@title='Show list']")
	public static WebElement sample5ShowList;
	
	@FindBy(id = "itoolbutton_List_IToolBarButton5")
	public static WebElement sample5ShowListItem;
	
	@FindBy(xpath = "//td[@title='Hide Drop']")
	public static WebElement sample5HideDrop;
	
	@FindBy(xpath = "//td[@title='Get Count']")
	public static WebElement sample5GetCount;
	
	@FindBy(xpath = "//td[@title='Default Focus']")
	public static WebElement sample5Focus;
	
	@FindBy(id = "itoolbutton_Control_IToolBarButton5")
	public static WebElement sample5;
	
	@FindBy(id = "itoolbutton_Arrow_IToolBarButton5")
	public static WebElement sample5arrow;
	
	@FindBy(id = "dialog-close")
	public static WebElement sample5diagClose;
	
	@FindBy(xpath = "(//tr[@id='itoolbutton_Item_IToolBarButton5'])[7]")
	public static WebElement sample5Item6;
	
	@FindBy(xpath = "(//tr[@id='itoolbutton_Item_IToolBarButton5'])[2]")
	public static WebElement sample5Item1;
	
	@FindBy(xpath = "(//tr[@id='itoolbutton_Item_IToolBarButton5'])[6]")
	public static WebElement sample5Item5;
	
	@FindBy(id = "itoolbutton_List_IToolBarButton5")
	public static WebElement sample5ItemAll;

}
