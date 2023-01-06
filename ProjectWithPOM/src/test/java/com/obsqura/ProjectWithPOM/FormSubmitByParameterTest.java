package com.obsqura.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.FormSubmitByParameter;
import pages.NavigationMenuSelect;

public class FormSubmitByParameterTest extends BaseObs  {
	NavigationMenuSelect navigationMenuSelectObj;
	FormSubmitByParameter formSubmitByParameterObj;
	@Test
	@Parameters({"firstName","lastName","userName","city","state","zip"})
	public void checkFillAndSubmitFormByParameter(String firstName,String lastName,String userName,String city,String state,String zip) throws IOException {
		NavigationMenuSelect navigationMenuSelectObj = new NavigationMenuSelect(driver);
		navigationMenuSelectObj.navigationMenuClick("Form Submit");
		FormSubmitByParameter formSubmitByParameterObj=new FormSubmitByParameter(driver);
		formSubmitByParameterObj.fillAndSubmitFormByParameter(firstName, lastName,userName, city, state, zip);
	}

}
