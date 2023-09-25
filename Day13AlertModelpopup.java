package Seleniumtutorials;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day13AlertModelpopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.webdriveruniversity.com/Popup-Alerts/index.html");

		// Task:Interaction with a web page that has a modal popup

		// Clicking the button to trigger the modal

		driver.findElement(By.cssSelector("#button2")).click();

		// Wait for the modal header to be displayed
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement modalHeader = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("#myModal > div > div > div.modal-header > h4")));

		// Check if the modal header is displayed
		if (modalHeader.isDisplayed()) {
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case fail");
		}

		// Close the WebDriver
		driver.quit();

	}

}
