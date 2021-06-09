package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogList_CategoriesPage {
	private WebDriver driver;
	
	private By catagoriesText = By.xpath("//ul[@class='breadcrumb']//li[2]//a[text()='Categories']");
	
	
	public CatalogList_CategoriesPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getCategoreisTitle()
	{
		return driver.getTitle();
	}
	
	
	
}
