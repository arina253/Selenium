package Seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5b {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		login(driver, "standard_user", "secret_sauce");
//        login(driver, "locked_out_user", "secret_sauce");
//		login(driver, "problem_user", "secret_sauce");
//		login(driver, "performance_glitch_user", "secret_sauce");

		// Test case 1

		WebElement products = driver
				.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));
		boolean TC1 = products.isDisplayed();
	

		if (TC1) {
			System.out.println("Test case 1 pass");

		} else {
			System.out.println("Test case 1 fail");
		}

        //Test case 2

		login(driver, "locked_out_user", "secret_sauce");

		WebElement products2 = driver.findElement(
				By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3"));
		boolean TC2 = products2.isDisplayed();

		if (TC1) {
			System.out.println("Test case 2 pass");

		} else {
			System.out.println("Test case 2 fail");
		}
		
		//Test case 3
		
		login(driver, "problem_user", "secret_sauce");
		
		WebElement products3 = driver.findElement(
				By.cssSelector("#item_4_img_link > img"));
		boolean TC3 = products3.isDisplayed();

		if (TC3) {
			System.out.println("Test case 3 pass");

		} else {
			System.out.println("Test case 3 fail");
		}
		
		//Test case 4
		
		login(driver, "performance_glitch_user", "secret_sauce");
		
		// it is used to wait before finding element to validate.
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       

        int displayedImageCount = numOfImg(driver);

        if (displayedImageCount > 0) {
            System.out.println("Number of displayed images: " + displayedImageCount);
            System.out.println("Test Case 4 passed.");
        } else {
            System.out.println("No images displayed or Test Case 4 failed.");
        }

	}

	public static void login(ChromeDriver driver, String username, String password) {
		driver.get("http://www.saucedemo.com");

		// Finding elements

		WebElement username1 = driver.findElement(By.cssSelector("#user-name"));
		WebElement password1 = driver.findElement(By.cssSelector("#password"));
		WebElement login1 = driver.findElement(By.cssSelector("#login-button"));

		username1.sendKeys(username);
		password1.sendKeys(password);
		login1.click();

//		List<WebElement> products1 = driver.findElements(By.cssSelector ("#contents_wrapper"));
//		int productCount = products1.size();
//		System.out.println("Number of products: " + productCount);
//

	}

}
