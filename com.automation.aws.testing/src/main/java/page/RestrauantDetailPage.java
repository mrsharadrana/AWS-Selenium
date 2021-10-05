package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.aws.driver.Driver;

public class RestrauantDetailPage extends Driver{
 //**********************Xpath***************
	@FindBy(xpath = "(//*[@class='link_hover']/span")
	WebElement txtsort;

	@FindBy(xpath = "(//*[contains(@class,'result-title')])")
	WebElement txtHRR;




//*****************END Xpath********************
	public RestrauantDetailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	public void sorting() {
	try{
		txtsort.click();
	}
	catch(Exception E) {
		
	}
	}
	public void readingHRR() {
		try{
			System.out.println("Highest Rated Restaurant in Benguluru :- "+txtHRR.getText());
		}
		catch(Exception E) {
			
		}
}




























//*******************************END********************************
}
