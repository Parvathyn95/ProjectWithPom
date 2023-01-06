package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeAlert {
	public WebDriver driver;
	By alertBoxClickMe = By.xpath("//button[@id='alertBox']");
	By confirmBoxClickMe = By.xpath("//button[@id='confirmBox']");
	By promptBoxClickMe = By.xpath("//button[@id='promptBox']");
	public PracticeAlert(WebDriver driver) {
		this.driver=driver;
	}
	public void alertBoxClickMe() {
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(alertBoxClickMe).click();
		driver.switchTo().alert().accept();
	}
	public void confirmBoxClickMe() {
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(confirmBoxClickMe).click();
		driver.switchTo().alert().accept();
		driver.findElement(confirmBoxClickMe).click();
		driver.switchTo().alert().dismiss();
	}
	public void promptBoxClickMe() {
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(promptBoxClickMe).click();
		driver.switchTo().alert().sendKeys("Sneha Reddy");	
	}

}
