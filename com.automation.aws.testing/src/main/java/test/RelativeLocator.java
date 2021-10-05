package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.automation.aws.driver.Driver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class RelativeLocator extends Driver{
	@Test
	public void RelativeLocatorDemo() {
		
		driver.get("https://www.google.com/");
		System.out.println("Title of Page "+driver.getTitle());
		WebElement txtSearch = driver.findElement(By.name("q"));
		txtSearch.sendKeys("Hello");
		List<WebElement> btnSearch = driver.findElements(withTagName("input").below(txtSearch));
		for(WebElement ele : btnSearch) {
			System.out.println(ele.getText());
			System.out.println(ele.getSize());
		}
			
		}
	}

