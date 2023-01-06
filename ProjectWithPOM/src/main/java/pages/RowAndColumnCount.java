package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.ExcelUtility;

public class RowAndColumnCount {
	public WebDriver driver;
	By table = By.xpath("//table[@id='dtBasicExample']");
	By columnElementsList = By.xpath("//table[@id='dtBasicExample']//child::th[@class='th-sm sorting_disabled']");
	By rowElementsList = By.xpath("//table[@id='dtBasicExample']//child::tbody//tr");
	public RowAndColumnCount(WebDriver driver) {
		this.driver=driver;
	}
		public void countColumnSize() {
			WebElement Table = driver.findElement(table);
			List <WebElement> columnElement = Table.findElements(columnElementsList);
			int columnCount=columnElement.size();
			for(WebElement column: columnElement) {
				System.out.println(column.getText());
			}
		}
		public void countRowSize() throws IOException {
			String expectedField;
			ExcelUtility excelUtilityObj = new ExcelUtility();
			expectedField = excelUtilityObj.getStringMultiColor(1, 0, "\\src\\main\\java\\Resources\\color.xlsx", "RowColumnTable");
			WebElement Table = driver.findElement(table);
			List  <WebElement> rowElement= Table.findElements(rowElementsList);
			int rowCount=rowElement.size();
			for(WebElement row : rowElement) {
				if(row.getText().equals(expectedField)) {
					String actualField = row.getText();
					Assert.assertEquals(expectedField, actualField);
					break;
				}
			}
		}
	}

	
