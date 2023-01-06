package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import utilities.WaitUtility;

public class ActionsDemoPage{
	public WebDriver driver;
	By dragAndDropOption = By.xpath("//li[@class='list-group-item']//child::a[@href='drag-drop.php']");
	By DynamicDataLoadingOption = By.xpath("//li[@class='list-group-item']//child::a[@href='dynamic-load.php']");
	By chartDemoOption  = By.xpath("//li[@class='list-group-item']//child::a[@href='chart.php']");
	By draggableN01Option = By.xpath("//div[@id='todrag']//child::span[text()='Draggable n°1']");
	By blankSpaceOption = By.xpath("//div[@id='mydropzone']");
	By droppedItemsList =By.xpath("//div[@id='mylist']//child::span");
	public ActionsDemoPage(WebDriver driver) {
		this.driver=driver;

	}
	public void verifyAndDoubleClickDragAndDrop() {
		Actions action = new Actions(driver);
		WebElement element=driver.findElement(dragAndDropOption);
		action.doubleClick(element).perform();
	}
	public void verifyAndClickDynamicDataLoadingOption() {
		Actions action = new Actions(driver);
		WebElement element=driver.findElement(DynamicDataLoadingOption);
		action.contextClick(element).perform();
	}
	public void verifyAndClickChartDemo() {
		Actions action = new Actions(driver);
		WebElement element=driver.findElement(chartDemoOption);
		action.click(element).perform();
	}
	public void verifyAndHoverChartDemo() {
		Actions action = new Actions(driver);
		WebElement element=driver.findElement(dragAndDropOption);
	//	action.moveToElement(element).perform();
	//	action.clickAndHold(element).perform();
	//	action.contextClick(element).perform();
		WebElement source = driver.findElement(draggableN01Option);
		WebElement target = driver.findElement(blankSpaceOption);
		//action.dragAndDropBy(source, 352,52).build().perform();
		int offsetx1 = source.getLocation().getX();
		int offsety1 = source.getLocation().getY();
		int offsetx2 = target.getLocation().getX();
		int offsety2 = target.getLocation().getY();
		int xOffset=(offsetx2-offsetx1)+10;
		int yOffset=(offsety2-offsety1)+20;
		action.dragAndDropBy(source, xOffset,yOffset).build().perform();
		WaitUtility.waitForVisibilityOfElementLocated(driver, droppedItemsList);	
	}
}
