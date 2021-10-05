package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;

public class HandleShadow_DOM extends Driver{

	@Test
	public void DemoShadowDom() throws InterruptedException {
		driver.get("http://sandbox-sponsors.pointsville.com/");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement txtSignIn= (WebElement)js.executeScript("return document.querySelector(\"amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"amplify-form-section > amplify-auth-fields\").shadowRoot.querySelector(\"div > amplify-username-field\").shadowRoot.querySelector(\"amplify-form-field\").shadowRoot.querySelector(\"#username\")");
		
		
		js.executeScript("arguments[0].setAttribute('value','test@gmail.com')",txtSignIn);
	
		
		
			Thread.sleep(5000);
		
	}
}
