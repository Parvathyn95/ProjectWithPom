package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPractice {
	public WebDriver driver;
	By fullName = By.xpath("//input[@id='user_full_name']");
	By businessId = By.xpath("//input[@id='user_email_login']");
	By password = By.xpath("//input[@id='user_password']");
	By alertBox = By.xpath("(//input[@name='terms_and_conditions'])[1]");
	By signmeUp = By.xpath("//input[@value='Sign me up']");
	public AlertPractice(WebDriver driver) {
		this.driver=driver;
	}
	public void signUpAsUser() {
		driver.navigate().to("https://www.browserstack.com/users/sign_up");
		WebElement FullName = driver.findElement(fullName);
		FullName.sendKeys("Parvathy Nair");
		WebElement BusinessId = driver.findElement(businessId);
		BusinessId.sendKeys("parvathyn@rocketmail.com");
		WebElement Password = driver.findElement(password);
		Password.sendKeys("Test123");
		WebElement AlertBox= driver.findElement(alertBox);
			if(AlertBox.isSelected()) {
				driver.switchTo().alert().dismiss();
				AlertBox.click();
				WebElement SignMeUp = driver.findElement(signmeUp);
				SignMeUp.click();
			}
	}
	

}
