package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Test;

import pages.AlertPractice;

public class AlertPracticeTest extends BaseObs{
	AlertPractice alertPracticeObj;
	@Test
	public void checkAndSignUpAsUser() {
		alertPracticeObj = new AlertPractice(driver);
		alertPracticeObj.signUpAsUser();
	}
}
