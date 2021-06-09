package applicationRunner;

import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)


@CucumberOptions(features = {
".\\src\\test\\resources\\applicationFeatures\\Loginpage.feature"}, 
glue = {"applicationStepDefinations","appHooks" }, 
plugin = { "pretty",
		"timeline:test-output-thread/",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"json:target/json-report/cucumber.js"},
monochrome = true, 
publish = true,
tags="@smoke"

		)

public class ApplicationRunner {

}
