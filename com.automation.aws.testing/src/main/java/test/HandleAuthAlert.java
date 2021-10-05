package test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;
import com.automation.aws.utility.CommonElementMethod;
public class HandleAuthAlert extends Driver{

	CommonElementMethod elementMethod = new CommonElementMethod();
	@Test
	public void EnterAuth() throws InterruptedException {
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);
		
		
	}
	
}
