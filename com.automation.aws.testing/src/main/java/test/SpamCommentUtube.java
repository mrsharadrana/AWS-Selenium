package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;

public class SpamCommentUtube  {
public WebDriver driver;
public WebDriver driver1;
WebElement txtBox ;
WebElement commnetBtn ;
List<WebElement> nxtLink ;
	@BeforeTest
	 public void setUp() throws Exception {
		ChromeOptions option = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver","./Library/chromedriver.exe");
		  option.addArguments("user-data-dir=C:\\Users\\Admin\\AppData\\Local\\Google\\Chrome\\User Data");
		 option.addArguments("profile-directory=Profile 1");
		  option.addArguments("disable-infobars");
		  option.addArguments("--start-maximized");
		  driver = new ChromeDriver(option);
		  String baseUrl = "https://automationeveryday.blogspot.com/";
	   

	   
	}
	
	@Test
	public void spamComment() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Actions act = new Actions(driver);
		driver.navigate().to("https://www.youtube.com/watch?v=eO5du5L02TQ");
		
		int count = 2 ;
		do {
			
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(5000);
		txtBox = driver.findElement(By.xpath(".//*[@role='textbox']"));
		act.moveToElement(txtBox);
		act.click();
		act.sendKeys("Whos here when covid-19 Died?? I am writing this when covid-19 hasnt died but. Youll see this comment when covid-19 is over !!.❤ ");
		act.build().perform();
		commnetBtn = driver.findElement(By.xpath(".//*[text()='Comment']"));
		commnetBtn.click();
		Thread.sleep(3000);
		nxtLink = driver.findElements(By.xpath(".//span[@id='video-title']"));
		js.executeScript("window.scrollBy(0,-500);");
		
		nxtLink.get(count).click();
		count++;
		}
		while(count <50);

	}
	
@AfterTest
public void teardown() {
	driver.quit();
}
}
