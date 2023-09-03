package Seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7WebDriverMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");

		// Test case 1
		// getTitle()

		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test case 1 pass");
		} else {
			System.out.println("Test case 1 fail");
		}

		// Test case 2
		// getCurrentUrl()

//		driver.get("https://www.saucedemo.com/");
//		
//		String expectedUrl = "inventory";
//		
//		WebElement username = driver.findElement(By.cssSelector("#user-name"));
//		WebElement password = driver.findElement(By.cssSelector("#password"));
//		WebElement login = driver.findElement(By.cssSelector("#login-button"));
//		
//		username.sendKeys("standard_user");
//		password.sendKeys("secret_sauce");
//		login.click();
//		
//		String actualUrl = driver.getCurrentUrl();  //https://www.saucedemo.com/inventory.html
//		if (actualUrl.contains(expectedUrl)) {
//			System.out.println("Test case 2 pass");
//		}
//		else {
//			System.out.println("Test case 2 fail");
//		}
//		

		// Test case 3

		// findElement - Returns one element
		// findElements-Returns list of elements

//		driver.get("https://www.saucedemo.com/");
//		WebElement username = driver.findElement(By.cssSelector("#user-name"));
//		WebElement password = driver.findElement(By.cssSelector("#password"));
//		WebElement login = driver.findElement(By.cssSelector("#login-button"));
//		username.sendKeys("standard_user");
//		password.sendKeys("secret_sauce");
//		login.click();
//
//		WebElement logo = driver.findElement(By.cssSelector(".app_logo"));
//		if (logo.isDisplayed()) {
//			System.out.println("Test case 3 pass");
//		} else {
//			System.out.println("Test case 3 fail");
//		}
		
		

         //Test case 4
		//Check whether particular product is available or not 

		String expectedProduct = "Sauce Labs Bolt T-Shirt";
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));

		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();

		List<WebElement> items = driver.findElements(By.cssSelector(".inventory_item_name"));
		boolean productFound = false;

		for (int i = 0; i < items.size(); i++) {
			// System.out.println(items.get(i).getText());
			if (items.get(i).getText().equals(expectedProduct)) {
				productFound = true;
				break;
			}
		}
		if (productFound) {
			System.out.println("Product available");
			System.out.println("Test case 4 pass");
		} else {
			System.out.println("Product not available");
			System.out.println("Test case 4 fail");
		}

	}
}
