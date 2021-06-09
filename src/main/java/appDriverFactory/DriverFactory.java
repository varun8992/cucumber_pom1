package appDriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;

	public static ThreadLocal<WebDriver> tLDriver = new ThreadLocal<>();

	public WebDriver initalz_Driver(String browser) {

		System.out.println("Given Browser is " + browser);
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tLDriver.set(new ChromeDriver());
		} else if (browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tLDriver.set(new FirefoxDriver());

		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();

	}

	public static WebDriver getDriver() {
		return tLDriver.get();
	}

}
