package StepDefinition;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.When;

public class HomePageSteps extends BaseClass{

	HomePage homepage;
	@When("User is on homepage and validates home page title")
	public void user_is_on_homepage_and_validates_home_page_title() {
	    
		homepage=new HomePage();
		Assert.assertEquals(homepage.getTitle(),"Cogmento CRM");
		
	}
	@When("validate home page url")
	public void validate_home_page_url() {
	    Assert.assertEquals(homepage.getCurrenturl().contains("cogmento"),true);
	}
	@When("Validate home page logo")
	public void validate_home_page_logo() {
	   Assert.assertEquals(homepage.homePageLogoStatus(),true);
	}
	
}
