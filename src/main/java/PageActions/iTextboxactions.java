package PageActions;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import PageObjects.Itextbox;
import exceldata.DataGetTest;

public class iTextboxactions extends Itextbox {

	// DataGetTest excel = new DataGetTest(excelpath,sheetName);

	public void txt() {
		txtBox.click();
		frames(txtBox, "mainframe");
	}

	public void validateEnableYes() throws IOException {
        enableYes.click();
		Assert.assertTrue(checkisenable(text));
		System.out.println("Successfully Validate validateEnableYes");	
	}
	public void validateEnableNo() throws IOException {
		enableNo.click();
		Assert.assertFalse(checkisenable(text));
		System.out.println("Successfully Validate validateEnableNo");
	}

	public void validateVisibleNo() {
		visibleNo.click();
		acceptAlert();
		Assert.assertFalse(checkisdisplayed(text));
		System.out.println("Successfully Validate validateVisibleNo");
	}
	public void validateVisibleYes() {
		visibleYes.click();
		Assert.assertTrue(checkisdisplayed(text));
		System.out.println("Successfully Validate validateVisibleYes");
	}

	public void validateReadOnlyYes() throws IOException {
		readOnlyYes.click();
		//text.clear();
		text.sendKeys(excelRead(1, 1, "Sheet1"));
		String actualtext = text.getAttribute("value");
		Assert.assertEquals(actualtext, "Text");
		System.out.println("Successfully Validate ReadOnlyYes");
//		readOnlyYes.click();
//		text.clear();
//		String actualResult = text.getAttribute("value");
//		Assert.assertEquals(actualResult, "Text");
		
	}
	public void validateReadOnlyNo() throws IOException {
		readOnlyNo.click();
		text.clear();
		text.sendKeys(excelRead(1, 1, "Sheet1"));
		String actualtext2 = text.getAttribute("value");
		Assert.assertEquals(actualtext2, "chennai");
		System.out.println("Successfully Validate ReadOnlyNo");
	}

	public void validateMandatoryNo() {
		mandNo.click();
		String actualtext2 = text.getAttribute("value");
		Assert.assertEquals(actualtext2, "this.Mandatory=false");
		System.out.println("Successfully Validate MandatoryNo");
		
	}
	public void validateMandatoryYes() {
		mandNo.click();
		mandYes.click();
		String actualtext = text.getAttribute("value");
		Assert.assertEquals(actualtext, "this.Mandatory=true");
		System.out.println("Successfully Validate MandatoryYes");
	}

	public void validateDisplayedYes() {
		displayYes.click();
		Assert.assertTrue(checkisdisplayed(text));
		System.out.println("Successfully Validate validateVisibleYes");
	}
	public void validateDisplayedNo() {
		displayNo.click();
		acceptAlert();
		Assert.assertFalse(checkisdisplayed(text));
		System.out.println("Successfully Validate validateDisplayedNo");
	}

	public void validateClearAll() {
		clearAll.click();
		String actualtext = text.getAttribute("value");
		Assert.assertEquals(actualtext, "");
		System.out.println("Successfully Validate MandatoryYes");
	}

	public void validateAlphaSetText() throws IOException {
		textAlpha.clear();
		textAlpha.sendKeys(excelRead(1, 1, "Sheet1"));
		setAlpha.click();
		String actualSetText = textAlpha.getAttribute("value");
		Assert.assertEquals(actualSetText, "chennai");
		System.out.println("Successfully Validate SetTextAlpha");

	}

	public void validateAlphaGetText() throws IOException {
		textAlpha.clear();
		textAlpha.sendKeys(excelRead(1, 1, "Sheet1"));
		getAlpha.click();
		Assert.assertTrue(alertext("chennai"));
		System.out.println("Successfully Validate AlphaGetText");
	}

	public void validateAlphaVal() throws IOException {
		textAlpha.clear();
		textAlpha.sendKeys(excelRead(1, 1, "Sheet1"));
		ValAlpha.click();
		Assert.assertTrue(alertext("Valid Data Type"));
		System.out.println("Successfully Validate AlphaValidateBtn");
		textAlpha.clear();
		textAlpha.sendKeys(excelRead(2, 1, "Sheet1"));
		ValAlpha.click();
		Assert.assertTrue(alertext("Invalid Data Type, expected datatype is Alpha"));
		System.out.println("Successfully Validate AlphaValidateBtn");
		textAlpha.clear();
		textAlpha.sendKeys(excelRead(3, 1, "Sheet1"));
		ValAlpha.click();
		Assert.assertTrue(alertext("Invalid Data Type, expected datatype is Alpha"));
		System.out.println("Successfully Validate AlphaValidateBtn");
		textAlpha.clear();
		textAlpha.sendKeys(excelRead(4, 1, "Sheet1"));
		ValAlpha.click();
		Assert.assertTrue(alertext("Invalid Data Type, expected datatype is Alpha"));
		System.out.println("Successfully Validate AlphaValidateBtn");
		textAlpha.clear();
		textAlpha.sendKeys("chennaichennai");
		ValAlpha.click();
		Assert.assertFalse(alertext("Valid Data Type"));
		System.out.println("Successfully Validate AlphaValidateBtn");
//		textAlpha.clear();
//		textAlpha.sendKeys(" ");
//		ValAlpha.click();
//		Assert.assertFalse(alertext("Valid Data Type"));
//		System.out.println("Successfully Validate AlphaValidateBtn");
	}

	public void validateAlphaNumSet() throws IOException {
		textAlphaNum.clear();
		textAlphaNum.sendKeys(excelRead(1, 1, "Sheet1"));
		setAlphaNum.click();
		String actualtext = textAlphaNum.getAttribute("value");
		Assert.assertEquals(actualtext, "chennai");
		System.out.println("Successfully Validate AlphaNUmeric SetTextBtn");
	}

	public void validateAlphaNumGet() throws IOException {
		textAlphaNum.clear();
		textAlphaNum.sendKeys(excelRead(1, 1, "Sheet1"));
		getAlphaNum.click();
		Assert.assertTrue(alertext("chennai"));
		System.out.println("Successfully Validate AlphaNUmeric GetTextBtn");
	}

	public void validateAlphaNumVal() throws IOException {
		textAlphaNum.clear();
		textAlphaNum.sendKeys(excelRead(1, 1, "Sheet1"));
		ValAlphaNum.click();
		Assert.assertTrue(alertext("Valid Data Type"));
		System.out.println("Successfully Validate AlphaNUmeric Validate BTN");
		textAlphaNum.clear();
		textAlphaNum.sendKeys(excelRead(2, 1, "Sheet1"));
		ValAlphaNum.click();
		Assert.assertTrue(alertext("Valid Data Type"));
		System.out.println("Successfully Validate AlphaNUmeric Validate BTN");
		textAlphaNum.clear();
		textAlphaNum.sendKeys(excelRead(3, 1, "Sheet1"));
		ValAlphaNum.click();
		Assert.assertTrue(alertext("Valid Data Type"));
		System.out.println("Successfully Validate AlphaNUmeric Validate BTN");
		textAlphaNum.clear();
		textAlphaNum.sendKeys(excelRead(4, 1, "Sheet1"));
		ValAlphaNum.click();
		Assert.assertTrue(alertext("Invalid Data Type, expected datatype is Alphanumeric"));
		System.out.println("Successfully Validate AlphaNUmeric Validate BTN");
//		textAlphaNum.clear();
//		textAlphaNum.sendKeys(" ");
//		ValAlphaNum.click();
//		Assert.assertTrue(alertext("Invalid Data Type, expected datatype is Alphanumeric"));
//		System.out.println("Successfully Validate AlphaNUmeric Validate BTN");
	}

	public void validateMultiLineSet() throws IOException {
		textMulti.clear();
		textMulti.sendKeys(excelRead(1, 1, "Sheet1"));
		setMulti.click();
		String actualtext = textMulti.getAttribute("value");
		Assert.assertEquals(actualtext, "chennai");
		System.out.println("Successfully Validate AlphaNUmeric MultiLine Set Text");
	}

	public void validateMultiLineGet() throws IOException {
		textMulti.clear();
		textMulti.sendKeys(excelRead(1, 1, "Sheet1"));
		getMulti.click();
		Assert.assertTrue(alertext("chennai"));
		System.out.println("Successfully Validate AlphaNUmeric MultiLine Get Text");
	}

	public void validateNormalSet() throws IOException {
		text.clear();
		text.sendKeys(excelRead(1, 1, "Sheet1"));
		normalSet.click();
		String actualtext = text.getAttribute("value");
		Assert.assertEquals(actualtext, "chennai");
		System.out.println("Successfully Validate NormalSetText");
	}

	public void validateNormalGet() throws IOException {
		text.clear();
		text.sendKeys(excelRead(1, 1, "Sheet1"));
		normalGet.click();
		Assert.assertTrue(alertext("chennai"));
		System.out.println("Successfully Validate NormalGetText");
	}

	public void validateNumGetText() throws IOException {
		numText.click();
		numText.sendKeys(excelRead(5, 1, "Sheet1"));
		numGet.click();
		Assert.assertTrue(alertext("15000"));
		System.out.println("Successfully Validate NumGetText");
	}

	public void validateNumSetText() throws IOException {
		numText.sendKeys(excelRead(5, 1, "Sheet1"));
		numSet.click();
		Assert.assertTrue(alertext("chennai"));
		System.out.println("Successfully Validate NumGetText");
	}

	public void validateNumValData() throws IOException {
		numText.sendKeys(excelRead(5, 1, "Sheet1"));
		numValData.click();
		Assert.assertTrue(alertext("Valid Data Type"));
		numText.sendKeys(excelRead(1, 1, "Sheet1"));
		numValData.click();
		Assert.assertTrue(alertext("Invalid Data Type, expected datatype is numeric"));
		numText.sendKeys(excelRead(2, 1, "Sheet1"));
		numValData.click();
		Assert.assertTrue(alertext("Invalid Data Type, expected datatype is numeric"));
		numValData.clear();
		numValData.click();
		Assert.assertTrue(alertext("Invalid Data Type, expected datatype is numeric"));
		System.out.println("Successfully Validate NumValData");
	}

	public void validateNumValReq() throws IOException {
		numText.sendKeys(excelRead(5, 1, "Sheet1"));
		numValReq.click();
		Assert.assertFalse(alertext("ToInvariantDecimalSeparator is not defined"));
	}

	public void validateNumValRange() throws IOException {
		numText.sendKeys(excelRead(5, 1, "Sheet1"));
		numValRange.click();
		Assert.assertFalse(alertext("Value is not in range value must be between:10000&20000"));
	}

	public void validatePassGet() throws IOException {
		textpass.sendKeys(excelRead(1, 1, "Sheet1"));
		passGet.click();
		Assert.assertTrue(alertext("chennai"));
		System.out.println("Successfully Validate PasswordGetText");
	}

	public void validatePassSet() throws IOException {
		textpass.sendKeys(excelRead(1, 1, "Sheet1"));
		passSet.click();
		String actualtext = textpass.getAttribute("value");
		Assert.assertEquals(actualtext, "chennai");
		System.out.println("Successfully Validate PasswordSetText");
	}
}
