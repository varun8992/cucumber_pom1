package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	private By username=By.id("input-username");
	private By password=By.id("input-password");
	private By loginButton=By.xpath("//*[@class='btn btn-primary']");
	private By forgotpd=By.linkText("Forgotten Password");
	
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	public void enterUserName(String uName)
	{
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(uName);
	}
	public void enterPassword(String uPasswd)
	{
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(uPasswd);
	}
	public void logButtonClick()
	{
		driver.findElement(loginButton).click();
	}
	public boolean forgotPasswordLink()
	{
		 return driver.findElement(forgotpd).isDisplayed();
	}
	public HomePage logintohomepage(String uname,String pd)
	{
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pd);
		driver.findElement(loginButton).click();
		return new HomePage(driver);
		
	}
	
	
	
	
	

}
