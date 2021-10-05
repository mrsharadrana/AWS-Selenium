package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;

public class Keyboard_Keys extends Driver {

	@Test
	public  void test() {
	driver.navigate().to("https://the-internet.herokuapp.com/key_presses");
	WebElement page = driver.findElement(By.xpath("//input[@id='target']"));
	page.sendKeys(Keys.ENTER);
	Actions act = new Actions(driver);
	act.sendKeys(Keys.DELETE).build().perform();
	}

}
