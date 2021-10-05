package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;
import com.automation.aws.utility.CommonElementMethod;

public class AddAndRemoveElement extends Driver{
//URL:- http://the-internet.herokuapp.com/add_remove_elements/
	CommonElementMethod elementMethod = new CommonElementMethod();
	By btnAddElement = By.xpath("//*[text()='Add Element']");
	By btnDelElement = By.xpath("//*[@id='elements']/button");
	@Test
	public void AddElementAndReturnAddedElement() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
		System.out.println("Title is "+driver.getTitle());
		
		
		
		
		//Add 5 Elements
		for(int i = 0 ; i<=5;i++) {
			elementMethod.getElement(btnAddElement).click();
		}
		//Sleep Thread for 5 Sec
		Thread.sleep(5000);
	
		//Count and Delete All Added Elements
		
		for(WebElement count : 	elementMethod.getElements(btnDelElement)) {
			System.out.println("Count is "+count.getSize());
			count.click();
		}
		//Sleep Thread for 5 Sec
		Thread.sleep(15000);
	}
	
	
	
}
