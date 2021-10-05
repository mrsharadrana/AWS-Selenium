package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.aws.driver.Driver;

public class Action_OperationPage extends Driver {
	


	@FindBy(xpath = ".//span[text()='Learning DHTMLX Suite UI']")
	WebElement src;
	@FindBy(xpath = ".//ul[@class='dhx_widget dhx_list ']")
	WebElement dst;

	@FindBy(xpath = ".//div[@id='div1']")
	WebElement div1;
	@FindBy(xpath = ".//div[@class='divtrgt']")
	WebElement div2;
	@FindBy(xpath = ".//img[@class='imgsrc']")
	WebElement imgsrc;
	
	@FindBy(xpath = ".//div[@id='SIvCob']")
	WebElement divgoogle;
	
	
	
	
	/***************Xpath End****************/

	public  Action_OperationPage(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}
	
	public void dragAndDrop() throws InterruptedException {
		
		Actions act = new Actions(driver);
/*	WebElement src	= driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
	WebElement dst = driver.findElement(By.xpath("//ul[@class='dhx_widget dhx_list ']"));
*/	
	boolean dst_value = dst.isEnabled();
	boolean src_value = src.isEnabled();
	
	System.out.println("Src Enabled :- " + src_value);
	System.out.println("Dst Enabled Value :- " + dst_value);
		
		act.dragAndDrop(src, dst).build().perform();
		
		
		
		Thread.sleep(5000);

	

	}
	public void clickHoldDrop() {
		
		Actions act = new Actions(driver);
		act.clickAndHold(src).moveToElement(dst).release().build().perform();
		
		System.out.println("Bye");
	}
	public void imgdragAndDrop() throws InterruptedException {
		Actions act = new Actions(driver);
	System.out.println("Img Enabled "+imgsrc.isEnabled());	
		System.out.println("Dest Enabled "+div2.isEnabled());
		
		act.dragAndDrop(imgsrc, div2).build().perform();
		Thread.sleep(5000);
	}
	
	public void doubleClick() throws Exception {
		Actions act = new Actions(driver);
		act.doubleClick(divgoogle).build().perform();
		Thread.sleep(5000);
	}
}