package test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.http.HttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;
import com.automation.aws.utility.Screenshot;



public class Capture_Screenshots_TC extends Driver{
	
	Screenshot screen = new Screenshot();
	
	@Test
	public void captureFullShot() {
		driver.get("https://www.guru99.com/take-screenshot-selenium-webdriver.html");
		screen.getScreenshot(driver);
	}
	publ
}
