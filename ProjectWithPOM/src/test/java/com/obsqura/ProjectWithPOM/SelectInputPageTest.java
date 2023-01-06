package com.obsqura.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.NavigationMenuSelect;
import pages.SelectInputPage;

public class SelectInputPageTest extends BaseObs{
	SelectInputPage selectInputPageObj;
	NavigationMenuSelect navigationMenuSelectObj;
	@Test (groups= {"regression"})
	public void selectColorAndVerifySelectSingleInputColor() throws IOException {
		NavigationMenuSelect navigationMenuSelectObj = new NavigationMenuSelect(driver);
		navigationMenuSelectObj.navigationMenuClick("Select Input");
		SelectInputPage selectInputPageObj = new SelectInputPage(driver);
		selectInputPageObj.verifySelectSingleInputColor();
	}
	@Test (groups= {"smoke"})
	public void selectColorAndVerifySelectMultipleInputColor() throws IOException {
		NavigationMenuSelect navigationMenuSelectObj = new NavigationMenuSelect(driver);
		navigationMenuSelectObj.navigationMenuClick("Select Input");
		SelectInputPage selectInputPageObj = new SelectInputPage(driver);
		selectInputPageObj.verifySelectMultipleInputColor();
	}
}
