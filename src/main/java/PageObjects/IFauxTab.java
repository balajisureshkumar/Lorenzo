package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testbase.Baseclass;

public class IFauxTab extends Baseclass {
	
	public IFauxTab() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "fauxtab")
	public static WebElement fauxTab;
	
	@FindBy(id = "ifC_fauxTab")
	public static WebElement allTestTab;
	
	@FindBy(id = "fTb_fauxTab0")
	public static WebElement testTab1;
	
	@FindBy(id = "fTb_fauxTab1")
	public static WebElement testTab2;
	
	@FindBy(id = "fTb_fauxTab2")
	public static WebElement testTab3;
	
	@FindBy(id = "fTb_fauxTab3")
	public static WebElement testTab4;
	
	@FindBy(id = "fTb_fauxTab4")
	public static WebElement testTab5;
	
	@FindBy(id = "fTb_fauxTab5")
	public static WebElement testTab6;
	
	@FindBy(id = "fTb_fauxTab6")
	public static WebElement testTab7;
	
	@FindBy(id = "fTb_fauxTab7")
	public static WebElement testTab8;
	
	@FindBy(id = "fTb_fauxTab8")
	public static WebElement testTab9;
	
	@FindBy(id = "fTb_fauxTab9")
	public static WebElement testTab10;
	
	@FindBy(id = "fTb_fauxTab10")
	public static WebElement testTab11;
	
	
	@FindBy(id = "fTb_fauxTab11")
	public static WebElement testTab12;
	
	@FindBy(id = "fTb_fauxTab12")
	public static WebElement testTab13;
	
	@FindBy(id = "fTb_fauxTab13")
	public static WebElement testTab14;
	
	@FindBy(id = "fTb_fauxTab14")
	public static WebElement testTab15;
	
	@FindBy(id = "fTb_fauxTab15")
	public static WebElement testTab16;
	
	@FindBy(xpath = "//td[@title='Display Name']")
	public static WebElement displayName;
	
	@FindBy(id = "iO_A_optEnableDisable_0")
	public static WebElement enableTrue;
	
	@FindBy(id = "iO_A_optEnableDisable_1")
	public static WebElement enableFalse;
	
	@FindBy(xpath = "//td[@title='Enable']")
	public static WebElement enable;
	
	@FindBy(id = "iO_A_optVisible_0")
	public static WebElement visibleTrue;
	
	@FindBy(id = "iO_A_optVisible_1")
	public static WebElement visibleFalse;
	
	@FindBy(xpath = "//td[@title='Visible']")
	public static WebElement visible;
	
	@FindBy(xpath = "//td[@title='Show Tool Tip']")
	public static WebElement showToolTip;
	
	@FindBy(id = "iO_A_optShowToolTip_1")
	public static WebElement showToolTipFalse;
	
	@FindBy(id = "iO_A_optShowToolTip_0")
	public static WebElement showToolTipTrue;
	
	@FindBy(xpath = "//td[@title='Get Active Tab Index']")
	public static WebElement getActiveTabIndex;
	
	@FindBy(xpath = "//td[@title='Get Active Tab Name']")
	public static WebElement getActiveTabName;
	
	@FindBy(xpath = "//td[@title='Set Tool Tip']")
	public static WebElement setToolTip;
	
	@FindBy(id = "icombobox_Image_cmbSetToolTip")
	public static WebElement setToolTipDrop;
	
	@FindBy(xpath = "//select[@id='icombobox_List_cmbSetToolTip']")
	public static WebElement setToolTipSelect;
	
	@FindBy(xpath = "//td[@title='Frame Loaded']")
	public static WebElement frameLoaded;
	
	@FindBy(xpath = "//td[@title='Selected Tab Id']")
	public static WebElement selectedTabId;
	
	@FindBy(xpath = "//td[@title='Enable/Disable Tab']")
	public static WebElement enableDisableTab1;
	
	@FindBy(id = "icombobox_Image_cmbEnableTabByTabKey")
	public static WebElement enableDisableTab1drop;
	
	@FindBy(xpath = "//select[@id='icombobox_List_cmbEnableTabByTabKey']")
	public static WebElement enableDisableTab1Select;
	
	@FindBy(xpath = "//td[@title='Visible Tab']")
	public static WebElement visibleTab1;
	
	@FindBy(id = "icombobox_Image_cmbVisibleTabByKey")
	public static WebElement visibleTab1Drop;
	
	@FindBy(xpath = "//select[@id='icombobox_List_cmbVisibleTabByKey']")
	public static WebElement visibleTab1Select;
	
	@FindBy(xpath = "//td[@title='Set Tab Mandatory']")
	public static WebElement setTabMandatory;
	
	@FindBy(id = "icombobox_Image_cmbMandatory")
	public static WebElement setTabMandatoryDrop;
	
	@FindBy(xpath = "//select[@id='icombobox_List_cmbMandatory']")
	public static WebElement setTabMandatorySelect;
	
	@FindBy(xpath = "//td[@title='Get Active Tab Key']")
	public static WebElement getActiveTabKey;
	
	@FindBy(xpath = "//td[@title='Tab Count']")
	public static WebElement tabCount;
	
	@FindBy(xpath = "//td[@title='Lock/UnLock Tab']")
	public static WebElement lockUnlockTab;
	
	@FindBy(xpath = "//td[@title='Is Show']")
	public static WebElement isShow;
	
	@FindBy(xpath = "//td[@title='Enable/Disable Tab By Tab']")
	public static WebElement enableDisableTab2;
	
	@FindBy(id = "icombobox_Image_cmbEnableTabByTab")
	public static WebElement enableDisableTab2Drop;
	
	@FindBy(xpath = "//select[@id='icombobox_List_cmbEnableTabByTab']")
	public static WebElement enableDisableTab2Select;

	@FindBy(xpath = "//td[@title='Visible Tab By Tab']")
	public static WebElement visibleTab2;
	
	@FindBy(id = "icombobox_Image_cmbVisibleTabByTab")
	public static WebElement visibleTab2Drop;
	
	@FindBy(xpath = "//select[@id='icombobox_List_cmbVisibleTabByTab']")
	public static WebElement visibleTab2Select;
	
	@FindBy(xpath = "//td[@title='Set Active Tab']")
	public static WebElement setActiveTab;
	
	@FindBy(id = "icombobox_Image_cmbSetActiveTab")
	public static WebElement setActiveTabDrop;
	
	@FindBy(xpath = "//select[@id='icombobox_List_cmbSetActiveTab']")
	public static WebElement setActiveTabSelect;
	
	@FindBy(xpath = "//td[@title='Get Tag']")
	public static WebElement getTag;
	
	@FindBy(id = "icombobox_Image_cmbGetTag")
	public static WebElement getTagDrop;
	
	@FindBy(xpath = "//select[@id='icombobox_List_cmbGetTag']")
	public static WebElement getTagSelect;
	
	@FindBy(xpath = "//td[@title='Set Tag']")
	public static WebElement setTag;
	
	@FindBy(id = "icombobox_Image_cmbSetTag")
	public static WebElement setTagDrop;
	
	@FindBy(xpath = "//select[@id='icombobox_List_cmbSetTag']")
	public static WebElement setTagSelect;
	
	@FindBy(id = "it_C_txtSetTag")
	public static WebElement setTagText;
	
	@FindBy(xpath = "//td[@title='Select Tab (Click func)']")
	public static WebElement selectTab;
	
	@FindBy(id = "icombobox_Image_cmbClickTab")
	public static WebElement selectTabDrop;
	
	@FindBy(xpath = "//select[@id='icombobox_List_cmbClickTab']")
	public static WebElement selectTabSelect;
}
