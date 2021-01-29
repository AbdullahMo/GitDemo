package stepDefinitions;

import Cucumber.Automation.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase{
	@Before("@SeleniumTest")
	public void beforeWebvaldiation() {
		System.out.println("Before Web  hook");
	}

	@After("@SeleniumTest")
	public void AfterWebvaldiation() {
		driver.close();
	}
}
