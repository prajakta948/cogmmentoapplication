package StepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseClass {

	@Given("User on Cogmneto Login Page")
	public void user_on_cogmneto_login_page() {
		initialization();
	}

	@When("User Enter Username and Password and Click on Login")
	public void user_enter_username_and_password_and_click_on_login() {
		LoginPage loginpage = new LoginPage();
		loginpage.loginFunctionality(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterStep
	public static void tearDowm(Scenario scenario) {
		if (scenario.isFailed()) {

			byte[] f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f,"image/png",scenario.getName());
		}
		else {
			byte[] f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f,"image/png",scenario.getName());
		}
	}

}
