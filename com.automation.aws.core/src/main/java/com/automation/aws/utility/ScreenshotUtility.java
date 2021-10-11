package com.automation.aws.utility;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotUtility {

	// take screenshot of view page
	public String getScreenshotViewScreen(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		// String
		// path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";
		String path = System.getProperty("user.dir") + "./Screenshot/" + System.currentTimeMillis() + ".png";

		File destination = new File(path);

		try {
			FileUtils.copyFile(src, destination);
			System.out.println("Destination is " + destination);
		} catch (IOException e) {
			System.out.println("Capture Failed " + e.getMessage());
		}

		return path;
	}

	public String getEntireScreenshot(WebDriver driver) {
		String path = System.getProperty("user.dir") + "./Screenshot/" + System.currentTimeMillis() + ".png";
		// take screenshot of the entire page
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		try {
			ImageIO.write(screenshot.getImage(), "PNG", new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return path;
	}

	public String getElementScreenshot(WebDriver driver, WebElement image) {
		String path = System.getProperty("user.dir") + "./Screenshot/" + System.currentTimeMillis() + ".png";
		File src = image.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);

		try {
			FileUtils.copyFile(src, destination);
			System.out.println("Destination is " + destination);
		} catch (IOException e) {
			System.out.println("Capture Failed " + e.getMessage());
		}

		return path;

	}

	public void getListElementScreenshot(WebDriver driver, List<WebElement> locator) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for (WebElement ele : locator) {
			
			String path = System.getProperty("user.dir") + "./Screenshot/" + System.currentTimeMillis() + ".png";
			File src = ele.getScreenshotAs(OutputType.FILE);
			File destination = new File(path);
			

			try {
				FileUtils.copyFile(src, destination);
				System.out.println("Destination is " + destination);
			} catch (IOException e) {
				System.out.println("Capture Failed " + e.getMessage());
			}
		}

	}
}