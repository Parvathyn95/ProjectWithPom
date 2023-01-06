package com.obsqura.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;
import pages.SimpleFormDemoPageFactory;

public class SimpleFormDemoPageFactoryTest extends BaseObs {
	SimpleFormDemoPageFactory simpleFormDemoPageFactoryObj;
	@Test
	public void checkAndVerifySingleInputField() throws IOException{
		simpleFormDemoPageFactoryObj = new SimpleFormDemoPageFactory(driver);
		simpleFormDemoPageFactoryObj.verifySingleInputField();
	}

}
