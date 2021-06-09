package appPages;

import org.openqa.selenium.WebDriver;

public class CatalogList_ProductsPage {
	private WebDriver driver;

	public CatalogList_ProductsPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getproductstitle() {
		return driver.getTitle();
	}
}
