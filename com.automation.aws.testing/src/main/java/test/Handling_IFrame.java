package test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;
import com.automation.aws.utility.Web;

public class Handling_IFrame extends Driver{
@BeforeTest
public void setup() {
	baseUrl = "http://demo.guru99.com/test/guru99home";
}
	@Test(priority = 1)
	public void Handling_youtubeIFrame  () {
	driver.navigate().to("http://demo.guru99.com/test/guru99home");
	//Switch to Frame
	driver.switchTo().frame(0);
	Web web = new Web(driver);
	driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
	
	web.halt();
	}
}
