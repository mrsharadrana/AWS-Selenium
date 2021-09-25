package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.amazonProductSearchPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonProductSearchSteps {
	
	

	amazonProductSearchPage searchPage = new amazonProductSearchPage();

		

	@Given("^user is on Amazon Search Page$")
	public void user_is_on_Amazon_Search_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		searchPage.NavigateToAmazon();
	}

	@When("^user search for \"([^\"]*)\"$")
	public void user_search_for(String product) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		searchPage.SearchProduct(product);
	    
	}

	@Then("^list of phone displays$")
	public void list_of_phone_displays() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    searchPage.GetTitle();
	}

	@When("User Search for product")
	public void user_search_for_product(DataTable Table) {
	  List<String> userList = Table.asList(String.class);
	  for(String e : userList) {
		  System.out.println(e);
	  }
	  
	}

	

}
