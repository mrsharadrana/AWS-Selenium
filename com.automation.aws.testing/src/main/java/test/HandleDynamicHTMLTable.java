package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;

public class HandleDynamicHTMLTable extends Driver{

	@Test
	public void HandleTable() {
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> Rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int totalRow = Rows.size();
		System.out.println("Total Rows are "+totalRow);
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath =	 "]/td[1]";
		for(int i =2; i<=totalRow; i++) {
			String CompanyName = beforeXpath+i+afterXpath;
			WebElement lblCompanyName = driver.findElement(By.xpath(CompanyName));
			System.out.println(lblCompanyName.getText());
			
		}
							
	}
}
