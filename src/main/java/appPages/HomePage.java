package appPages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;

	private By menu = By.xpath("//ul//li[contains(@id,'menu')]");
	private By catalog = By.xpath("//*[@id=\"menu-catalog\"]/a");
	private By catalog_list = By.xpath("//li/a[contains(@href,'route=catalog') or @class='parent collapsed']");
	private By catalog_Categories = By.xpath("//li[1]//*[text()='Categories']");
	private By catalog_Products = By.xpath("//a[normalize-space()='Products']");
	private By logoutbtn = By.xpath("//*[@id=\"header\"]/div/ul/li[2]/a/span");
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void pageloadtime() {
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);

	}

	public String gettitle() {
		return driver.getTitle();

	}

	public List<String> getmenu() {
		List<String> exp = new ArrayList<>();
		List<WebElement> list = driver.findElements(menu);
		for (WebElement lt : list) {
			String e = lt.getText();
			exp.add(e);
			System.out.println(lt.getText());
		}
		return exp;
	}

	public void home_Cataloglist() {
		driver.findElement(catalog).click();

	}

	public List<String> getcataloglist() {
		List<WebElement> catList = driver.findElements(catalog_list);
		List<String> catmenu = new ArrayList<>();
		for (WebElement lts : catList) {
			catmenu.add(lts.toString());
			System.out.println(lts.getText());
		}
		return catmenu;

	}

	public void cataloglist_categries_click() {
		driver.findElement(catalog).click();
		driver.findElement(catalog_Categories).click();
	}

	public CatalogList_CategoriesPage home_Cataloglist_Categories() throws InterruptedException {
		driver.findElement(catalog).click();
		driver.findElement(catalog_Categories).click();
		Thread.sleep(3000);
		return new CatalogList_CategoriesPage(driver);
	}

	public void cataloglist_product_click() {
		driver.findElement(catalog).click();
		driver.findElement(catalog_Products).click();
		
	}
	
	public CatalogList_ProductsPage cataloglist_Products_link() throws InterruptedException
	{
		driver.findElement(catalog).click();
		driver.findElement(catalog_Products).click();
		Thread.sleep(3000);
		return new CatalogList_ProductsPage(driver);
	}
	public void logoutbutton() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",driver.findElement(logoutbtn));
		
	}
	
}
