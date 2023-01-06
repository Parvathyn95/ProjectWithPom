package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageUtility;

public class BootstrapAlert {
	public WebDriver driver;
	By normalSuccess = By.xpath("//button[@id='normal-btn-success']");
	By closeNormalSuccess = By.xpath("//div[@class='alert alert-success alert-normal-success']//child::button[@class='close']");
	By normalWarning = By.xpath("//button[@id='normal-btn-warning']");
	By closeNormalWarning = By.xpath("//div[@class='alert alert-warning alert-normal-warning']//child::button");
	By normalDanger = By.xpath("//button[@id='normal-btn-danger']");
	By closeNormalDanger = By.xpath("//div[@class='alert alert-danger alert-normal-danger']//button");
	By normalInfo = By.xpath("//button[@id='normal-btn-info']");
	By closeNormalInfo = By.xpath("//div[@class='alert alert-info alert-normal-info']//button");	
	public BootstrapAlert(WebDriver driver) {
		this.driver=driver;
	}
	public void normalSuccessClickClose() {
		WebElement NormalSuccess = driver.findElement(normalSuccess);
		PageUtility.clickOnElement(NormalSuccess);
		WebElement CloseNormalSuccess = driver.findElement(closeNormalSuccess);
		PageUtility.clickOnElement(CloseNormalSuccess);
	}
	public void normalWarningClickClose() {
		WebElement NormalWarning = driver.findElement(normalWarning);
		PageUtility.clickOnElement(NormalWarning);
		WebElement CloseNormalWarning = driver.findElement(closeNormalWarning);
		PageUtility.clickOnElement(CloseNormalWarning);
	}
	public void normalDangerClickClose() {
		WebElement NormalDanger = driver.findElement(normalDanger);
		PageUtility.clickOnElement(NormalDanger);
		WebElement CloseNormalDanger = driver.findElement(closeNormalDanger);
		PageUtility.clickOnElement(CloseNormalDanger);
	}
	public void normalInfoClickClose() {
		WebElement NormalInfo = driver.findElement(normalInfo);
		PageUtility.clickOnElement(NormalInfo);
		WebElement CloseNormalInfo = driver.findElement(closeNormalInfo);
		PageUtility.clickOnElement(CloseNormalInfo);
	}
}
