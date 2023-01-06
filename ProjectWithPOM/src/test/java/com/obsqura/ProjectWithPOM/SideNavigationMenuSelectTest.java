package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.NavigationMenuSelect;
import pages.SideNavigationMenuSelect;

public class SideNavigationMenuSelectTest extends BaseObs {
	SideNavigationMenuSelect sideNavigationMenuSelectObj;
	
	@Test
	public void checkNavigationMenuClick(String expectedString){
		sideNavigationMenuSelectObj = new SideNavigationMenuSelect(driver);
		sideNavigationMenuSelectObj.navigationMenuClick(expectedString);
	}
}
