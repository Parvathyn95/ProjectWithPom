package com.obsqura.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.FormSubmitPage;
import pages.NavigationMenuSelect;

public class FormSubmitPageTest extends BaseObs{
	NavigationMenuSelect navigationMenuSelectObj;
	FormSubmitPage formSubmitPageObj;
	@Test 
	public void checkFillAndSubmitForm() throws IOException {
		NavigationMenuSelect navigationMenuSelectObj = new NavigationMenuSelect(driver);
		navigationMenuSelectObj.navigationMenuClick("Form Submit");
		FormSubmitPage formSubmitPageObj = new FormSubmitPage(driver);
		formSubmitPageObj.fillAndSubmitForm();
	}

}
