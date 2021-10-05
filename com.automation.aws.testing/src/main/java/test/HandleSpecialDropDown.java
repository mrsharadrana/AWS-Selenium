package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;
import com.automation.aws.utility.CommonElementMethod;

public class HandleSpecialDropDown extends Driver{

	CommonElementMethod ElementMethod = new CommonElementMethod();
	@Test
	public void SpecialDropDown() {
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_js_dropdown_filter");
		By iFrame = By.id("iframeResult");
		By btnDropDown = By.className("dropbtn");
		By optionsDropdown = btnDropDown.cssSelector("a");
		driver.switchTo().frame(ElementMethod.getElement(iFrame));
		ElementMethod.getElement(btnDropDown).click();
		for(WebElement option : ElementMethod.getElements(optionsDropdown)) {
			String optionText = option.getText();
			System.out.println("Available Options "+optionText);
			if(optionText == "Contact") {
				option.click();
			}
		}
		
		
	}
	
}
