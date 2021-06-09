package applicationStepDefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import appDriverFactory.DriverFactory;
import appPages.HomePage;
import appPages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private HomePage homePage;
	private String title;

	@Given("user is logged into login page")
	public void user_is_logged_into_login_page(DataTable userdetails) {
		List<Map<String, String>> map = userdetails.asMaps();
		String uName = map.get(0).get("username");
		String pWd = map.get(0).get("password");
		DriverFactory.getDriver().get("https://demo.opencart.com/admin/");
		homePage = loginPage.logintohomepage(uName, pWd);

	}

	@Given("user is on homepage")
	public void user_is_on_homepage() {

		title = homePage.gettitle();
		System.out.println("homepage title is " + title);
	}

	@Then("the title of page should be {string}")
	public void the_title_of_page_should_be(String exptitle) {
		System.out.println(homePage.gettitle());
		Assert.assertTrue(title.equals(exptitle));

	}

	@Then("user gets the menu list")
	public void user_gets_the_menu_list(DataTable menulist) {
		List<String> explist = menulist.asList();
		List<String> actlist = homePage.getmenu();
		Assert.assertEquals(explist, actlist);
//		System.out.println(explist + "****" + actlist);

	}

	@When("user clicks catalog link")
	public void user_clicks_catalog_link() {
		homePage.home_Cataloglist();
	}

	@Then("user gets list")
	public void user_gets_list(DataTable expCataloglist) {
		List<String> expcataloglist = expCataloglist.asList();
		List<String> actcataloglist = homePage.getcataloglist();
		// Assert.assertEquals(expcataloglist, actcataloglist);
	}

	@Then("user clicks Categories")
	public void user_clicks_categories() {

		homePage.cataloglist_categries_click();
		homePage.pageloadtime();
		title = homePage.gettitle();
	}

	@Then("user clicks Products")
	public void user_clicks_products() {

		homePage.cataloglist_product_click();
		homePage.pageloadtime();
		title = homePage.gettitle();
	}
	@When("user clicks logout button")
	public void user_clicks_logout_button() {
	   homePage.logoutbutton();
	}

}
