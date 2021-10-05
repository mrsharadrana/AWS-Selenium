package test;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.aws.driver.Driver;

public class MockGeoLocation {
static WebDriver driver ;


	public static void main(String[] args) {
 		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Library/chromedriver.exe");
		driver = new ChromeDriver();
		
		HashMap<String ,Object> coordinate = new HashMap<String ,Object>();
		coordinate.put("latitude", 39.913818);
		coordinate.put("longitude", 116.363625);
		coordinate.put("accuracy", 1);
		System.out.println(coordinate);
	((ChromeDriver)driver).executeCdpCommand("Emulation.setGeolocationOverride", coordinate);
		driver.navigate().to("https://oldnavy.gap.com/stores");
	
	
	
	}

}
