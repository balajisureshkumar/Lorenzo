package PageActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.Assert;

import PageObjects.IAddrControl;

public class iAddrControlActions extends IAddrControl {

	public void mainAddrControl() {
		addrControlBtn.click();
		frames(addrControlBtn, "mainframe");
	}
	
	public void validateEnableSFSiconTrue() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Enable SFS Icon");
		dropBox1True.click();
		Assert.assertTrue(checkisenable(sfsIcon));
		System.out.println("Successfully validate Enable SFS Icon True");
	}
	public void validateEnableSFSiconFalse() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Enable SFS Icon");
		dropBox1False.click();
		String actualResult = sfsIcon.getAttribute("title");
		Assert.assertEquals(actualResult, "");
		System.out.println("Successfully validate Enable SFS Icon False");
	}
	public void validateVisibleSFSiconTrue() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Visible SFS Icon");
		dropBox1True.click();
		Assert.assertTrue(checkisdisplayed(sfsIcon));
		System.out.println("Successfully validate Visible SFS Icon True");
	}
	public void validateVisibleSFSiconFalse() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Visible SFS Icon");
		dropBox1False.click();
		Assert.assertFalse(checkisdisplayed(sfsIcon));
		System.out.println("Successfully validate Visible SFS Icon False");
	}
	public void validateEnableAddressTrue() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Enable Address Control");
		dropBox1True.click();
		Assert.assertTrue(checkisenable(addrControlBox));
		System.out.println("Successfully validate Enable Address Control True");
	}
	public void validateEnableAddressFalse() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Enable Address Control");
		dropBox1False.click();
		String actualResult = addrControlBox.getAttribute("enabled");
		Assert.assertEquals(actualResult, "false");
		System.out.println("Successfully validate Enable Address Control False");
	}
	public void validateVisibleAddressTrue() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Visible Address Control");
		dropBox1True.click();
		String actualResult = addrControlBox.getAttribute("visible");
		Assert.assertEquals(actualResult, "true");
		System.out.println("Successfully validate VisibleAddressTrue");
	}
	public void validateVisibleAddressFalse() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Visible Address Control");
		dropBox1False.click();
		String actualResult = addrControlBox.getAttribute("visible");
		Assert.assertEquals(actualResult, "false");
		System.out.println("Successfully validate VisibleAddress False");
	}
	public void validateIsEnableAddressTrue() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Enable Address Control");
		dropBox1True.click();
		isAddControlEnable.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, "true");
		System.out.println("Successfully validate IsEnableAddressTrue");
	}
	public void validateIsEnableAddressFalse() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Enable Address Control");
		dropBox1False.click();
		isAddControlEnable.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, "false");
		System.out.println("Successfully validate IsEnableAddressFalse");
	}
	public void validateIsVisibleAddressTrue() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Visible Address Control");
		dropBox1True.click();
		isAddControlVisible.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, "true");
		System.out.println("Successfully validate IsVisibleAddressTrue");
	}
	public void validateIsVisibleAddressFalse() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Visible Address Control");
		dropBox1False.click();
		isAddControlVisible.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, "false");
		System.out.println("Successfully validate IsVisibleAddress False");
	}
	public void validateIsEnableSFSiconTrue() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Enable SFS Icon");
		dropBox1True.click();
		isSFSEnable.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, "true");
		System.out.println("Successfully validate IsEnable SFS Icon True");
	}
	public void validateIsEnableSFSiconFalse() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Enable SFS Icon");
		dropBox1False.click();
		isSFSEnable.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, "false");
		System.out.println("Successfully validate IsEnable SFS Icon False");
	}
	public void validateIsVisibleSFSiconTrue() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Visible SFS Icon");
		dropBox1True.click();
		isSFSVisible.click();
		isSFSVisible.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, "true");
		System.out.println("Successfully validate IsVisible SFS Icon True");
	}
	public void validateIsVisibleSFSiconFalse() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Visible SFS Icon");
		dropBox1False.click();
		isSFSVisible.click();
		isSFSVisible.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, "false");
		System.out.println("Successfully validate IsVisible SFS Icon False");
	}
	public void validatesetFocus() {
		setFocus.click();
		String actualResult = city.getAttribute("class");
		Assert.assertEquals(actualResult, " T_BX Cb_A");
		System.out.println("Successfully validate SetFocus");
	}
	public void validateGetCountryText() {
		setCountryText.click();
		acceptAlert();
		getCountryText.click();
		Assert.assertTrue(alertext("Country text is :Germany"));
		System.out.println("Successfully validate GetCountryText");
	}
	public void validateGetCountryValue() {
		setCountryValue.click();
		acceptAlert();
		getCountryValue.click();
		Assert.assertFalse(alertext("Country value is :undefined"));
		System.out.println("Successfully validate GetCountryValue");
	}
	public void validateSetCountryText() {
		setCountryText.click();
		Assert.assertTrue(alertext("Country text set to Germany"));
		System.out.println("Successfully validate SetCountryText");
	}
	public void validateSetCountryValue() {
		setCountryValue.click();
		Assert.assertTrue(alertext("Country value set to Germany"));
		System.out.println("Successfully validate SetCountryValue");
	}
	public void validateShowAddress() {
		showAdd.click();
		acceptAlert();
		Assert.assertFalse(checkisdisplayed(address0));
		System.out.println("Successfully validate ShowAddress");
	}
	public void validateShowAddressType() {
		showAddType.click();
		acceptAlert();
		Assert.assertFalse(checkisdisplayed(addresstype));
		System.out.println("Successfully validate ShowAddressType");
	}
	public void validateShowToolTip() {
		showToolTip.click();
		acceptAlert();
		String actualResult = address1.getAttribute("title");
		Assert.assertEquals(actualResult, "");
		System.out.println("Successfully validate ShowAddressType");
	}
	public void validateGetSFSVisibleStatusTrue() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Visible SFS Icon");
		dropBox1True.click();
		getSFSvisibleStatus.click();
		Assert.assertTrue(alertext("SFS Icon Visible status is : 1"));
		System.out.println("Successfully validate GetSFSiconVisibleStatusTrue");
	}
	public void validateGetSFSVisibleStatusFalse() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Visible SFS Icon");
		dropBox1False.click();
		getSFSvisibleStatus.click();
		Assert.assertFalse(alertext("SFS Icon Visible status is : 1"));
		System.out.println("Successfully validate GetSFSiconVisibleStatusFalse");
	}
	public void validateGetSFSDisplayStatusTrue() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Enable SFS Icon");
		dropBox1True.click();
		getSFSDisplayStatus.click();
		Assert.assertTrue(alertext("SFS Icon Display status is : 1"));
		System.out.println("Successfully validate GetSFSiconDisplayStatusTrue");
	}
	public void validateGetSFSDisplayStatusFalse() {
		dropBox1.click();
		dropdownbytext(dropBox1Select, "Enable SFS Icon");
		dropBox1False.click();
		getSFSDisplayStatus.click();
		Assert.assertTrue(alertext("SFS Icon Display status is : 0"));
		System.out.println("Successfully validate GetSFSiconDisplayStatusFalse");
	}
	public void validateGetAvailableCodes() throws InterruptedException, IOException {
		commnuication.click();
		submit.click();
		dropBox2.click();
		dropdownbytext(dropBox2Select, "GetAvailableCodes");
		dropBox2Set.click();
		dropBox2Get.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, excelRead(9, 1, "Sheet1"));
		System.out.println("Successfully validate GetAvailableCodes");
	}
	public void validateGetMandatoryCodes() throws InterruptedException, IOException {
		dropBox2.click();
		dropdownbytext(dropBox2Select, "GetMandatoryCodes");
		dropBox2Set.click();
		dropBox2Get.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, excelRead(10, 1, "Sheet1"));
		System.out.println("Successfully validate GetMandatoryCodes");
	}
	public void validateGetEmptyFeildCodes() throws InterruptedException, IOException {
		dropBox2.click();
		dropdownbytext(dropBox2Select, "GetEmptyFieldCodes");
		dropBox2Set.click();
		dropBox2Get.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, "");
		System.out.println("Successfully validate GetEmptyFeildCodes");
	}
	public void validateGetAddress() throws InterruptedException, IOException {
		commnuication.click();
		submit.click();
		dropBox2.click();
		dropdownbytext(dropBox2Select, "GetAddress");
		dropBox2Set.click();
		dropBox2Get.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, excelRead(11, 1, "Sheet1"));
		System.out.println("Successfully validate GetAddress");
	}
	public void validateGetCodeForLabel() throws InterruptedException, IOException {
		commnuication.click();
		submit.click();
		dropBox2.click();
		dropdownbytext(dropBox2Select, "GetCodeForLabel");
		dropBox2Set.click();
		dropBox2Get.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, excelRead(12, 1, "Sheet1"));
		System.out.println("Successfully validate GetCodeForLabel");
	}
	public void validateSetAddress() throws InterruptedException, IOException {
		dropBox2.click();
		dropdownbytext(dropBox2Select, "SetAddress");
		dropBox2Set.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, excelRead(13, 1, "Sheet1"));
		System.out.println("Successfully validate SetAddress");
	}
	public void validateAddressAccessKey() throws AWTException{
		Robot r = new Robot();
//		both.click();
//		submit.click();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_A);
		String actualResult = address1side.getAttribute("class");
        Assert.assertEquals(actualResult, " T_A");
        r.keyRelease(KeyEvent.VK_ALT);
		System.out.println("Successfully validate AddressAccessKey");
	}
	public void validateTeleAccessKey() throws AWTException{
		Robot r = new Robot();
		
		commnuication.click();
		submit.click();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_T);
		String actualResult = telephone.getAttribute("class");	
        Assert.assertEquals(actualResult, "   T_A");
        r.keyRelease(KeyEvent.VK_ALT);
		System.out.println("Successfully validate TeleAccessKey");
	}
	public void validateFaxAccessKey() throws AWTException{
		Robot r = new Robot();
		
		commnuication.click();
		submit.click();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F);
		String actualResult = fax.getAttribute("class");
        Assert.assertEquals(actualResult, " T_A");
        r.keyRelease(KeyEvent.VK_SHIFT);
        r.keyRelease(KeyEvent.VK_ALT);
		System.out.println("Successfully validate FAXAccessKey");
	}
	public void validateEmailAccessKey() throws AWTException{
		Robot r = new Robot();
		
		commnuication.click();
		submit.click();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_E);
		String actualResult = email.getAttribute("class");
        Assert.assertEquals(actualResult, " T_A");
        r.keyRelease(KeyEvent.VK_SHIFT);
        r.keyRelease(KeyEvent.VK_ALT);
		System.out.println("Successfully validate EmailccessKey");
	}
	public void validateWebsiteAccessKey() throws AWTException{
		Robot r = new Robot();
		
		commnuication.click();
		submit.click();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_W);
		String actualResult = website.getAttribute("class");	
        Assert.assertEquals(actualResult, " T_A");
        r.keyRelease(KeyEvent.VK_ALT);
		System.out.println("Successfully validate WebsiteAccessKey");
	}
	public void validatePostalCode() throws IOException {
		postalCode.sendKeys(excelRead(1, 1, "Sheet1"));
		String actualResult = postalCode.getAttribute("value");
		Assert.assertEquals(actualResult, "600017");
		System.out.println("Successfully validate PostalCode");
	}
	public void validateHorizontal() {
		horizontal.click();
		submit.click();
		String actualResult = horizontalLarge.getAttribute("id");
		Assert.assertEquals(actualResult, "HorizontalLarge");
		System.out.println("Successfully validate Horizontal Address Type");
	}
	public void validateVertical() {
		vertical.click();
		submit.click();
		String actualResult = verticalLarge.getAttribute("id");
		Assert.assertEquals(actualResult, "VerticalLarge");
		System.out.println("Successfully validate Vertical Address Type");
	}
	public void validateLargeWizardSize() {
		Large.click();
		submit.click();
		String actualResult = addrControlBox.getAttribute("renderwizardsize");
		Assert.assertEquals(actualResult, "large");
		System.out.println("Successfully validate Large Address Type");
	}
	public void validateMediumWizardSize() {
		medium.click();
		submit.click();
		String actualResult = addrControlBox.getAttribute("renderwizardsize");
		Assert.assertEquals(actualResult, "medium");
		System.out.println("Successfully validate Large Address Type");
	}
	public void validateSmallWizardSize() {
		small.click();
		submit.click();
		String actualResult = addrControlBox.getAttribute("renderwizardsize");
		Assert.assertEquals(actualResult, "small");
		System.out.println("Successfully validate Large Address Type");
	}
	public void validateAddress1Type() {
		address1side.click();
		submit.click();
		Assert.assertTrue(checkisdisplayed(addresstype));
		Assert.assertTrue(checkisdisplayed(address0));
		Assert.assertTrue(checkisdisplayed(address1));
		Assert.assertTrue(checkisdisplayed(address2));
		Assert.assertTrue(checkisdisplayed(address3));
		Assert.assertTrue(checkisdisplayed(address4));
		Assert.assertTrue(checkisdisplayed(address5));
		Assert.assertTrue(checkisdisplayed(country));
		Assert.assertTrue(checkisdisplayed(state));
		Assert.assertTrue(checkisdisplayed(city));
		Assert.assertTrue(checkisdisplayed(county));
		Assert.assertTrue(checkisdisplayed(postalCode));
		System.out.println("Successfully validate Address1Type");
	}
	public void validateCommunication() {
		commnuication.click();
		submit.click();
		Assert.assertTrue(checkisdisplayed(telephone));
		Assert.assertTrue(checkisdisplayed(email));
		Assert.assertTrue(checkisdisplayed(fax));
		Assert.assertTrue(checkisdisplayed(website));
		System.out.println("Successfully validate Communication Address Type");
	}
	public void validateBothAddressType() {
		both.click();
		submit.click();
		Assert.assertTrue(checkisdisplayed(addresstype));
		Assert.assertTrue(checkisdisplayed(address0));
		Assert.assertTrue(checkisdisplayed(address1));
		Assert.assertTrue(checkisdisplayed(address2));
		Assert.assertTrue(checkisdisplayed(address3));
		Assert.assertTrue(checkisdisplayed(address4));
		Assert.assertTrue(checkisdisplayed(address5));
		Assert.assertTrue(checkisdisplayed(country));
		Assert.assertTrue(checkisdisplayed(state));
		Assert.assertTrue(checkisdisplayed(city));
		Assert.assertTrue(checkisdisplayed(county));
		Assert.assertTrue(checkisdisplayed(postalCode));
		Assert.assertTrue(checkisdisplayed(telephone));
		Assert.assertTrue(checkisdisplayed(email));
		Assert.assertTrue(checkisdisplayed(fax));
		Assert.assertTrue(checkisdisplayed(website));
		System.out.println("Successfully validate Both Address Type");
	}
}
