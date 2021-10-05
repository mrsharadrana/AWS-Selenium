package testRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish = true,
		features ="Feature",
		glue = "stepDefination",
		plugin = {"html:target/cucumber-html-report"}
		)
public class TestRunner {

}
