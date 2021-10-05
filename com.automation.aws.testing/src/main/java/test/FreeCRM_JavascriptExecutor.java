package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;

import page.Homepage_myBlog;

public class FreeCRM_JavascriptExecutor extends Driver{
	static String hptitle = null;
	static Object titleJs = null;
	JavascriptExecutor js = (JavascriptExecutor) driver;
/*
	@Test(enabled = false)
	public void navigate_Crm() {
		System.out.println("In Navigate_Crm");
		driver.navigate().to("https://freecrm.co.in/");
		hptitle = driver.getTitle();
		System.out.println("Title of Page is :- "+hptitle);
		
	}
	@Test(enabled = false)
	public void navigate_CrmJS() {
		System.out.println("In Navigate_CrmJs");
		titleJs= js.executeScript("return document.title;").toString();
		System.out.println("Title of Page Using JavaScript :-"+titleJs);
	}

	@Test(enabled = false)
	public void evalaute_Xpath() {
		js.executeScript("return document.evaluate( '//body//div/iframe' ,document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null ).singleNodeValue;");
	}

	@Test(enabled = false)//TextBox is disabled in WebPage,So unable to edit
	public void disableField() throws InterruptedException {
		driver.navigate().to("https://www.oracle.com/webfolder/technetwork/jet-420/jetCookbook.html?component=textInput&demo=disabled");
	Thread.sleep(15000);	
	
		driver.switchTo().frame("iFrameDemo");
	WebElement input = driver.findElement(By.id("text-input-disabled"));
	Thread.sleep(5000);	
boolean value =	input.isEnabled();
System.out.println("Value is :- "+value);	
//js.executeScript("arguments[0]", input);
		input.sendKeys("Hello Oracle");
	}
	*/
		@Test(priority = 1)

	public  void hradio_Btn(){
		driver.navigate().to("https://automationeveryday.blogspot.com/2020/04/selenium-practice-hidden-radio-button.html");
	//	Homepage_myBlog hm = PageFactory.initElements(driver,Homepage_myBlog.class);
		Homepage_myBlog hm = new Homepage_myBlog(driver);
		
		hm.hradio();
	}
	
	
}
