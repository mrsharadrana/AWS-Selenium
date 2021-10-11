package test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;
import com.automation.aws.utility.ScreenshotUtility;



public class Capture_Screenshots_TC extends Driver {

	@Test
   public  void testFullScreenshotUsingASHOT() {
		driver.get("https://www.youtube.com/");
		List <WebElement> LocatorEle = driver.findElements(By.xpath("//*[@id='thumbnail']//child:: img"));
		ScreenshotUtility screenshot = new ScreenshotUtility();
//		System.out.println(screenshot.getScreenshotViewScreen(driver));
//		System.out.println(screenshot.getEntireScreenshot(driver));
		screenshot.getListElementScreenshot(driver, LocatorEle);
	}
                
    


    }