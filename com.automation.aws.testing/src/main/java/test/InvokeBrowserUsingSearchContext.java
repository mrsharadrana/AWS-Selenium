package test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InvokeBrowserUsingSearchContext {

	
	@Test
	public void InvokeFirefox() {
		System.setProperty("webdriver.chrome.driver", "./Library/chromedriver.exe");
		SearchContext driver = new ChromeDriver();
		((WebDriver) driver).manage().window().maximize();
		((WebDriver) driver).get("https://www.youtube.com");
		
		
	}
	
}
