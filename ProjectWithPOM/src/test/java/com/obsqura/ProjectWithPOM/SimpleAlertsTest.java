package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Test;

import pages.NavigationMenuSelect;
import pages.PracticeAlert;
import pages.SideNavigationMenuSelect;
import pages.SimpleAlerts;

public class SimpleAlertsTest extends BaseObs {
	SimpleAlerts simpleAlertsObj;
	@Test 
	public void checkAndAlertBoxClickMe() {
		simpleAlertsObj = new SimpleAlerts(driver);
		simpleAlertsObj.alertBoxClickMe();
	}
	@Test 
	public void checkAndConfirmBoxClickMe() {
		simpleAlertsObj = new SimpleAlerts(driver);
		simpleAlertsObj.confirmBoxClickMe();
	}
	@Test 
	public void checkAndPromptBoxClickMe() {
		simpleAlertsObj = new SimpleAlerts(driver);
		simpleAlertsObj.promptBoxClickMe();
	}
}
