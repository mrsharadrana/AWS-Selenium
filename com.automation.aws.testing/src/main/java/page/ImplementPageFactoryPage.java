package page;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.automation.aws.driver.Driver;

public class ImplementPageFactoryPage extends Driver{

	@FindBy(xpath = "//input[@id='lesbo']")
	WebElement radioMale;
	
	
	public ImplementPageFactoryPage(WebDriver driver) {
		this.driver = driver;
		
	}
	public void NavigateToPage() {
		driver.get("https://automationeveryday.blogspot.com/2020/04/selenium-practice-hidden-radio-button.html");
		System.out.println(driver.getTitle());
	}
	public void SelectMaleRadioBtn() {
		radioMale.click();
		System.out.println("Male Selected "+radioMale.isSelected());
	}
}
