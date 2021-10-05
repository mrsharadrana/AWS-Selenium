package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;
import com.automation.aws.utility.CommonElementMethod;

public class HandleUnSelectableDrpdown extends Driver{
	CommonElementMethod elementMethod = new CommonElementMethod();
	
	@Test
	public void HandleKindoDropDown() throws InterruptedException {
		driver.navigate().to("https://demos.telerik.com/kendo-ui/dropdownlist/index");
		System.out.println("Title of page is " +driver.getTitle());
		By spanCategory = By.xpath("//*[@id='categories']//preceding-sibling :: span/span[2]");
		elementMethod.getElement(spanCategory).click();
		By listCategoryOptions = By.xpath("//*[@id='categories_listbox']//li");
		
		for(WebElement option : elementMethod.getElements(listCategoryOptions)) {
			System.out.println("Option Value "+option.getText());
			if(option.getText().equals("Beverages")) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", option);
				break;
			}
		}
	
	Thread.sleep(5000);
	
	}
	
}
