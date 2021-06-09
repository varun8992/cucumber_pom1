package applicationStepDefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import appDriverFactory.DriverFactory;
import appPages.CatalogList_CategoriesPage;
import appPages.HomePage;
import appPages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage_Categories_CatalogStep {
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private HomePage homePage=new HomePage(DriverFactory.getDriver()); 
	private CatalogList_CategoriesPage categoriesPage;
	String title;
	


	@Then("user moves to categories page")
	public void user_moves_to_categories_page() throws InterruptedException {
		categoriesPage=homePage.home_Cataloglist_Categories();
	}
	@Given("user is on Categories page")
	public void user_is_on_categories_page() {
		title=categoriesPage.getCategoreisTitle();
		System.out.println("user is on: "+title+" page");
	}
	
	
	@Then("title of Categories page should be {string}")
	public void title_of_categories_page_should_be(String expTitle) {
	   Assert.assertTrue(title.equals(expTitle));
	}
}
