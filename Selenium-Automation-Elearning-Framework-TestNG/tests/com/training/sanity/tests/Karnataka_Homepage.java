package com.training.sanity.tests;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.HomePage;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class Karnataka_Homepage {

	private WebDriver driver;
	private String baseUrl;
//	private LoginPOM loginPOM;
	private static Properties properties;
	private HomePage Karnataka;
//	private ScreenShot screenShot;

//	@BeforeClass
//	public static void setUpBeforeClass() throws IOException {
//		properties = new Properties();
//		FileInputStream inStream = new FileInputStream("./resources/others.properties");
//		properties.load(inStream);
//	}

	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
//		LoginPOM = new LoginPOM(driver); 
		Karnataka = new HomePage(driver);
		baseUrl = properties.getProperty("baseURL");
//		ScreenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	
	@Test
	public void TC_004 () {
		Karnataka.crausels();
	}
	
	@Test
	public void TC_006 () {
		Karnataka.experience();
	}
	
	
	@Test
	public void TC_008 () {
		Karnataka.latestInkar();
	}
	
	@Test
	public void TC_010 () {
		Karnataka.adoptmonum();
	}
	
	@Test
	public void TC_012 () {
		Karnataka.destinations();
	}
	
	@Test
	public void TC_014 () {
		Karnataka.exploreKar();
	}
	
	
	
	
	
	
	
	
//	@AfterMethod
//	public void tearDown() throws Exception {
//		Thread.sleep(1000);
//		driver.quit();
//	}
//	@Test
//	public void validLoginTest() {
//		loginPOM.sendUserName("admin");
//		loginPOM.sendPassword("admin@123");
//		loginPOM.clickLoginBtn(); 
//		screenShot.captureScreenShot("First");
//	}
}
