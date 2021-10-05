package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;
import com.automation.aws.utility.CommonElementMethod;

public class CheckTextIsBold extends Driver{

	
	CommonElementMethod elementMethod = new CommonElementMethod();
	@Test
	public void test() {
		driver.get("https://mahantesh-hadimani.blogspot.com/2019/09/how-to-check-text-is-bold-or-not-using.html");
		
		By lbltitle = By.xpath("//*[text()='Complete Code for getting text size using selenium:']");
		
		System.out.println(elementMethod.getElement(lbltitle).getCssValue("font-weight"));
	}
}
