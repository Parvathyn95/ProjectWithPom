package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.PageUtility;

public class JavascriptExecutorPageDemo {
	public WebDriver driver;
	By getTotal = By.xpath("//button[@id='button-two']");
	public JavascriptExecutorPageDemo(WebDriver driver) {
		this.driver=driver;
	}
	public void scrollDownAndUp() {
		String argument1 = "window.scrollBy(0,350)";
		PageUtility.scrollDown(driver,argument1);
		String argument2 = "window.scrollBy(0,-350)";
		PageUtility.scrollUpBack(driver,argument2);
	}
	public void scrollIntoView() {
		WebElement GetTotal = driver.findElement(getTotal);
		String argument = "arguments[0].scrollIntoView();";
		PageUtility.scrollIntoView(driver,argument, GetTotal);
	}
	public void scrollBackToTop() {
		String argument = "window.scrollBy(0,350)";
		String element="";
		PageUtility.scrollBackToTop(driver,argument, element);
	}
	public void scrollDownByDocHeight() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String argument = "window.scrollBy(0, document.body.scrollHeight)";
		PageUtility.scrollBottomByDocHeight(driver,argument);
	}
	public void scrollAndClickOnElement() {
		WebElement GetTotal = driver.findElement(getTotal);
		String argument = "arguments[0].click();";
		PageUtility.scrollAndClickOnElement(driver,argument, GetTotal);	
	}
	public void stopPageRefresh() {
		String argument = "window.stop();";
		PageUtility.stopPageRefresh(driver,argument);
	}
	public void justWait() throws InterruptedException {
		PageUtility.justWait(driver);
	}
	public void waitLongTimeout() throws InterruptedException {
		long timeout = 1500;
		PageUtility.waitLongTimeout(driver, timeout);
	}
	public void waitLongTimeoutNanos() throws InterruptedException {
		long timeout = 2500;
		int nanos=500;
		PageUtility.waitLongTimeoutNanos(driver, timeout,nanos);
	}
	public void generateHashCode() {
		PageUtility.generateHashCode(driver);
	}
	
}
