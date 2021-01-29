package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	
	public static WebDriver initializeDriver() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + 
				"\\src\\main\\java\\Cucumber\\Automation\\global.properties");
		prop.load(fis);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		return driver;
	}
}
