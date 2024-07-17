package StepDefinition;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactPageSteps extends BaseClass{

	ContactPage contactpage;
	@When("user click on contact link")
	public void user_click_on_contact_link() {
		contactpage=new ContactPage();
		contactpage.contactLinkFunctionality();
	    
	}
	@When("Verify user is on contact page")
	public void verify_user_is_on_contact_page() {
	   Assert.assertEquals(contactpage.getCurrentUrl().contains("contacts"),true);
	}
	
	@Then("Click on create button")
	public void click_on_create_button() {
	   contactpage.createBtnFunctionality();
	}
	
	@Then("Enter firtsname middlename and lastname email and status and social channels  and phone number")
	public void enter_firtsname_middlename_and_lastname_email_and_status_and_social_channels_and_phone_number() {
	   contactpage.contactPageFunctionality("Diksha","Jadhav","Abc","diksha@gmail.com","Active","Facebook");
	}
	@Then("Click on Save button")
	public void click_on_save_button() {
	   contactpage.saveBtnFunctionality();
	}
	
	@Then("User delete created contact")
	public void user_delete_created_contact() {
	
		contactpage.deleteUserFunctionality();
	}
	
}
