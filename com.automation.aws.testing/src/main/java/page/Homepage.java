package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.automation.aws.driver.Driver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Homepage extends Driver{
	//***Variable***

	//***ENd Variable***
 //**********************Xpath***************
	@FindBy(xpath = "//*[@id='keywords_input']")
	WebElement txtsearch;
	@FindBy(xpath = "//*[@id='search_button']")
	WebElement btnsearch;
	




//*****************END Xpath********************
public Homepage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(this.driver, this);

}//****************
@BeforeMethod
public void reporter() {
	
	//log = report.createTest("TEstCASE");
}
	public void search(String dishname) {
	try{
		txtsearch.clear();
		txtsearch.sendKeys(dishname);
		System.out.println("Search for :- "+dishname);
		btnsearch.click();
		
		log.pass("HP");
		
	}
	catch(Exception E) {
		
	}
//************


	

}
//*********************END************





























//*******************************END********************************
}
