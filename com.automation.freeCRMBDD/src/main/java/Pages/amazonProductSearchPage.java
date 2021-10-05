package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.driver;
import Utilities.elementMethods;

public class amazonProductSearchPage extends driver{
	
	
	elementMethods element = new elementMethods();
	
	public void NavigateToAmazon() {
		driver.get("https://www.amazon.in/");
		System.out.println("Browser is opened");
	    System.out.println("Title is "+driver.getTitle());
	    
	}
	public void SearchProduct(String product) {
		By txtSearch = By.id("twotabsearchtextbox");
		implicitWait(txtSearch, 5).clear();
		implicitWait(txtSearch, 5).sendKeys(product);
		implicitWait(txtSearch, 5).sendKeys(Keys.RETURN);
	    
	}
	public void GetTitle() {
		System.out.println("Title is"+driver.getTitle());
	}
	
	public WebElement implicitWait(By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		WebElement elementwait =wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return elementwait;
	}
}
