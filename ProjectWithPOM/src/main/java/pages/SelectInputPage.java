package pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import utilities.PageUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.ExcelUtility;
import utilities.WaitUtility;

public class SelectInputPage {
	public ExcelUtility excelUtilityObj;
	public WebDriver driver;
	By selectInputField = By.xpath("//select[@id='single-input-field']");
	By actMessage = By.xpath("//div[@id='message-one']");
	By multipleInputField = By.xpath("//select[@id='multi-select-field']");
	By getFirstSelectedButton = By.xpath("//button[@id='button-first']");
	By getAllSelectedButton = By.xpath("//button[@id='button-all']");
	By multipleActualMessage = By.xpath("//div[@id='message-two']");
	public SelectInputPage(WebDriver driver) {
		this.driver=driver;
	}
	public void verifySelectSingleInputColor() throws IOException {
		ExcelUtility excelUtilityObj = new ExcelUtility();
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		String inputColor,expectedMessage,actualMessage;
		Wait fluentWait = new FluentWait<WebDriver> (driver)
				.withTimeout(Duration.ofSeconds(25))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(selectInputField));
		Select inputSelect = new Select(driver.findElement(selectInputField));
		inputColor=excelUtilityObj.getStringMultiColor(1,0,"\\src\\main\\java\\Resources\\testdata.xlsx","Select Input");
		inputSelect.selectByVisibleText(inputColor);
		actualMessage = driver.findElement(actMessage).getText();
		expectedMessage = excelUtilityObj.getStringMultiColor(1,1,"\\src\\main\\java\\Resources\\testdata.xlsx","Select Input");
		Assert.assertEquals(expectedMessage+inputColor, actualMessage);
		
	}
	public void verifySelectMultipleInputColor() throws IOException {
		ExcelUtility excelUtilityObj = new ExcelUtility();
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		String actualMessage,expectedMessage,color1,color2,color3;
		Select multipleSelect = new Select(driver.findElement(multipleInputField));
		multipleSelect.isMultiple();
		multipleSelect.selectByVisibleText(excelUtilityObj.getStringMultiColor(1,0,"\\src\\main\\java\\Resources\\testdata.xlsx","Select Input"));
		multipleSelect.selectByVisibleText(excelUtilityObj.getStringMultiColor(2,0,"\\src\\main\\java\\Resources\\testdata.xlsx","Select Input"));
		multipleSelect.selectByVisibleText(excelUtilityObj.getStringMultiColor(3,0,"\\src\\main\\java\\Resources\\testdata.xlsx","Select Input"));
		WaitUtility.waitForVisibilityOfAllElementsLocatedBy(driver, getAllSelectedButton);
		WebElement GetAllSelectedButtonWebElement = driver.findElement(getAllSelectedButton);
		PageUtility.clickOnElement(GetAllSelectedButtonWebElement);
		driver.findElement(getAllSelectedButton).click();
		actualMessage = driver.findElement(multipleActualMessage).getText();
		expectedMessage = excelUtilityObj.getStringMultiColor(2,1,"\\src\\main\\java\\Resources\\testdata.xlsx","Select Input");
		List<WebElement> multipleColor =  multipleSelect.getOptions();
		color1=multipleColor.get(0).getText();
		color2=multipleColor.get(1).getText();
		color3=multipleColor.get(2).getText();
		WaitUtility.waitForPresenceOfAllElementsLocatedBy(driver, getAllSelectedButton);   //wait for actual message(not for get all selected button)
		Assert.assertEquals(expectedMessage, actualMessage);		
	}
}
