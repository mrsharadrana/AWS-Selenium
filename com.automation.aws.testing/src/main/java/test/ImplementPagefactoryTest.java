package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;

import page.ImplementPageFactoryPage;

public class ImplementPagefactoryTest extends Driver {

	@Test
	public void Test() {

		ImplementPageFactoryPage page = PageFactory.initElements(driver, ImplementPageFactoryPage.class);
		page.NavigateToPage();

		page.SelectMaleRadioBtn();

	}
}