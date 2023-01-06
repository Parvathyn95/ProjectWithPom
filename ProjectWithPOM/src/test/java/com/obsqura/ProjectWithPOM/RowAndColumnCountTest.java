package com.obsqura.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.ActionsDemoPage;
import pages.RowAndColumnCount;
import pages.SideNavigationMenuSelect;

public class RowAndColumnCountTest extends BaseObs{
	RowAndColumnCount rowAndColumnCountObj;
	SideNavigationMenuSelect sideNavigationMenuSelectObj;
	@Test
	public void findCountColumnSize() throws IOException {
		sideNavigationMenuSelectObj = new SideNavigationMenuSelect(driver);
		sideNavigationMenuSelectObj.navigationMenuClick("Table");
		rowAndColumnCountObj = new RowAndColumnCount(driver);
		rowAndColumnCountObj.countColumnSize();
	}
	@Test
	public void findCountRowSize() throws IOException {
		sideNavigationMenuSelectObj = new SideNavigationMenuSelect(driver);
		sideNavigationMenuSelectObj.navigationMenuClick("Table");
		rowAndColumnCountObj = new RowAndColumnCount(driver);
		rowAndColumnCountObj.countRowSize();
	}

}
