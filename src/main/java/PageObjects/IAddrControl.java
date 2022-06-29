package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testbase.Baseclass;

public class IAddrControl extends Baseclass{
	
	public IAddrControl() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "addr")
	public static WebElement addrControlBtn;
	
	@FindBy(id = "iAddressctrl")
	public static WebElement addrControlBox;
	
	@FindBy(id = "iPCAddress_Image")
	public static WebElement sfsIcon;
	
	@FindBy(id = "icombobox_Image_IComboBox1")
	public static WebElement dropBox1;	
	
	@FindBy(xpath = "//select[@id='icombobox_List_IComboBox1']")
	public static WebElement dropBox1Select;	
	
	@FindBy(id = "iO_A_IOptionButtons1_0")
	public static WebElement dropBox1True;
	
	@FindBy(id = "iO_A_IOptionButtons1_1")
	public static WebElement dropBox1False;
	
	@FindBy(id = "it_C_ITextBox1")
	public static WebElement textBox;
	
	@FindBy(id = "ilistbox_Item_IListBox1_0")
	public static WebElement isAddControlEnable;
	
	@FindBy(id = "ilistbox_Item_IListBox1_1")
	public static WebElement isAddControlVisible;
	
	@FindBy(id = "ilistbox_Item_IListBox1_2")
	public static WebElement isSFSEnable;
	
	@FindBy(id = "ilistbox_Item_IListBox1_3")
	public static WebElement isSFSVisible;
	
	@FindBy(xpath = "//td[@title='SetFocus']")
	public static WebElement setFocus;
	
	@FindBy(xpath = "//td[@title='Get Country Text']")
	public static WebElement getCountryText;
	
	@FindBy(xpath = "//td[@title='Get Country Value']")
	public static WebElement getCountryValue;
	
	@FindBy(xpath = "//td[@title='Set Country Text']")
	public static WebElement setCountryText;
	
	@FindBy(xpath = "//td[@title='Set Country Value']")
	public static WebElement setCountryValue;
	
	@FindBy(xpath = "//td[@title='Show Address']")
	public static WebElement showAdd;
	
	@FindBy(xpath = "//td[@title='Show Address Type']")
	public static WebElement showAddType;
	
	@FindBy(xpath = "//td[@title='Get SFS icon visible status']")
	public static WebElement getSFSvisibleStatus;
	
	@FindBy(xpath = "//td[@title='Get SFS Display status']")
	public static WebElement getSFSDisplayStatus;
	
	@FindBy(xpath = "//td[@title='Load Adrress Controls']")
	public static WebElement loadAddControl;
	
	@FindBy(id = "it_C_IAddrControl1_tA1")
	public static WebElement address1;
	
	@FindBy(id = "it_C_IAddrControl1_itA")
	public static WebElement address0;
	
	@FindBy(id = "C2_IAddrControl1_iCA")
	public static WebElement addresstype;
	
	@FindBy(xpath = "//td[@title='Show tool tip']")
	public static WebElement showToolTip;
	
	@FindBy(id = "icombobox_Image_IComboBox2")
	public static WebElement dropBox2;
	
	@FindBy(id = "icombobox_List_IComboBox2")
	public static WebElement dropBox2Select;
	
	@FindBy(xpath = "//td[@title='Set']")
	public static WebElement dropBox2Set;
	
	@FindBy(xpath = "//td[@title='Get']")
	public static WebElement dropBox2Get;
	
	@FindBy(id = "iO_A_IOptionButtons2_1")
	public static WebElement commnuication;
	
	@FindBy(xpath = "//input[@id='Submit2']")
	public static WebElement submit;
	
	@FindBy(id = "iO_I_IOptionButtons2_2")
	public static WebElement both;
	
	@FindBy(id = "it_C_IAddrControl1_Tpn")
	public static WebElement telephone;
	
	@FindBy(id = "it_C_IAddrControl1_tA1")
	public static WebElement address1side;

	@FindBy(id = "it_C_IAddrControl1_tFx")
	public static WebElement fax;
	
	@FindBy(id = "it_C_IAddrControl1_tEl")
	public static WebElement email;
	
	@FindBy(id = "it_C_IAddrControl1_tWt")
	public static WebElement website;
	
	@FindBy(id = "C2T_IAddrControl1_iCC")
	public static WebElement city;
	
	@FindBy(id = "it_C_IAddrControl1_PCd")
	public static WebElement postalCode;
	
	@FindBy(id = "iO_A_IOptionButtons3_0")
	public static WebElement horizontal;
	
	@FindBy(id = "iO_A_IOptionButtons3_1")
	public static WebElement vertical;
	
	@FindBy(xpath = "//table[@id='HorizontalLarge']")
	public static WebElement horizontalLarge;
	
	@FindBy(xpath = "//table[@id='VerticalLarge']")
	public static WebElement verticalLarge;
	
	@FindBy(id = "iO_A_IOptionButtons5_0")
	public static WebElement Large;
	
	@FindBy(id = "iO_A_IOptionButtons5_1")
	public static WebElement medium;
	
	@FindBy(id = "iO_A_IOptionButtons5_2")
	public static WebElement small;
	
	@FindBy(id = "it_C_IAddrControl1_tA2")
	public static WebElement address2;
	
	@FindBy(id = "it_C_IAddrControl1_tA3")
	public static WebElement address3;
	
	@FindBy(id = "it_C_IAddrControl1_tA4")
	public static WebElement address4;
	
	@FindBy(id = "it_C_IAddrControl1_tA5")
	public static WebElement address5;
	
	@FindBy(id = "C2T_IAddrControl1_iCy")
	public static WebElement country;
	
	@FindBy(id = "C2T_IAddrControl1_iCS")
	public static WebElement state;
	
	@FindBy(id = "C2T_IAddrControl1_Ctn")
	public static WebElement county;

}
