package test;



import java.util.regex.Pattern;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.automation.aws.driver.Driver;
import com.automation.aws.utility.ScreenshotUtility;
import com.automation.aws.utility.Web;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.ScreenCapture;

import page.*;

import org.openqa.selenium.support.FindBy;

public class Search_Zomato_TC extends Driver {
	

	@BeforeClass
	public void beforeClass() {
		

	
	}
	@Test
	public void testCase1() throws Exception {
		String Dishname1 = "Fried Rice";
//Report Geneartion
//		log=  report.createTest("Zomato Automation","Test Report for Zomato");
//		
//		if(driver.getTitle().contains("Zomato")) {
//			log.pass("Title of the page is :- "+driver.getTitle());
//			log.log(Status.FAIL,"Naviagted :-"+driver.getTitle());
//			log.fail("FAiled");
//			log.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("s.png").build());
//		}
		System.out.println("Title of the Page :- " + driver.getTitle());
		// Call Search Method
		Homepage hm = new Homepage(driver);
		Web web = new Web(driver);
		web.halt();
		hm.search(Dishname1);
		web.halt();
		web.halt();
		System.out.println("Message:- " + driver.getTitle());
		RestrauantDetailPage rdp = new RestrauantDetailPage(driver);
		rdp.sorting();
		System.out.println("Searching High Rating Restaurant");
	}

	

@AfterTest
	public void endTest() {

}

}