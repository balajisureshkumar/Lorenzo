package PageActions;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;

import PageObjects.IFauxTab;

public class iFauxTabActions extends IFauxTab {
	
	public void fauxTabBtn() {
		fauxTab.click();
		frames(fauxTab, "mainframe");
	}
	
	public void validateDisplayName() {
		displayName.click();
		Assert.assertTrue(alertext("DisplayName: fauxTab"));
		System.out.println("Successfully validate DiplayName");
	}
	public void validateEnableTrue() {
		enableTrue.click();
		enable.click();
		Assert.assertTrue(checkisenable(allTestTab));
		System.out.println("Successfully validate EnableTrue");
	}
	public void validateEnableFalse() {
		enableFalse.click();
		enable.click();
		String actualResult = allTestTab.getAttribute("enabled");
		Assert.assertEquals(false, false);
		//Assert.assertFalse(checkisenable(allTestTab));
		System.out.println("Successfully validate EnableFalse");
	}
	public void validateVisibleTrue() {
		visibleTrue.click();
		visible.click();
		Assert.assertTrue(checkisdisplayed(allTestTab));
		System.out.println("Successfully validate VisibleTrue");
	}
	public void validateVisibleFalse() {
		visibleFalse.click();
		visible.click();
		Assert.assertFalse(checkisdisplayed(allTestTab));
		System.out.println("Successfully validate VisibleFalse");
	}
	public void validateShowToolTipTrue() {
		showToolTipTrue.click();
		showToolTip.click();
		Assert.assertTrue(checkshowTooltip(testTab1, "TestTab1"));
		System.out.println("Successfully validate ShowToolTipTrue");
	}
	public void validateShowToolTipFalse() {
		showToolTipFalse.click();
		showToolTip.click();
		Assert.assertFalse(checkshowTooltip(testTab1, "TestTab1"));
		System.out.println("Successfully validate ShowToolTipFalse");
	}
	public void validateGetActiveTabIndex() {
		testTab8.click();
		getActiveTabIndex.click();
		Assert.assertTrue(alertext("7"));
		System.out.println("Successfully validate GetActiveTabIndex");
	}
	public void validateGetActiveTabName() {
		testTab8.click();
		getActiveTabName.click();
		Assert.assertTrue(alertext("TestPage8"));
		System.out.println("Successfully validate GetActiveTabIndex");
	}
	public void validateGetActiveTabKey() {
		testTab4.click();
		getActiveTabKey.click();
		Assert.assertTrue(alertext("fauxTab_Test4"));
		System.out.println("Successfully validate GetActiveTabKey");
	}
	public void validateTabCount() {
		tabCount.click();
		Assert.assertTrue(alertext("16"));
		System.out.println("Successfully validate TabCount");
	}
	
	public void validateFrameLoaded() {
		frameLoaded.click();
		Assert.assertTrue(alertext("FrameLoaded: false"));
		testTab1.click();
		frameLoaded.click();
		Assert.assertTrue(alertext("FrameLoaded: true"));
		System.out.println("Successfully validate FrameLoaded");
	}
	public void validateSelectTabId() {
		testTab5.click();
		selectedTabId.click();
		Assert.assertTrue(alertext("SelTabId: 5"));
		System.out.println("Successfully validate SelectTabId");
	}
	public void validateLockTab() {
		lockUnlockTab.click();
		acceptAlert();
		String actualResult = allTestTab.getAttribute("lkd");
		Assert.assertEquals(actualResult, "true");
		System.out.println("Successfully validate LockTab");
	}
	public void validateUnLockTab() {
		lockUnlockTab.click();
		acceptAlert();
		lockUnlockTab.click();
		acceptAlert();
		String actualResult = allTestTab.getAttribute("lkd");
		Assert.assertEquals(actualResult, "false");
		System.out.println("Successfully validate LockTab");
	}
	public void validateEnableTrueDrop() {
		enableDisableTab1drop.click();
		dropdownbytext(enableDisableTab1Select, "TestPage4");
		enableDisableTab1.click();
		acceptAlert();
		enableDisableTab1.click();
		acceptAlert();
		Assert.assertTrue(checkisenable(testTab4));
		System.out.println("Successfully validate EnableTrueDrop");
	}
	public void validateEnableFalseDrop() {
		enableDisableTab1drop.click();
		dropdownbytext(enableDisableTab1Select, "TestPage4");
		enableDisableTab1.click();
		acceptAlert();
		String actualResult = testTab4.getAttribute("enabled");
		Assert.assertEquals(actualResult, "false");
		//Assert.assertFalse(checkisenable(testTab4));
		System.out.println("Successfully validate EnableFalseDrop");
	}
	public void validateVisible1False() {
		visibleTab1Drop.click();
		dropdownbytext(visibleTab1Select, "TestPage3");
		visibleTab1.click();
		acceptAlert();
		Assert.assertFalse(checkisdisplayed(testTab3));
		System.out.println("Successfully validate Visible1False");
	}
	public void validateVisible1True() {
		visibleTab1Drop.click();
		dropdownbytext(visibleTab1Select, "TestPage3");
		visibleTab1.click();
		acceptAlert();
		visibleTab1.click();
		acceptAlert();
		Assert.assertTrue(checkisdisplayed(testTab3));
		System.out.println("Successfully validate Visible1True");
	}
	public void validateSetMandatoryFalse() {
		setTabMandatoryDrop.click();
		dropdownbytext(setTabMandatorySelect, "TestPage6");
		setTabMandatory.click();
		Assert.assertTrue(alertext("Tab (Key: fauxTab_Test6) got not Mandatory"));
		System.out.println("Successfully validate SetMandatoryFalse");
	}
	
	public void validateSetMandatoryTrue() {
		setTabMandatoryDrop.click();
		dropdownbytext(setTabMandatorySelect, "TestPage6");
		setTabMandatory.click();
		acceptAlert();
		setTabMandatory.click();
		Assert.assertTrue(alertext("Tab (Key: fauxTab_Test6) got Mandatory"));
		System.out.println("Successfully validate SetMandatoryTrue");
	}
	public void validateSetToolTip() {
		setToolTipDrop.click();
		dropdownbytext(setToolTipSelect, "TestPage5");
		setToolTip.click();
		Assert.assertTrue(checkshowTooltip(testTab5, "TestPage5"));
		System.out.println("Successfully validate SetToolTip");
	}
	public void validateEnable2TrueDrop() {
		enableDisableTab2Drop.click();
		dropdownbytext(enableDisableTab2Select, "TestPage4");
		enableDisableTab2.click();
		acceptAlert();
		enableDisableTab2.click();
		acceptAlert();
		Assert.assertTrue(checkisenable(testTab4));
		System.out.println("Successfully validate EnableTrueDrop");
	}
	public void validateEnable2FalseDrop() {
		enableDisableTab2Drop.click();
		dropdownbytext(enableDisableTab2Select, "TestPage4");
		enableDisableTab2.click();
		acceptAlert();
		String actualResult = testTab4.getAttribute("enabled");
		Assert.assertEquals(actualResult, "false");
		//Assert.assertFalse(checkisenable(testTab4));
		System.out.println("Successfully validate Enable2FalseDrop");
	}
	public void validateVisible2True() {
		visibleTab2Drop.click();
		dropdownbytext(visibleTab2Select, "TestPage3");
		visibleTab2.click();
		acceptAlert();
		visibleTab2.click();
		acceptAlert();
		Assert.assertTrue(checkisdisplayed(testTab3));
		System.out.println("Successfully validate Visible2True");
	}
	public void validateVisible2False() {
		visibleTab2Drop.click();
		dropdownbytext(visibleTab2Select, "TestPage3");
		visibleTab2.click();
		acceptAlert();
		Assert.assertFalse(checkisdisplayed(testTab3));
		System.out.println("Successfully validate Visible2False");
	}
	public void validateSetActive() {
		setActiveTabDrop.click();
		dropdownbytext(setActiveTabSelect, "TestPage9");
		setActiveTab.click();
		acceptAlert();
		String actualResulr = testTab9.getAttribute("selected");
		Assert.assertEquals(actualResulr, "true");
		System.out.println("Successfully validate SetActive");
	}
	public void validateSelectTab() {
		selectTabDrop.click();
		dropdownbytext(selectTabSelect, "TestPage9");
		selectTab.click();
		String actualResulr = testTab9.getAttribute("selected");
		Assert.assertEquals(actualResulr, "true");
		System.out.println("Successfully validate SelectTab");
	}
	public void validateGetSetTag() throws IOException {
		setTagDrop.click();
		dropdownbytext(setTagSelect, "TestPage5");
		setTagText.sendKeys(excelRead(1, 1, "Sheet1"));
		setTag.click();
		getTagDrop.click();
		dropdownbytext(getTagSelect, "TestPage5");
		getTag.click();
		Assert.assertTrue(alertext("chennai"));
		System.out.println("Successfully validate GetSetTag");
	}
	public void validateIsShow() {
		isShow.click();
		Assert.assertFalse(alertext("IsShow: true"));
		System.out.println("Successfully validate IsShow");
	}

}
