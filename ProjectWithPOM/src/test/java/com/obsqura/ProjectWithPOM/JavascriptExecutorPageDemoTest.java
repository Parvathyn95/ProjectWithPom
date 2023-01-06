package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Test;

import pages.JavascriptExecutorPageDemo;

public class JavascriptExecutorPageDemoTest extends BaseObs {
	JavascriptExecutorPageDemo javascriptExecutorPageDemoObj;
	@Test
	public void checkAndScrollDownAndUp() {
		JavascriptExecutorPageDemo javascriptExecutorPageDemoObj = new JavascriptExecutorPageDemo(driver);
		javascriptExecutorPageDemoObj.scrollDownAndUp();
	}
	@Test
	public void checkAndScrollIntoView() {
		JavascriptExecutorPageDemo javascriptExecutorPageDemoObj = new JavascriptExecutorPageDemo(driver);
		javascriptExecutorPageDemoObj.scrollIntoView();
	}
	@Test
	public void checkAndScrollBackToTop() {
		JavascriptExecutorPageDemo javascriptExecutorPageDemoObj = new JavascriptExecutorPageDemo(driver);
		javascriptExecutorPageDemoObj.scrollBackToTop();
	}
	@Test
	public void checkAndScrollDownByDocHeight() {
		JavascriptExecutorPageDemo javascriptExecutorPageDemoObj = new JavascriptExecutorPageDemo(driver);
		javascriptExecutorPageDemoObj.scrollDownByDocHeight();
	}
	@Test
	public void checkAndScrollAndClickOnElement() {
		JavascriptExecutorPageDemo javascriptExecutorPageDemoObj = new JavascriptExecutorPageDemo(driver);
		javascriptExecutorPageDemoObj.scrollAndClickOnElement();
	}
	@Test
	public void checkAndStopPageRefresh() {
		JavascriptExecutorPageDemo javascriptExecutorPageDemoObj = new JavascriptExecutorPageDemo(driver);
		javascriptExecutorPageDemoObj.stopPageRefresh();
	}
	@Test
	public void checkAndWaitLongTimeout() throws InterruptedException {
		JavascriptExecutorPageDemo javascriptExecutorPageDemoObj = new JavascriptExecutorPageDemo(driver);
		javascriptExecutorPageDemoObj.waitLongTimeout();
	}
	@Test
	public void checkAndWaitLongTimeoutNanos() throws InterruptedException {
		JavascriptExecutorPageDemo javascriptExecutorPageDemoObj = new JavascriptExecutorPageDemo(driver);
		javascriptExecutorPageDemoObj.waitLongTimeoutNanos();
	}
	@Test
	public void checkAndGenerateHashCode() {
		JavascriptExecutorPageDemo javascriptExecutorPageDemoObj = new JavascriptExecutorPageDemo(driver);
		javascriptExecutorPageDemoObj.generateHashCode();
	}
	
}
