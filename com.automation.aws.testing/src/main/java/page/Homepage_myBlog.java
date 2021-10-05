package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.aws.driver.Driver;

public class Homepage_myBlog extends Driver{
	
	@FindBy(xpath = ".//*[@id='male'][2]")
	WebElement radio_Male;
	
	public Homepage_myBlog(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}
	
public void hradio() {
	try{
		
	
	System.out.println("Title of Page :- "+driver.getTitle());
//	WebElement radio_Male = driver.findElement(By.xpath("//*[@id='male'[2]"));
	boolean value = radio_Male.isEnabled();
	System.out.println("Male Radio Button is Enabled :-"+value);
	if(value !=false) {
		radio_Male.click();
		System.out.println("Radio button is Checked ? :- "+radio_Male.isEnabled());
	}
	else
		
		System.out.println("Please Check Logs");

}

catch(Exception e) {
System.out.println("check Logs");
}	
}
}
