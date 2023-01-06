package com.obsqura.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.FormSubmitByDataProvider;

import pages.NavigationMenuSelect;
import utilities.DataProviderUtility;

public class FormSubmitByDataProviderTest extends BaseObs {
	@Test(dataProvider="formData",dataProviderClass=DataProviderUtility.class)
	public void checkFillAndSubmitFormByDataProvider(String firstName,String lastName,String userName,String city,String state,String zip) throws IOException {
		NavigationMenuSelect navigationMenuSelectObj = new NavigationMenuSelect(driver);
		navigationMenuSelectObj.navigationMenuClick("Form Submit");
		FormSubmitByDataProvider formSubmitByDataProviderObj=new FormSubmitByDataProvider(driver);
		formSubmitByDataProviderObj.fillAndSubmitFormByDataProvider(firstName, lastName,userName, city, state, zip);
	}

}
