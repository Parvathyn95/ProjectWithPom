package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class SimpleFormDemoPageFactory {
	public WebDriver driver;
	public SimpleFormDemoPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='single-input-field']")
	private WebElement enterMessageField;
	
	@FindBy(xpath="//button[@id='button-one']")
	private WebElement showMessageButton;
	
	@FindBy(xpath="//div[@id='message-one']")
	private WebElement yourMessageField;
	
	public void verifySingleInputField() throws IOException {
		String inputText,expectedMessage,actualMessage;
		inputText=ExcelUtility.getStringMultiColor(1,2,"\\src\\main\\java\\Resources\\testdata.xlsx","Simple Form Demo");
		PageUtility.enterText(enterMessageField, inputText);
		WaitUtility.waitForElementToBeClickable(driver, showMessageButton);
		PageUtility.clickOnElement(showMessageButton);
		actualMessage = yourMessageField.getText();
		expectedMessage = ExcelUtility.getStringMultiColor(1,0,"\\src\\main\\java\\Resources\\testdata.xlsx","Simple Form Demo");
		Assert.assertEquals(expectedMessage+inputText,actualMessage, "Expected and actual messages are not same");
	}
	
}
