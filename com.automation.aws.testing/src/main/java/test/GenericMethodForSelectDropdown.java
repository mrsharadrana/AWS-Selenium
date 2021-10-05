package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;
import com.automation.aws.utility.CommonElementMethod;

public class GenericMethodForSelectDropdown extends Driver{

	
	
//	@Test
//	public void dropdown() {
//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
//		By frame = By.id("iframeResult");
//		driver.switchTo().frame(GetElement(frame));
//		By drpdwn = By.id("cars");
//		SelectByText(drpdwn, "Saab");
//	}
//	
//	
		 CommonElementMethod elementMethod = new CommonElementMethod();
		
		@Test
		public void DemoTest() {
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
			By frame = By.id("iframeResult");
			driver.switchTo().frame(elementMethod.getElement(frame));
			By drpdwn = By.id("cars");
			SelectDropDown(drpdwn, "ByText", "Saab");
		}
//	
//	
//	public void SelectByText(By locator, String text) {
//		Select select = new Select(GetElement(locator));
//		select.selectByVisibleText(text);
//		WebElement option = select.getFirstSelectedOption();
//		System.out.println("Selected Text "+option.getText());
//	}
	public void SelectDropDown(By locator, String type, String value) {
		Select select = new Select(elementMethod.getElement(locator));
		WebElement SelectValue;
		switch (type) {
		case "ByIndex":
			select.selectByIndex(Integer.parseInt(value));
			SelectValue = select.getFirstSelectedOption();
			System.out.println("Selected Value "+SelectValue.getText());
			break;
		case "ByText":
			select.selectByVisibleText(value);
			SelectValue = select.getFirstSelectedOption();
			System.out.println("Selected Value "+SelectValue.getText());
			break;
		case "ByValue":
			select.selectByValue(value);
			SelectValue = select.getFirstSelectedOption();
			System.out.println("Selected Value "+SelectValue.getText());
			break;

		default:
			break;
		}
	}
}
