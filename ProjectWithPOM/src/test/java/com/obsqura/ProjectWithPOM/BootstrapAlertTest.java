package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Test;

import pages.BootstrapAlert;
import pages.SideNavigationMenuSelect;

public class BootstrapAlertTest extends BaseObs{
	BootstrapAlert bootstrapAlertObj;
	SideNavigationMenuSelect sideNavigationMenuSelectObj;
	@Test
    public void checkNormalSuccessClickClose() {
		SideNavigationMenuSelect sideNavigationMenuSelectObj = new SideNavigationMenuSelect(driver);
		sideNavigationMenuSelectObj.navigationMenuClick("Alerts and Modals");
		BootstrapAlert bootstrapAlertObj = new BootstrapAlert(driver);
		bootstrapAlertObj.normalSuccessClickClose();
	}
	@Test
    public void checkNormalWarningClickClose() {
		SideNavigationMenuSelect sideNavigationMenuSelectObj = new SideNavigationMenuSelect(driver);
		sideNavigationMenuSelectObj.navigationMenuClick("Alerts and Modals");
		BootstrapAlert bootstrapAlertObj = new BootstrapAlert(driver);
		bootstrapAlertObj.normalWarningClickClose();
	}
	@Test
    public void checkNormalDangerClickClose() {
		SideNavigationMenuSelect sideNavigationMenuSelectObj = new SideNavigationMenuSelect(driver);
		sideNavigationMenuSelectObj.navigationMenuClick("Alerts and Modals");
		BootstrapAlert bootstrapAlertObj = new BootstrapAlert(driver);
		bootstrapAlertObj.normalDangerClickClose();
	}
	@Test
    public void checkNormalInfoClickClose() {
		SideNavigationMenuSelect sideNavigationMenuSelectObj = new SideNavigationMenuSelect(driver);
		sideNavigationMenuSelectObj.navigationMenuClick("Alerts and Modals");
		BootstrapAlert bootstrapAlertObj = new BootstrapAlert(driver);
		bootstrapAlertObj.normalInfoClickClose();
	}
}
