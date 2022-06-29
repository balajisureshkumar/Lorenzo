package PageActions;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import PageObjects.iMessageBox;

public class iMessageboxActions extends iMessageBox {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public void messageBoxBtn() {
		messageBox.click();
		frames(messageBox, "mainframe");
	}
	
	public void validateSample8() {
		sample8.click();
		frames(sample8, "dialog-body");
		String actualResult = sample8MessageBox.getText();
		Assert.assertEquals(actualResult, "This is Parameterized Messagbox !");
	}
	public void validateSample1() {
		sample8.click();
		close.click();
		sample1.click();
		frames(sample1, "dialog-body");
		String actualResult = sample1Yes.getText();
		Assert.assertEquals(actualResult, "Ok");
	}
	public void validateSample2() {
		sample8.click();
		close.click();
		sample2.click();
		frames(sample2, "dialog-body");
		String actualResult1 = sample2Yes.getText();
		Assert.assertEquals(actualResult1, "Yes");
		String actualResult2 = sample2No.getText();
		Assert.assertEquals(actualResult2, "No");
		System.out.println(actualResult2);
		String actualResult3 = sample2Cancel.getText();
		Assert.assertEquals(actualResult3, "Cancel");
		System.out.println(actualResult3);
	}
	public void validateSample3() {
		sample8.click();
		close.click();
		sample3.click();
		frames(sample3, "dialog-body");
		String actualResult1 = sample3Yes.getText();
		Assert.assertEquals(actualResult1, "Yes");
		String actualResult2 = sample3No.getText();
		Assert.assertEquals(actualResult2, "No");
	}
	public void validateSample4() {
		sample8.click();
		close.click();
		sample4.click();
		frames(sample4, "dialog-body");
		String actualResult1 = sample4Abort.getText();
		Assert.assertEquals(actualResult1, "Abort");
		String actualResult2 = sample4Retry.getText();
		Assert.assertEquals(actualResult2, "Retry");
		String actualResult3 = sample4Ignore.getText();
		Assert.assertEquals(actualResult3, "Ignore");	
	}
	
	public void validateSample5() {
		sample8.click();
		close.click();
		sample5.click();
		frames(sample5, "dialog-body");
		String actualResult1 = sample5Ok.getText();
		Assert.assertEquals(actualResult1, "Ok");
		String actualResult2 = sample5Cancel.getText();
		Assert.assertEquals(actualResult2, "Cancel");
	}
	public void validateSample6() {
		sample8.click();
		close.click();
		sample6.click();
		frames(sample6, "dialog-body");
		String actualResult1 = sample6Retry.getText();
		Assert.assertEquals(actualResult1, "Retry");
		System.out.println(actualResult1);
		String actualResult2 = sample6Cancel.getText();
		Assert.assertEquals(actualResult2, "Cancel");
	}
	public void validateSample7() {
		sample8.click();
		close.click();
		sample7.click();
		frames(sample7, "dialog-body");
		Assert.assertTrue(alertext("Hello"));
	}

}
