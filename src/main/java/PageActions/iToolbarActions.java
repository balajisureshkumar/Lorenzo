package PageActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import PageObjects.IToolBarbutton;

public class iToolbarActions extends IToolBarbutton {
	
	SoftAssert soft = new SoftAssert();
	
	public void toolBarButton() {
		toolBarBtn.click();
		frames(toolBarBtn, "mainframe");
	}
	
	public void validateVisibleYes() {
		visible.click();
		Assert.assertTrue(checkisdisplayed(toolBtn1));
		System.out.println("Successfully validate VisibleYes");
		
	}
	public void validateVisibleNo() {
		visible.click();
		visible.click();
		Assert.assertFalse(checkisdisplayed(toolBtn1));
		System.out.println("Successfully validate VisibleNo");
	}
	
	public void validateEnableYes() {
		enable.click();
		acceptAlert();
		Assert.assertTrue(checkisenable(toolBtn2));
		System.out.println("Successfully validate EnableYes");
		
	}
	public void validateEnableNo() {
		enable.click();
		acceptAlert();
		enable.click();
		acceptAlert();
		String actualText = toolBtn2.getAttribute("value");
		Assert.assertEquals(actualText, "false;true;Sample2");
		System.out.println("Successfully validate EnableNo");
	}
	
	public void validateShowToolTip() {
		showToolTip.click();
		Assert.assertTrue(checkshowTooltip(sampleIconBtn3, "This for testing showtooltip function"));
	}
	public void validateHiddenToolTip() {
		showToolTip.click();
		hideTooltip.click();
		Assert.assertFalse(checkshowTooltip(sampleIconBtn3, "This for testing showtooltip function"));
	}
	
	public void validateSample4GetText() {
		getText.click();
		Assert.assertTrue(alertext("Sample4"));
	}
	
	public void validateSample4SetText() {
		setText.click();
		getText.click();
		Assert.assertTrue(alertext("Testing"));
	}
	
	public void validateSample5ShowList() {
		sample5ShowList.click();
		Assert.assertTrue(checkisdisplayed(sample5ShowListItem));
	}
	public void validateSample5HideDrop() {
		sample5HideDrop.click();
		Assert.assertFalse(checkisdisplayed(sample5ShowListItem));
	}
	public void validateSample5GetCount() {
		sample5GetCount.click();
		Assert.assertTrue(alertext("Total Item count is 6"));
	}
	public void validateSample5Focus() {
		sample5Focus.click();
		String actualText = sample5.getAttribute("class");
		Assert.assertEquals(actualText, "ToolbarButton_Active");
	}
	
	public void validateSample5KeyDown1() throws AWTException {
		Robot r = new Robot();
		sample5arrow.click();
		r.keyPress(KeyEvent.VK_9);
		r.keyPress(KeyEvent.VK_TAB);
		Assert.assertFalse(checkisdisplayed(sample5ItemAll));
	}	
	public void validateSample5KeyDown2() throws AWTException {	
		Robot r = new Robot();
		sample5arrow.click();
		r.keyPress(KeyEvent.VK_2);
		r.keyPress(KeyEvent.VK_7);
		r.keyPress(KeyEvent.VK_ESCAPE);
		Assert.assertFalse(checkisdisplayed(sample5ItemAll));
	}	
	public void validateSample5KeyDown3() throws AWTException {
		Robot r = new Robot();
		sample5arrow.click();
		r.keyPress(KeyEvent.VK_3);
		r.keyPress(KeyEvent.VK_2);
		r.keyPress(KeyEvent.VK_SPACE);
		frames(sample5arrow, "dialog-body");
    	Assert.assertTrue(alertext("Hello"));
	}	
	
	public void validateSample5KeyDown4() throws AWTException {
		Robot r = new Robot();
    	sample5arrow.click();
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_3);
    	r.keyPress(KeyEvent.VK_ENTER);
    	frames(sample5arrow, "dialog-body");
    	Assert.assertTrue(alertext("Hello"));
	}
	public void validateSample5KeyDown5() throws AWTException {
		Robot r = new Robot();
		
		sample5arrow.click();
		r.keyPress(KeyEvent.VK_3);
		r.keyPress(KeyEvent.VK_6);
		r.keyPress(KeyEvent.VK_HOME);
    	String actualResult2 = sample5Item1.getAttribute("class");
		Assert.assertEquals(actualResult2, "ToolbarButton_ListActive");
		
		r.keyPress(KeyEvent.VK_3);
		r.keyPress(KeyEvent.VK_5);
		r.keyPress(KeyEvent.VK_END);
    	String actualResult = sample5Item6.getAttribute("class");
		Assert.assertEquals(actualResult, "ToolbarButton_ListActive");
		
		r.keyPress(KeyEvent.VK_3);
		r.keyPress(KeyEvent.VK_8);
		r.keyPress(KeyEvent.VK_UP);
    	String actualResult3 = sample5Item5.getAttribute("class");
		Assert.assertEquals(actualResult3, "ToolbarButton_ListActive");
		
		r.keyPress(KeyEvent.VK_4);
		r.keyPress(KeyEvent.VK_0);
		r.keyPress(KeyEvent.VK_DOWN);
    	String actualResult4 = sample5Item6.getAttribute("class");
		Assert.assertEquals(actualResult4, "ToolbarButton_ListActive");
	}
	
	public void validateSample6AddItem() {
		addItem.click();
		String actualText = newAdd1.getText();
		Assert.assertEquals(actualText, "Sample1");
		
	}
	
	public void validateSample6Remove() {
		remItem.click();
		String actualText1 = sample6Item.getAttribute("value");
		Assert.assertNotEquals(actualText1, "True;~False;~True;~False;~Bangalore;~Bangalore;~false;~Bangalore;~Dehli;~Dehli;~false;~Dehli;~Mumbai;~Mumbai;~false;~Mumbai");
		
	}
	
	public void validateSample6ClearItem() throws InterruptedException {
		sam6Bangalore.click();
		Thread.sleep(5000);
		clearItem.click();
		Thread.sleep(5000);
		Assert.assertFalse(checkisSelected(sam6Bangalore));
	}
	
	public void validateSample7() {
		addImg.click();
		sample7Arrow.click();
		String actualtext = sample7Item1.getText();
		Assert.assertEquals(actualtext, "Item 1");
	}
}
