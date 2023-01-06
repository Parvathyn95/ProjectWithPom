package com.obsqura.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.NavigationMenuSelect;

public class NavigationMenuSelectTest extends BaseObs {
	NavigationMenuSelect navigationMenuSelectObj;
	
	@Test
	//@Parameters("expectedString")
	public void checkNavigationMenuClick(){
		navigationMenuSelectObj = new NavigationMenuSelect(driver);
		navigationMenuSelectObj.navigationMenuClick("Checkbox Demo");
	}

}
