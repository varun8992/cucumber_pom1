package parallel;

import org.junit.Assert;

import appDriverFactory.DriverFactory;
import appPages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep {
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://demo.opencart.com/admin/");

	}

	@When("user gets title of the page")
	public void user_gets_title_of_the_page() {
		System.out.println(loginpage.getPageTitle());
	}

	@Then("title of page should be {string}")
	public void title_of_page_should_be(String expstring) {
		String actualtitle = loginpage.getPageTitle();
		Assert.assertEquals(actualtitle, expstring);
	}

	@Then("forgot password link should be displayed")
	public void forgot_password_link_should_be_displayed() {

		boolean b = loginpage.forgotPasswordLink();
		Assert.assertEquals(b, false);
	}

	@When("user enter username {string}")
	public void user_enter_username(String usname) {
		loginpage.enterUserName(usname);

	}

	@When("user enter password {string}")
	public void user_enter_password(String password) {
		loginpage.enterPassword(password);

	}

	@When("user clicks button")
	public void user_clicks_button() {
		loginpage.logButtonClick();

	}
	

	

	
}
