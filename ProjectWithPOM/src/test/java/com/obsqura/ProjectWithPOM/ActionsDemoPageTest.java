package com.obsqura.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.ActionsDemoPage;
import pages.SideNavigationMenuSelect;
import pages.SimpleFormDemoPage;

public class ActionsDemoPageTest extends BaseObs{
	ActionsDemoPage othersDemoPageObj;
	SideNavigationMenuSelect sideNavigationMenuSelectObj;
	@Test
	public void checkAndVerifyDragAndDrop() throws IOException {
		sideNavigationMenuSelectObj = new SideNavigationMenuSelect(driver);
		sideNavigationMenuSelectObj.navigationMenuClick("Others");
		othersDemoPageObj = new ActionsDemoPage(driver);
		othersDemoPageObj.verifyAndDoubleClickDragAndDrop();
	}
	@Test
	public void checkAndVerifyAndClickDynamicDataLoadingOption() {
		sideNavigationMenuSelectObj = new SideNavigationMenuSelect(driver);
		sideNavigationMenuSelectObj.navigationMenuClick("Others");
		othersDemoPageObj = new ActionsDemoPage(driver);
		othersDemoPageObj.verifyAndClickDynamicDataLoadingOption();
	}
	@Test
	public void checkAndVerifyAndClickChartDemo() throws IOException {
		sideNavigationMenuSelectObj = new SideNavigationMenuSelect(driver);
		sideNavigationMenuSelectObj.navigationMenuClick("Others");
		othersDemoPageObj = new ActionsDemoPage(driver);
		othersDemoPageObj.verifyAndClickChartDemo();
	}
	@Test
	public void checkAndVerifyAndHoverChartDemo() throws IOException {
		sideNavigationMenuSelectObj = new SideNavigationMenuSelect(driver);
		sideNavigationMenuSelectObj.navigationMenuClick("Others");
		othersDemoPageObj = new ActionsDemoPage(driver);
		othersDemoPageObj.verifyAndHoverChartDemo();
	}

	
}
