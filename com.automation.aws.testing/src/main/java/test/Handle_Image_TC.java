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



public class Handle_Image_TC extends Driver{
	int count = 0 ;
//	@Test(priority = 0)
//	public void imageValidation() {
//		driver.navigate().to("http://newtours.demoaut.com/");
//		System.out.println("Title of Page is :- "+driver.getTitle());
//		WebElement logo_img = driver.findElement(By.xpath("//img[contains(@src,'logo')]"));
//		WebElement login_img = driver.findElement(By.xpath("//input[@value=\"Login\"]"));
//		if(logo_img.isDisplayed())
//		{
//		System.out.println("Attribute of Logo Image :- "+logo_img.getAttribute("alt"));
//		}
//		else
//		{
//			System.out.println("Image not displayed");
//		}
//		if(login_img.isDisplayed())
//		{
//			System.out.println(login_img.isEnabled());
//			login_img.click();
//			System.out.println("Navigated to :- "+driver.getTitle());
//		}
//		
//	}
	@Test
	public void brokenImage() throws IOException {
		driver.get("https://automationeveryday.blogspot.com/2020/06/broken-image-link.html");
		System.out.println("Title of Page is :- "+driver.getTitle());
		List<WebElement> image = driver.findElements(By.xpath("//img[contains(@src,'pic')]"));
		for(WebElement itr : image) {
			System.out.println("Value of Count :- "+count);
			
			String imagesrc = image.get(count).getAttribute("src");
			System.out.println(imagesrc);
			//Using Http Client to Reterive Img Response Code
			URL url = new URL(imagesrc);
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();

			int code = connection.getResponseCode();
		System.out.println(code);
		count++;
		
		}
		
	}
}
