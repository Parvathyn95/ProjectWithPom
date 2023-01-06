package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Test;

import pages.WindowHandlingDemo;

public class WindowHandlingDemoTest extends BaseObs{
	WindowHandlingDemo windowHandlingDemoObj;
	@Test
	public void verifyAndclickLikeUsOnFacebook() {
		windowHandlingDemoObj = new WindowHandlingDemo(driver);
		windowHandlingDemoObj.clickLikeUsOnFacebook();
		
	}
	@Test(enabled=false)
	public void verifyAndclickCreateNewAAccount() {
		windowHandlingDemoObj = new WindowHandlingDemo(driver);
		windowHandlingDemoObj.clickCreateNewAccount();
		
	}
	
}
