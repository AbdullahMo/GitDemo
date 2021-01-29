package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	By searchBar = By.xpath("//input[@type='search']");
	By productItem = By.cssSelector("h4.product-name");
	By addToCartBtn = By.xpath("//button[contains(text(),'ADD TO CART')]");
	By cartIcon = By.cssSelector("a.cart-icon");
	By proceedToCheckoutBtn = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	public WebElement getSearch() {
		return driver.findElement(searchBar);
	}
	
	public boolean isItemDisplayed(String word) {
		if(driver.findElement(productItem).isDisplayed() && driver.findElement(productItem).getText().contains(word)) {
			return true;
		}
		return false;
	}
	
	public void addItemToCart() {
		driver.findElement(addToCartBtn).click();
	}
	
	public void navigateToCheckOutPage() throws InterruptedException {
		driver.findElement(cartIcon).click();
		Thread.sleep(2000);
		driver.findElement(proceedToCheckoutBtn).click();
	}
}
