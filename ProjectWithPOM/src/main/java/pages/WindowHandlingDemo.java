package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowHandlingDemo {
	public WebDriver driver;
	By likeUsOnFacebook = By.xpath("//a[@class='btn btn-primary windowSingle']");
	By logIn = By.xpath("//a[@aria-label='Accessible login button']");
	By createNewAccount = By.xpath("//a[@aria-label='Accessible sign up button']");
	public WindowHandlingDemo(WebDriver driver) {
		this.driver= driver;
	}
	public void clickLikeUsOnFacebook() {
		driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
		driver.findElement(likeUsOnFacebook).click();
		String MainWindow = driver.getWindowHandle();
		Set <String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()) {
			String ChildWindow = i1.next();
				if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
					driver.switchTo().window(ChildWindow);
					WebElement LogIn = driver.findElement(logIn);
					LogIn.click();
				}
		}
		driver.close();
		driver.switchTo().window(MainWindow);
	}
	public void clickCreateNewAccount() {
		driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
		String MainWindow = driver.getWindowHandle();
		Set <String> s1 = driver.getWindowHandles();
		Iterator <String> i1 = s1.iterator();
		while(i1.hasNext()) {
			String ChildWindow=i1.next();
				if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
					driver.switchTo().window(ChildWindow);
					WebElement CreateNewAccount = driver.findElement(createNewAccount);
					CreateNewAccount.click();
				}
		}
		driver.close();
		driver.switchTo().window(MainWindow);
	}

}
