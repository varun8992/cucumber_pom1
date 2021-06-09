package applicationStepDefinations;

import appDriverFactory.DriverFactory;
import appPages.CatalogList_CategoriesPage;
import appPages.CatalogList_ProductsPage;
import appPages.HomePage;
import appPages.LoginPage;
import io.cucumber.java.en.Given;

public class HomePage_Categories_ProductsStep {
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private HomePage homePage=new HomePage(DriverFactory.getDriver()); 
	private CatalogList_ProductsPage productsPage;
	String title;
	
	
	
	@Given("user is on products page")
	public void user_is_on_products_page() throws InterruptedException {
	   productsPage=homePage.cataloglist_Products_link();
	}
}
