package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownfb {
WebDriver driver;




@BeforeTest
	public	void setup() {
		System.setProperty("webdriver.chrome.driver","./Library/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("https://www.facebook.com");
		 
	}
	
//	@Test
//	public void dropDownFb() throws InterruptedException {
//		System.out.println(driver.getTitle());
//		List<WebElement> month_drp = driver.findElements(By.xpath(".//select[@id='month']/option"));
//		month_drp.get(3).click();
//		Thread.sleep(5000);
		
@Test
public void dropDownFb() {
	List<WebElement> month_drp = driver.findElements(By.xpath(".//select[@id='month']/option"));
	System.out.println(month_drp.get(4).isSelected());
	}
@AfterTest
public void tearDown() {
	driver.close();
}
}
