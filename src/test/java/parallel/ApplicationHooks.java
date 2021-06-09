package parallel;

import java.util.Properties;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import appDriverFactory.DriverFactory;
import configReader.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	private WebDriver driver;
	private DriverFactory driverFactory=new DriverFactory();;
	private ConfigReader config;
	Properties prop;
	private Logger log;


	@Before(order = 0)
	public void browserProperty() {
		log = Logger.getLogger("reatapitesting");
		PropertyConfigurator.configure("log4j.properties");
		log.setLevel(Level.DEBUG);
		config = new ConfigReader();
		prop = config.initalz_Prop();
	}

	@Before(order = 1)
	public void browserLaunch() {
		
		String browserName = prop.getProperty("browser");
		 
		driver = driverFactory.initalz_Driver(browserName);
		
	}

	@After(order = 1)
	public void screenShortTearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshortname = scenario.getName().replaceAll(" ", "_");
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] sourcepath = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcepath, "image/png", screenshortname);
		}
	}

	@After(order = 0)
	public void browserQuit() {
		driver.quit();
	}

}
