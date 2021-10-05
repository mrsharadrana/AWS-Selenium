package test;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;
import com.automation.aws.utility.CommonElementMethod;

public class CopyPasteFromClipboard extends Driver{
	
	CommonElementMethod elementMethod = new CommonElementMethod();
	Actions act = new Actions(driver);
	@Test
	public void DemoClipboardControl() throws InterruptedException {
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		By iframe = By.id("iframeResult");
		driver.switchTo().frame(elementMethod.getElement(iframe));
		By txtFname = By.id("fname");
		elementMethod.getElement(txtFname).sendKeys("Clipboard");
		act.moveToElement(elementMethod.getElement(txtFname)).doubleClick().build().perform();
	
		Thread.sleep(5000);
	}

}
