package com.automation.aws.driver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.automation.aws.utility.CommonElementMethod;
import com.automation.aws.utility.Screenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

//**************
public class Driver {
	public static WebDriver driver;
	public static String baseUrl;
	public static Properties p;
	private static Map<Long, WebDriver> driverThread = new HashMap<Long, WebDriver>();
	public ExtentReports report;
	public ExtentTest log;
	
	

	/*
	 * Reporting
	 * 
	 * @BeforeSuite public void setupReport() { ExtentHtmlReporter extent = new
	 * ExtentHtmlReporter(new File("./Extent-Report/extent.html")); report = new
	 * ExtentReports(); report.attachReporter(extent);
	 * 
	 * }
	 */
	@BeforeTest
	public void setUp() throws Exception {
		//Supress warning msg - now doesn't work
//		System.setProperty("webdriver.chrome.silentOutput", "true");
//		System.setProperty("webdriver.chrome.driver","./Library/chromedriver");
		// For Linux
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver = new FirefoxDriver(); 
		baseUrl = "https://automationeveryday.blogspot.com/";
//	    baseUrl = "https://www.zomato.com/";
//		System.out.println("Navigated to :- " + baseUrl);
		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get(baseUrl + "");

	}
//**************

//*************
	/*
	 * public static WebDriver getDriverThread(long threadID) { // TODO
	 * Auto-generated method stub return driverThread.get(threadID); }
	 */

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {

//	if(result.getStatus()==ITestResult.FAILURE)
//	{
//		String temp=Screenshot.getScreenshot(driver);
//		
//		log.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
//	}

//	report.flush();
		driver.close();
		driver.quit();
		
		

	}

//*******************END************
}