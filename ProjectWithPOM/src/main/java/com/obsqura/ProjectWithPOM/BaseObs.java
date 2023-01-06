package com.obsqura.ProjectWithPOM;


	import java.io.FileInputStream;
	import java.time.Duration;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.ITestContext;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import constants.Constants;

	public class BaseObs {
		public WebDriver driver;
		public Properties prop,prop1;
		public FileInputStream fs,fs1;
		@BeforeMethod
		public void initBrowser() {
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
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
			//driver.get(prop.getProperty("https://selenium.obsqurazone.com/simple-form-demo.php"));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   -depricated version before Selenium 4 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //modificated version after Selenium 4 
		}
		@AfterMethod
		public void driverClose() {
			driver.close();
		}
		
		

	}



