package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeWindowHandling {
	public WebDriver driver;
	By clickHere = By.xpath("//a[text()='Click Here']");
	By emailId = By.xpath("//input[@name='emailid']");
	By submit = By.xpath("//input[@fdprocessedid='dukh7a']");
	public PracticeWindowHandling(WebDriver driver) {
		this.driver=driver;
	}
	public void popupFromClickHere() {
		driver.navigate().to("https://demo.guru99.com/popup.php");
		WebElement ClickHere = driver.findElement(clickHere);
		ClickHere.click();
		String MainWindow = driver.getWindowHandle();
		Set <String> s1 = driver.getWindowHandles();
		Iterator <String> i1 = s1.iterator();
		while(i1.hasNext()) {
			String ChildWindow=i1.next();
				if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
					driver.switchTo().window(ChildWindow);
					WebElement EmailId = driver.findElement(emailId);
					EmailId.sendKeys("Parvathy Nair");
					WebElement Submit = driver.findElement(submit);
					Submit.click();
				}
		}
		driver.close();
		driver.switchTo().window(MainWindow);
		
	}

}
