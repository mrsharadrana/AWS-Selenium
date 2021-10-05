package Utilities;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberHooks extends driver{

	
	
	@Before()
	public void printBrowserStatus(Scenario scenarioName) {
	    // Write code here that turns the phrase above into concrete actions		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Starting --- "+scenarioName.getName());
		
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
}
}
