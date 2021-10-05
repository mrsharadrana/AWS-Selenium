package test;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.automation.aws.driver.Driver;
import com.automation.aws.utility.CommonElementMethod;

public class HandleCalender extends Driver {

	CommonElementMethod elementMethod = new CommonElementMethod();

	/*
	 * public void CalenderDemo() throws InterruptedException { // driver.get(
	 * "https://mdbootstrap.com/snippets/jquery/temp/2793011?action=prism_export");
	 * // System.out.println("Title is "+driver.getTitle()); By txtCalender =
	 * By.id("example"); By iframePreview = By.id("live-preview"); //
	 * driver.switchTo().frame(elementMethod.getElement(iframePreview)); //This
	 * works with Input typw //
	 * elementMethod.getElement(txtCalender).sendKeys("10/01/2020");
	 * 
	 * driver.get("https://www.goibibo.com/");
	 * System.out.println("Title is "+driver.getTitle()); By txtDepart =
	 * By.id("departureCalendar"); elementMethod.getElement(txtDepart).click(); By
	 * lblDay = By.xpath("//div[@class='DayPicker-Body']/div/div"); for(WebElement
	 * day: elementMethod.getElements(lblDay)) {
	 * 
	 * if(day.getText().equals("27")) {
	 * if(day.getAttribute("aria-disabled").equals("false")) {
	 * System.out.println("Selected Day is "+day.getText());
	 * day.findElement(By.cssSelector("div")).click();
	 * System.out.println("Selected Date is "+elementMethod.getElement(txtDepart).
	 * getAttribute("value")); break; } else {
	 * System.out.println("Entered Day is Past"); break; } }
	 * 
	 * 
	 * } Thread.sleep(5000);
	 */

	String strMonth;
	String strYear;
	String strCMonth;
	int intCYear;
	String strCDay;
	String strFrom;
	String strDestination;

	@Test
	public void genericmethodSelectCalender() throws Exception {
		driver.get("https://www.goibibo.com/");
		System.out.println("Title is " + driver.getTitle());

		searchFromDestination("Goa (GOI)", "Delhi (DEL)");
		By caldeparture = By.id("departureCalendar");
		elementMethod.getElement(caldeparture).click();
		Thread.sleep(3000);

		Calendar cal = Calendar.getInstance();
		int intCYear = cal.get(Calendar.YEAR);
		String strCMonth = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
		System.out.println("Year " + intCYear + " Month " + strCMonth);
		selectDepartureDate("November", "2021", "15");
		getCheapestFare();
	}

	public String getMonthYear() {
		By headingDayPicker = By.className("DayPicker-Caption");
		return elementMethod.getElement(headingDayPicker).getText();
	}

	@SuppressWarnings("unlikely-arg-type")
	public void selectDepartureDate(String Month, String Year, String Day) throws Exception {
		strMonth = getMonthYear().split(" ")[0];
		strYear = getMonthYear().split(" ")[1];
		while (!(strMonth.equals(Month) && strYear.equals(Year))) {
			By btnNext = By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']");
			System.out.println("Month is " + strMonth + " Year is " + strYear);
			elementMethod.getElement(btnNext).click();
			strMonth = getMonthYear().split(" ")[0];
			strYear = getMonthYear().split(" ")[1];

		}
		By pickerDay = By.xpath("//div[text()='" + Day + "']");
		elementMethod.getElement(pickerDay).click();
		WebElement btnSearch = driver.findElement(By.id("gi_search_btn"));
		btnSearch.click();

	}

	public void searchFromDestination(String From, String Destination) {
		Actions act = new Actions(driver);
		By inputFrom = By.id("gosuggest_inputSrc");
		act.click(elementMethod.getElement(inputFrom)).perform();
		act.sendKeys(elementMethod.getElement(inputFrom), From).perform();
		act.pause(2000).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		WebElement inputDestination = driver.findElement(By.id("gosuggest_inputDest"));
		act.click(inputDestination).perform();
		act.sendKeys(inputDestination, Destination).perform();
		act.pause(2000).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
	}
	public void getCheapestFare() {
		List<WebElement> details = driver.findElements(By.xpath("//*[@class='srp-card-uistyles__SeoCard-sc-3flq99-4 dFMmJb']"));
		for (WebElement ele : details) {
			System.out.println(ele.getText());	
		}
		
	}

}
