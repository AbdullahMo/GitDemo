package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	By productName = By.cssSelector("p.product-name");

	public boolean isItemDisplayed(String word) {
		if (driver.findElement(productName).isDisplayed() && driver.findElement(productName).getText().contains(word)) {
			System.out.println(driver.findElement(productName).getText());
			return true;
		}
		return false;
	}
}
