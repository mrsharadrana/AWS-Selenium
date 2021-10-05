package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;

public class SVG_Handling_Covid_Cases extends Driver {

	public void printDayWiseCovidCaes() throws InterruptedException {
		driver.get(
				"https://www.google.com/search?q=covid+19+cases+chart&oq=covid+19+cases+chart&aqs=chrome.0.0i457i512j0i512l9.6090j0j4&sourceid=chrome&ie=UTF-8");
		List<WebElement> graphList = driver
				.findElements(By.xpath("(//*[local-name()='svg' and @class='uch-psvg'])[1]//*[name()='rect']"));
		Actions act = new Actions(driver);
		for (WebElement e : graphList) {
			act.moveToElement(e).perform();
			WebElement text = driver.findElement(By.xpath("//div[@class='ExnoTd']"));
			System.out.println(text.getText() + "\n");

		}
	}
@Test
	public void printDayWiseTestsCases() {
		driver.get(
				"https://www.google.com/search?q=covid+19+cases+chart&oq=covid+19+cases+chart&aqs=chrome.0.0i457i512j0i512l9.6090j0j4&sourceid=chrome&ie=UTF-8");
		WebElement svgChart = driver.findElement(By.xpath("(//*[name()='svg' and @class='uch-psvg'])[2]"));

		int yOffSet = ((svgChart.getSize().getHeight()) / 2) - svgChart.getSize().getHeight();
		int xOffSet = ((svgChart.getSize().getWidth()) / 2) - svgChart.getSize().getWidth();
		int ZeroOffSet = svgChart.getSize().getWidth();
		Actions act = new Actions(driver);
		for (int i = 0; i <= ZeroOffSet; i++) {
			act.moveToElement(svgChart, xOffSet + i, yOffSet).perform();
			String txtData = driver.findElement(By.xpath("//table[@class='swWWne']/tbody")).getText();
			System.out.println(txtData);
		}
	}
}
