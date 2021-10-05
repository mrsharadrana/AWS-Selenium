package com.automation.aws.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automation.aws.driver.Driver;

public class CommonElementMethod extends Driver{

	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	
	
}
