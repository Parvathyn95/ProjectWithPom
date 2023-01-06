package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.ExcelUtility;
import utilities.PageUtility;

public class FormSubmitPage {
	public WebDriver driver;
	By firstNameField = By.xpath("//input[@id='validationCustom01']");
	By lastNameField = By.xpath("//input[@id='validationCustom02']");
	By userNameField = By.xpath("//input[@id='validationCustomUsername']");
	By cityField = By.xpath("//input[@id='validationCustom03']");
	By stateField = By.xpath("//input[@id='validationCustom04']");
	By zipField = By.xpath("//input[@id='validationCustom05']");
	By agreeTermsConditions = By.xpath("//input[@id='invalidCheck']");
	By submitFormButton = By.xpath("//button[text()='Submit form']");
	public FormSubmitPage(WebDriver driver) {
		this.driver=driver;
	}
	public void fillAndSubmitForm() throws IOException {
		ExcelUtility excelUtilityObj = new ExcelUtility();
		String firstName,lastName,userName,city,state,zip;
		firstName = ExcelUtility.getStringMultiColor(1, 0, "\\src\\main\\java\\Resources\\color.xlsx", "FormSubmit");
		driver.findElement(firstNameField).sendKeys(firstName);
		lastName = ExcelUtility.getStringMultiColor(1, 1, "\\src\\main\\java\\Resources\\color.xlsx", "FormSubmit");
		driver.findElement(lastNameField).sendKeys(lastName);
		userName =  ExcelUtility.getStringMultiColor(1, 2, "\\src\\main\\java\\Resources\\color.xlsx", "FormSubmit");
		driver.findElement(userNameField).sendKeys(userName);
		city =  ExcelUtility.getStringMultiColor(1, 3, "\\src\\main\\java\\Resources\\color.xlsx", "FormSubmit");
		driver.findElement(cityField).sendKeys(city);
		state = ExcelUtility.getStringMultiColor(1, 4, "\\src\\main\\java\\Resources\\color.xlsx", "FormSubmit");
		driver.findElement(stateField).sendKeys(state);
		zip = ExcelUtility.getStringMultiColor(1, 4, "\\src\\main\\java\\Resources\\color.xlsx", "FormSubmit");
		driver.findElement(zipField).sendKeys(zip);
		WebElement AgreeTermsConditions = driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		PageUtility.clickOnElement(AgreeTermsConditions);
		WebElement SubmitForm =driver.findElement(By.xpath("//button[text()='Submit form']"));
		PageUtility.clickOnElement(SubmitForm);
	}

}
