package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features"},
		glue = {"stepDefinitions"}, monochrome = true,tags="@SeleniumTest",
		plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json","junit:target/cukes.xml"}
				 )
public class TestRunner {

}
