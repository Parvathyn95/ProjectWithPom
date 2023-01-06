package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Test;

import pages.PracticeWindowHandling;

public class PracticeWindowHandlingTest extends BaseObs {
	PracticeWindowHandling practiceWindowHandlingObj;
	@Test
	public void checkAndPopupFromClickHere() {
		practiceWindowHandlingObj = new PracticeWindowHandling(driver);
		practiceWindowHandlingObj.popupFromClickHere();
	}
}
