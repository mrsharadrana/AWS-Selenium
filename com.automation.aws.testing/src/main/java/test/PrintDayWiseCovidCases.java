package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;

public class PrintDayWiseCovidCases extends Driver{
@Test
	public void printDayWiseCovidCaes() throws InterruptedException {
		driver.get("https://www.google.com/search?q=covid+19+cases+chart&oq=covid+19+cases+chart&aqs=chrome.0.0i457i512j0i512l9.6090j0j4&sourceid=chrome&ie=UTF-8");
		List<WebElement> graphList = driver.findElements(By.xpath("(//*[local-name()='svg' and @class='uch-psvg'])[1]//*[name()='rect']"));
	Actions act = new Actions(driver);
		for(WebElement e : graphList ) {
		act.moveToElement(e).perform();
		WebElement text = driver.findElement(By.xpath("//div[@class='ExnoTd']"));
		System.out.println(text.getText() + "\n");
			
	}
	}
}
