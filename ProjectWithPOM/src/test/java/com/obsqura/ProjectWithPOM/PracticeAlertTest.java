package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Test;

import pages.PracticeAlert;

public class PracticeAlertTest extends BaseObs {
	PracticeAlert practiceAlertObj;
	@Test 
	public void checkAndAlertBoxClickMe() {
		practiceAlertObj = new PracticeAlert(driver);
		practiceAlertObj.alertBoxClickMe();
	}
	@Test 
	public void checkAndConfirmBoxClickMe() {
		practiceAlertObj = new PracticeAlert(driver);
		practiceAlertObj.confirmBoxClickMe();
	}
	@Test 
	public void checkAndPromptBoxClickMe() {
		practiceAlertObj = new PracticeAlert(driver);
		practiceAlertObj.promptBoxClickMe();
	}
}
