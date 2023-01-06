package pages;

import java.io.IOException;
import java.time.Duration;

import utilities.WaitUtility;
import utilities.PageUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.ExcelUtility;
import utilities.WaitUtility;

public class SimpleFormDemoPage {
	public WebDriver driver;
	By enterMessageField = By.xpath("//input[@id='single-input-field']");
	By showMessageButton = By.xpath("//button[@id='button-one']");
	By yourMessageField = By.xpath("//div[@id='message-one']");
	By enterValueA = By.xpath("//input[@id='value-a']");
	By enterValueB = By.xpath("//input[@id='value-b']");
	By twoInputTitleField =By.xpath("(//div[@class='card']//child::div[@class='card-header'])[3]");
	By totValueButton=By.xpath("//button[@id='button-two']");
	By totalAPlusBField = By.xpath("//div[@id='message-two']");
	

		public SimpleFormDemoPage(WebDriver driver) {
			this.driver=driver;
	
		}
		public void verifyTitleAndUrl() {
			String title="Obsqura Testing",actualTitle,actualUrl,fraction="simple-form-demo.php";
			WaitUtility.waitForTitleContains(driver, title);
			actualTitle=driver.getTitle();
			WaitUtility.waitForUrlContains(driver, fraction);
			actualUrl=driver.getCurrentUrl();
		}
	
		public void verifySingleInputField() throws IOException {
			ExcelUtility excelUtilityObj = new ExcelUtility();
			String inputText = "Apple",title="Obsqura Testing";
			WaitUtility.waitForTitleIs(driver, title);
			String expectedMessage,actualMessage;
			WebElement ShowMessageButton = driver.findElement(showMessageButton);
			//driver.findElement(enterMessageField).sendKeys(inputText);
			WebElement EnterMessageFieldWebElement = driver.findElement(enterMessageField);
			inputText=ExcelUtility.getStringMultiColor(1,2,"\\src\\main\\java\\Resources\\testdata.xlsx","Simple Form Demo");
			PageUtility.enterText(EnterMessageFieldWebElement, inputText);
			WaitUtility.waitForElementToBeClickable(driver, ShowMessageButton);
			//driver.findElement(showMessageButton).click();
			WebElement ShowMessageButtonWebElement = driver.findElement(showMessageButton);
			PageUtility.clickOnElement(ShowMessageButtonWebElement);
			WaitUtility.waitForVisibilityOfElementLocated(driver, yourMessageField);
			actualMessage = driver.findElement(yourMessageField).getText();
			expectedMessage = ExcelUtility.getStringMultiColor(1,0,"\\src\\main\\java\\Resources\\testdata.xlsx","Simple Form Demo");
			Assert.assertEquals(expectedMessage+inputText,actualMessage, "Expected and actual messages are not same");
		}
		
		public void verifyTwoInputField() throws IOException {
			ExcelUtility excelUtilityObj = new ExcelUtility();
			int aValue,bValue,getTotalValue;
			String valueA="25",valueB="50";
			String actualTitle = null,expectedMessage , actualMessage;
			driver.findElement(enterValueA).sendKeys(valueA);
			driver.findElement(enterValueB).sendKeys(valueB);
			aValue=Integer.valueOf(valueA);
			bValue=Integer.valueOf(valueB);
			WaitUtility.waitForElementToBeClickable(driver, totValueButton);
			driver.findElement(totValueButton).click();
			getTotalValue = aValue+bValue;
			WaitUtility.waitForPresenceOfElementLocated(driver, totalAPlusBField);
			actualMessage = driver.findElement(totalAPlusBField).getText();
			expectedMessage = ExcelUtility.getStringMultiColor(1,1,"\\src\\main\\java\\Resources\\testdata.xlsx","Simple Form Demo");
			Assert.assertEquals(expectedMessage+getTotalValue, actualMessage,"Actual and Expected Messages are not equal");
			
		}
		
}
