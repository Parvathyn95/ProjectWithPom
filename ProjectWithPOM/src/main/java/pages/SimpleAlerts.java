package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimpleAlerts {
	public WebDriver driver;
	By clickMeButton = By.xpath("//button[@class='btn btn-success']");
	By cancelButton = By.xpath("//button[@class='btn btn-warning']");
	By promptBox = By.xpath("//button[@class='btn btn-danger']");
	public SimpleAlerts(WebDriver driver) {
		this.driver=driver;
	}
	public void alertBoxClickMe() {
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.findElement(clickMeButton).click();
		driver.switchTo().alert().accept();
		driver.findElement(clickMeButton).click();
		String actualText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}
	public void confirmBoxClickMe() {
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.findElement(cancelButton).click();
		driver.switchTo().alert().accept();
		driver.findElement(cancelButton).click();
		driver.switchTo().alert().dismiss();
	}
	public void promptBoxClickMe() {
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.findElement(promptBox).click();
		driver.switchTo().alert().sendKeys("Sneha Reddy");	
		driver.switchTo().alert().accept();
	}

}
