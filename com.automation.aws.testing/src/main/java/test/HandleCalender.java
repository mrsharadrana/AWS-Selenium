package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v84.network.model.InterceptionId;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;
import com.automation.aws.utility.CommonElementMethod;

public class HandleCalender extends Driver{

	CommonElementMethod elementMethod = new CommonElementMethod();
	
/*	public void CalenderDemo() throws InterruptedException {
//		driver.get("https://mdbootstrap.com/snippets/jquery/temp/2793011?action=prism_export");
//		System.out.println("Title is "+driver.getTitle());
		By txtCalender = By.id("example");
		By iframePreview = By.id("live-preview");
//		driver.switchTo().frame(elementMethod.getElement(iframePreview));
//This works with Input typw
 // 		elementMethod.getElement(txtCalender).sendKeys("10/01/2020");
 
		driver.get("https://www.goibibo.com/");
		System.out.println("Title is "+driver.getTitle());
		By txtDepart = By.id("departureCalendar");
		elementMethod.getElement(txtDepart).click();
		By lblDay = By.xpath("//div[@class='DayPicker-Body']/div/div");
		for(WebElement day: elementMethod.getElements(lblDay)) {
			
			if(day.getText().equals("27")) {
				 if(day.getAttribute("aria-disabled").equals("false")) {
					 System.out.println("Selected Day is "+day.getText());
					 day.findElement(By.cssSelector("div")).click();
					 System.out.println("Selected Date is "+elementMethod.getElement(txtDepart).getAttribute("value"));
				    break;
			}
				 else {
						System.out.println("Entered Day is Past");
						break;
					}
			}
			
			
		}
		Thread.sleep(5000);
*/
	
	String strMonth;
	String strYear;
	@Test
	public void genericmethodSelectCalender() throws InterruptedException  {
		driver.get("https://www.goibibo.com/");
		System.out.println("Title is "+driver.getTitle());
		By caldeparture = By.id("departureCalendar");
		elementMethod.getElement(caldeparture).click();		
		Thread.sleep(3000);		
		selectDepartureDate("June", "2021", "15");
	}
	
	public String getMonthYear() {
		By headingDayPicker	= By.className("DayPicker-Caption");
		return elementMethod.getElement(headingDayPicker).getText();
	}
	public void selectDepartureDate(String Month, String Year, String Day) {
		strMonth = getMonthYear().split(" ")[0];
		strYear = getMonthYear().split(" ")[1];
		while(!(strMonth.equals(Month) && strYear.equals(Year))) {
			By btnNext = By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']");
			System.out.println("Month is "+strMonth +" Year is "+strYear);		
			elementMethod.getElement(btnNext).click();
			strMonth = getMonthYear().split(" ")[0];
			strYear = getMonthYear().split(" ")[1];
			
		}
		By pickerDay = By.xpath("//div[text()='"+Day+"']");
		elementMethod.getElement(pickerDay).click();
	}
}
