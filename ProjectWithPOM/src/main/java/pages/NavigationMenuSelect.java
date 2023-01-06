package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationMenuSelect {
	public WebDriver driver;
	By navMenuItemsList = By.xpath("//li[@class='list-group-item']//child::a");
	private String expectedString;
	public NavigationMenuSelect(WebDriver driver) {
		this.driver=driver;
	}
	public void navigationMenuClick(String expectedString) {
		List <WebElement> navMenuItems = driver.findElements(navMenuItemsList);
			for(WebElement navMenu : navMenuItems) {
				if(navMenu.getText().equalsIgnoreCase(expectedString)) {
					navMenu.click();
					break;
				}
			}
	}
	}

