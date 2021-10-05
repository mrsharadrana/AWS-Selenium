package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.DoubleClickAction;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;

import page.Action_OperationPage;

public class ActionOperations extends Driver {

	
	
	@Test (enabled =false)
	public void dragAndDrop() throws Exception {
		driver.navigate().to("https://dhtmlx.com/docs/products/dhtmlxTree/");
		Action_OperationPage actPage = new Action_OperationPage(driver);
		actPage.dragAndDrop();

	}
	@Test (enabled = false)
	public void clickHoldDrop() {
		Action_OperationPage actPage = new Action_OperationPage(driver);	
		driver.navigate().to("https://dhtmlx.com/docs/products/dhtmlxTree/");
		actPage.clickHoldDrop();
	}
@Test(enabled =false)
public void imgdragAndDrop() throws Exception {
	Action_OperationPage actPage = new Action_OperationPage(driver);
	driver.navigate().to("https://automationeveryday.blogspot.com/2020/04/selenium-practice-drag-and-drop.html");
	actPage.imgdragAndDrop();
	
}
@Test
public void DoubleClickAction() throws Exception {
	Action_OperationPage actPage = new Action_OperationPage(driver);
	driver.navigate().to("https://www.google.com/");
	actPage.doubleClick();
	
}
}
