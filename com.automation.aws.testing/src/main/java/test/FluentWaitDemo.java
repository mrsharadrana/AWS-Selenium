package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentWaitDemo {
	//Fluent Wait is used when we need to check element with timeout and polling interval and set to ignore specific exception
	public static WebDriver driver ;
	
@BeforeTest
	public void BeforeTest() {
		System.setProperty("webdriver.chrome.driver", "./Library/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
@Test
	public void test() {
		
		driver.get("http://demo.guru99.com/test/link.html");
	//	driver.findElement(By.name("q")).sendKeys("News");
	//	driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		System.out.println("Title is "+driver.getTitle());
		  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(2))
			       .ignoring(NoSuchElementException.class);

			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
				     public WebElement apply(WebDriver driver) {
				       WebElement lnkElement = driver.findElement(By.linkText("click here"));
				       
				       if(lnkElement.isEnabled()) {
				    	   System.out.println("Element is Enabled");
				       }
				       return lnkElement;
				     }
				     
				   });
			   element.click();
		System.out.println("Title is "+driver.getTitle());
		
		
	}
	
		 
@AfterTest
	public void AfterTest() {
	    driver.close();
	}

}
