package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.DataProviderUtility;
import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.ParameterUtility;

public class FormSubmitByDataProvider {
	public WebDriver driver;
	By firstNameField = By.xpath("//input[@id='validationCustom01']");
	By lastNameField = By.xpath("//input[@id='validationCustom02']");
	By userNameField = By.xpath("//input[@id='validationCustomUsername']");
	By cityField = By.xpath("//input[@id='validationCustom03']");
	By stateField = By.xpath("//input[@id='validationCustom04']");
	By zipField = By.xpath("//input[@id='validationCustom05']");
	By agreeTermsConditions = By.xpath("//input[@id='invalidCheck']");
	By submitFormButton = By.xpath("//button[text()='Submit form']");
	By actualMessageField = By.xpath("//div[@id='message-one']");
	public FormSubmitByDataProvider(WebDriver driver) {
		this.driver=driver;
	}
	public void fillAndSubmitFormByDataProvider(String firstName,String lastName,String userName,String city,String state,String zip) throws IOException {
		ExcelUtility ExcelUtilityObj;
		WebElement FirstNameField = driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		DataProviderUtility.sendKeyValue(driver, FirstNameField, firstName);
		WebElement LastNameField = driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		DataProviderUtility.sendKeyValue(driver, LastNameField, lastName);
		WebElement UserNameField = driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		DataProviderUtility.sendKeyValue(driver, UserNameField, userName);
		WebElement CityField = driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		DataProviderUtility.sendKeyValue(driver, CityField, city);
		WebElement StateField = driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		DataProviderUtility.sendKeyValue(driver, StateField, state);
		WebElement ZipField = driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		DataProviderUtility.sendKeyValue(driver, ZipField, zip);
		WebElement AgreeTermsConditions = driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		PageUtility.clickOnElement(AgreeTermsConditions);
		WebElement SubmitFormButton = driver.findElement(By.xpath("//button[text()='Submit form']"));
		if(SubmitFormButton.isEnabled()) {
			if(SubmitFormButton.isSelected()!=true) {
				PageUtility.clickOnElement(SubmitFormButton);
				WebElement ActualMessageField = driver.findElement(By.xpath("//div[@id='message-one']"));
				String actualMessage = PageUtility.getElementText(ActualMessageField);
				String expectedMessage = ExcelUtility.getStringMultiColor(1,0 , "\\src\\main\\java\\Resources\\color.xlsx", "FormSubmitByDataProvider");
				Assert.assertEquals(actualMessage, expectedMessage, "Actual and Expected Messages are equal");
			}
			Assert.assertFalse(SubmitFormButton.isSelected(), "Submit Form Button is already selected");
		}
		Assert.assertTrue(SubmitFormButton.isEnabled(), "Submit Form Button Disabled");
	}
	


}
