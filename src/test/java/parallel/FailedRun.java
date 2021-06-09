package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)


@CucumberOptions(features = {
"@target/failedrerun.txt"}, 
glue = {"parallel" }, 
plugin = { "pretty",
		"rerun:target/failedrerun.txt"},
monochrome = true, 
publish = true


		)



public class FailedRun extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
