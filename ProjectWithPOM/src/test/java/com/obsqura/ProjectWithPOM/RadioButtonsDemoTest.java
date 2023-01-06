package com.obsqura.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.NavigationMenuSelect;
import pages.RadioButtonsDemoPage;

public class RadioButtonsDemoTest extends BaseObs {
	RadioButtonsDemoPage radioButtonsDemoPageObj;
	NavigationMenuSelect navigationMenuSelectObj;
	@Test
	public void noClickAndVerifyMaleFemaleRadioButtonEnabledOrNot() throws IOException {
		NavigationMenuSelect navigationMenuSelectObj = new NavigationMenuSelect(driver);
		navigationMenuSelectObj.navigationMenuClick("Radio Buttons Demo");
		RadioButtonsDemoPage radioButtonsDemoPageObj = new RadioButtonsDemoPage(driver);
		radioButtonsDemoPageObj.verifyMaleFemaleRadioButtonEnabledOrNot();
	}
	@Test//(enabled=false)
	public void clickAndVerifyMaleRadioButtonSelectedMessageCheck() throws IOException {
		NavigationMenuSelect navigationMenuSelectObj = new NavigationMenuSelect(driver);
		navigationMenuSelectObj.navigationMenuClick("Radio Buttons Demo");
		RadioButtonsDemoPage radioButtonsDemoPageObj = new RadioButtonsDemoPage(driver);
		radioButtonsDemoPageObj.verifyMaleRadioButtonSelectedMessageCheck();
	}
	@Test
	public void clickAndVerifyFemaleRadioButtonSelectedMessageCheck() throws IOException {
		NavigationMenuSelect navigationMenuSelectObj = new NavigationMenuSelect(driver);
		navigationMenuSelectObj.navigationMenuClick("Radio Buttons Demo");
		RadioButtonsDemoPage radioButtonsDemoPageObj = new RadioButtonsDemoPage(driver);
		radioButtonsDemoPageObj.verifyFemaleRadioButtonSelectedMessageCheck();
	}

}
