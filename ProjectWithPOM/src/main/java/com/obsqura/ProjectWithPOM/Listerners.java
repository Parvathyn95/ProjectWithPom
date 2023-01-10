package com.obsqura.ProjectWithPOM;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utilities.ExtendedReportUtility;

public class Listerners implements ITestListener {
	ExtentTest test;

	ExtentReports extent=ExtendedReportUtility.getReportObject();
	ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();

public void onTestStart(ITestResult iTestResult) {
    System.out.println("onTestStart");
}

public void onTestSuccess(ITestResult iTestResult) {
    System.out.println("onTestSuccess");
}

public void onTestFailure(ITestResult iTestResult) {
    System.out.println("onTestFailure");
}

public void onTestSkipped(ITestResult iTestResult) {
    System.out.println("onTestSkipped");
}

public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    System.out.println("onTestFailedButWithinSuccessPercentage");
}

public void onStart(ITestContext iTestContext) {
    System.out.println("onTestFailedButWithinSuccessPercentage");
}

public void onFinish(ITestContext iTestContext) {
    System.out.println("onFinish");
}
}