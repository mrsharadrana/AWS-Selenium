package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;


public class SVG_Handling_TC extends Driver{

	
	public void svgHandle() {
		driver.navigate().to("https://www.w3schools.com/graphics/svg_inhtml.asp");
		System.out.println(driver.getTitle());
		List<WebElement> circle = driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='circle']"));
		System.out.println(circle.get(0).getAttribute("fill"));
	}
	@Test
	public void handle2DSvg() {
		driver.navigate().to("http://debeissat.nicolas.free.fr/svg3d.php");
		System.out.println(driver.getTitle());
		driver.switchTo().frame("svg_result");
		while(true) {
			List<WebElement> lstCordinate = driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='path']"));
			
			for(WebElement e : lstCordinate) {
				System.out.println(e.getAttribute("d"));
			}
		}
		
	}
}