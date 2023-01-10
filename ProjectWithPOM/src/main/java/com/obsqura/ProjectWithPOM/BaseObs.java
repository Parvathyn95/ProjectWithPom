package com.obsqura.ProjectWithPOM;


	import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constants;

	public class BaseObs {
		public WebDriver driver;
		public Properties prop,prop1;
		public FileInputStream fs,fs1;
		@BeforeMethod
		public void initBrowser() throws FileNotFoundException {
			prop=new Properties();
			try {
				fs = new FileInputStream(System.getProperty("user.dir") +constants.Constants.CONFIGfILE);

			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				prop.load(fs);
			} catch (Exception e) {
				// TODO: handle exception
			}
			prop1=new Properties();

			try {
				fs = new FileInputStream(System.getProperty("user.dir") +constants.Constants.TESTDATAFILE);


			} catch (Exception e) {
				// TODO: handle exception
			}
			try {

				prop1.load(fs);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		@BeforeMethod
		@Parameters("browser")
		public void initializeBrowser(String browser) throws Exception {
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+constants.Constants.FIREfOXdRIVERfILE);
		driver = new FirefoxDriver();
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
		//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ constants.Constants.CHROMEdRIVERfILE);
		//create chrome instance
		driver = new ChromeDriver();
		}
		//Check if parameter passed as 'Edge'
		else if(browser.equalsIgnoreCase("Edge")){
		//set path to Edge.exe
		System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+constants.Constants.EdGEdRIVERfILE);
		//create Edge instance
		driver = new EdgeDriver();
		}
		else{
		//If no browser passed throw exception
		throw new Exception("Browser is not correct");
		}
			driver.get(prop.getProperty("url"));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		}
		@AfterMethod
		public void driverClose() {
			driver.close();
		}
		
		

	}



