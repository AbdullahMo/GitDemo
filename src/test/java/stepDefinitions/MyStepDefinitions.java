package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import Cucumber.Automation.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;

public class MyStepDefinitions extends TestBase {
	HomePage homeObject;
	CheckoutPage checkOutObject;
	
	@Given("User is on Greencart landing page")
	public void user_is_on_greencart_landing_page() throws IOException {
		driver = TestBase.initializeDriver();
	}


	@Then("(.+) results are displayed$")
	public void results_are_displayed(String searchWord) {
		Assert.assertTrue(homeObject.isItemDisplayed(searchWord));
	}

	
	
	@When("Added item to cart")
	public void added_item_to_cart() {
		homeObject = new HomePage(driver);
		homeObject.addItemToCart();
	}

	@When("User proceed to Checkout page for purchase")
	public void user_proceed_to_checkout_page_for_purchase() throws InterruptedException {
		homeObject.navigateToCheckOutPage();
		checkOutObject = new CheckoutPage(driver);
		Thread.sleep(2000);
	}

	
	@When("User search for (.+) vegetables$")
	public void User_search_for_vegetables(String vegetable) throws InterruptedException {
		homeObject = new HomePage(driver);
		homeObject.getSearch().sendKeys(vegetable);
		Thread.sleep(1000);
		
	}
	
	@Then("Verify selected (.+) item is displayed in checkout pages$")
	public void Verify_selected_item_is_displayed_in_checkout_page(String vegetable) {
		Assert.assertTrue(checkOutObject.isItemDisplayed(vegetable));
	}

}
