package PageActions;

import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.google.common.base.Stopwatch;

import PageObjects.ITimeBox;

public class iTimeBoxactions extends ITimeBox {
	
	public void timeBoxBtn() {
		timeBox.click();
		frames(timeBox, "mainframe");
	}
	
	public void validateSetText() {
		setText.click();
		String actualText = timeBox1.getAttribute("value");
		Assert.assertEquals(actualText, "true;true;false;10;10;;true;hhmm");
	    System.out.println("Successfully validate SetTextValue");
	}
	
	public void validateGetText() {
		GetText.click();
		Assert.assertTrue(alertext("Text: 12:00"));
		System.out.println("Successfully validate GetTextValue");
	}

	public void validateClearText() throws IOException {
		textBox.sendKeys(excelRead(1, 1, "Sheet1"));
		clearText.click();
		String actualResult1 = textBox.getAttribute("value");
		String actualResult2 = timeBox1rowSpan.getAttribute("title");
		Assert.assertEquals(actualResult2, "");
		Assert.assertEquals(actualResult1, "");
		System.out.println("Successfully validate ClearText");
	}
	
	public void validateGetTime() throws IOException {
		getTime.click();
		Assert.assertTrue(alertext(excelRead(6, 1, "Sheet1")));
		System.out.println("Successfully validate GetTime");
	}
	
	public void validateIsValid() {
		isValid.click();
		Assert.assertTrue(alertext("true"));
		System.out.println("Successfully validate IsValid ");
	}
	public void validateEnableTrue() {
		enableTrue.click();
		Assert.assertTrue(checkisenable(timeBox1rowSpan));
		System.out.println("Successfully validate EnableTrue ");
	}
	
	public void validateEnableFalse() {
		enableFalse.click();
		Assert.assertFalse(checkisenable(timeBox1rowSpan));
		System.out.println("Successfully validate EnableFalse ");
	}
	public void validateVisibleTrue() {
		visibleTrue.click();
		Assert.assertFalse(checkisdisplayed(timeBox1rowSpan));
		System.out.println("Successfully validate VisibleFalse ");
	}
	public void validateVisibleFalse() {
		visibleFalse.click();
		acceptAlert();
		Assert.assertFalse(checkisdisplayed(timeBox1rowSpan));
		System.out.println("Successfully validate VisibleFalse ");
	}
	public void validateReadOnlyTrue() {
		readOnlyTrue.click();
		timeBox1Inc.click();
		String actualResult = timeBox1.getAttribute("value");
		Assert.assertEquals(actualResult, "true;true;true;12;00;;true;hhmm");
		System.out.println("Successfully validate ReadOnlyTrue ");
	}
	public void validateReadOnlyFalse() {
		readOnlyFalse.click();
		timeBox1Inc.click();
		String actualResult = timeBox1.getAttribute("value");
		Assert.assertEquals(actualResult, "true;true;false;13;00;;true;hhmm");
		System.out.println("Successfully validate ReadOnlyFalse ");
	}
	public void validateMandatoryFalse() {
		mandFalse.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, "this.IsMandatory=false");
		System.out.println("Successfully validate MandatoryFalse ");
	}
	public void validateMandatoryTrue() {
		mandFalse.click();
		mandTrue.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, "this.IsMandatory=true");
		System.out.println("Successfully validate MandatoryFalse ");
	}
	public void validateDisplayedTrue() {
		displayTrue.click();
		Assert.assertTrue(checkisdisplayed(timeBox1Cntrol));
		System.out.println("Successfully validate DisplayedTrue ");
	}
	
	public void validateDisplayedFalse() {
		displayFalse.click();
		acceptAlert();
		Assert.assertFalse(checkisdisplayed(timeBox1rowSpan));
		System.out.println("Successfully validate DisplayedFalse ");
	}
	public void validateShowToolTipTrue() {
		showToolTipTrue.click();
	    Assert.assertTrue(checkshowTooltip(timeBox1ToolTip, "TimeBox ToolTip"));
	    System.out.println("Successfully validate ShowToolTipTrue ");
	}
	public void validateShowToolTipFalse() {
		showToolTipFalse.click();
	    Assert.assertFalse(checkshowTooltip(timeBox1ToolTip, "TimeBox ToolTip"));
	    System.out.println("Successfully validate ShowToolTipFalse ");
	}
	
	public void validateClearAll() throws IOException {
		textBox.sendKeys(excelRead(1, 1, "Sheet1"));
		enableFalse.click();
		visibleFalse.click();
		acceptAlert();
		readOnlyTrue.click();
		mandFalse.click();
		displayFalse.click();
		acceptAlert();
		showToolTipFalse.click();
		clearAll.click();
		String actualResult = textBox.getAttribute("value");
		Assert.assertEquals(actualResult, "");
		Assert.assertTrue(checkisenable(timeBox1rowSpan));
		Assert.assertFalse(checkisdisplayed(timeBox1rowSpan));
		Assert.assertTrue(checkshowTooltip(timeBox1ToolTip, "TimeBox ToolTip"));
		System.out.println("Successfully validate ClearAll ");
	}
	public void validateIsValidTime() throws IOException {
		timeBox2Hours.clear();
		timeBox2Hours.sendKeys("12");
		timeBox2Hours.sendKeys(Keys.TAB);
		isValidTime.click();
		Assert.assertTrue(alertext("Invalid! The time must be in range 2:00 & 11:00"));
		System.out.println("Successfully validate IsValidTime ");
	}
	public void validateTimeBox1Inc() {
		timeBox1Inc.click();
		String actualText = timeBox1.getAttribute("value");
		Assert.assertEquals(actualText, "true;true;false;13;00;;true;hhmm");
		System.out.println("Successfully validate TimeBox1Inc ");
	}
	public void validateTimeBox1Dec() {
		timeBox1Dec.click();
		String actualText = timeBox1.getAttribute("value");
		Assert.assertEquals(actualText, "true;true;false;11;00;;true;hhmm");
		System.out.println("Successfully validate TimeBox1Inc ");
	}
	public void validateAutoInc() {
		setAutoInc.click();
		acceptAlert();
		stop.click();
		String actualResult = timeBox1.getAttribute("value");
		Assert.assertNotSame(actualResult, "true;true;false;12;00;;true;hhmm");
		System.out.println("Successfully validate AutoIncrement ");
	}
	public void validateAutoDec() {
		setAutoDec.click();
		acceptAlert();
		stop.click();
		String actualResult = timeBox1.getAttribute("value");
		Assert.assertNotSame(actualResult, "true;true;false;12;00;;true;hhmm");
		System.out.println("Successfully validate AutoIncrement ");
	}
	public void validateTimeBox2Inc() {
		timeBox2Hours.clear();
		timeBox2Hours.sendKeys("12");
		timeBox2Hours.sendKeys(Keys.TAB);
		timeBox2Inc.click();
		String actualResult = timeBox2Hidden.getAttribute("value");
		Assert.assertEquals(actualResult, "true;true;false;00;17;;true;hhmm");
		System.out.println("Successfully validate TimeBox2Inc ");
	}
	public void validateTimeBox2Dec() {
		timeBox2Hours.clear();
		timeBox2Hours.sendKeys("12");
		timeBox2Hours.sendKeys(Keys.TAB);
		timeBox2Dec.click();
		String actualResult = timeBox2Hidden.getAttribute("value");
		Assert.assertEquals(actualResult, "true;true;false;00;07;;true;hhmm");
		System.out.println("Successfully validate TimeBox2Dec ");	
	}
}
