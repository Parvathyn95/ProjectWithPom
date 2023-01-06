package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class DataProviderUtility {
	public static void sendKeyValue(WebDriver driver,WebElement element,String newString) {
		element.sendKeys(newString);
	}
	@DataProvider(name="formData")
	public static Object[][] getDataFromFormData(){
		return new Object[][] {
			{"Sreya","Iyer","Shreya96","Adayar","Chennai","965234"}
		};
	}

}
