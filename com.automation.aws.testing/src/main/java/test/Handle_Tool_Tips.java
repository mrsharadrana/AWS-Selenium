package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;

public class Handle_Tool_Tips extends Driver{

	@Test
	public void HandleToolTips()  {
		driver.get("https://www.facebook.com/");
		WebElement lblLogin = driver.findElement(By.linkText("Log In"));
		String tooltipTitle = lblLogin.getAttribute("title");
		System.out.println("Tool Tip is "+tooltipTitle);
	}
}
