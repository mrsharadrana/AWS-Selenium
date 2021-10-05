package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;

public class HandleDynamicWebTable extends Driver{

	
	@Test
	public void HandleDynaicWebTableDemo() {
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		
		driver.get("https://www1.nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm?cat=G");
		System.out.println("Title "+driver.getTitle());
		WebElement lnkView = driver.findElement(By.xpath("//a[@id='GsecLt20']"));
		
			System.out.println(lnkView.getText());
			js.executeScript("arguments[0].click();",lnkView);
				
				System.out.println("Title "+driver.getTitle());
	}
}
