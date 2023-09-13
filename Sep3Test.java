package Seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sep3Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		// TEST CASE 1
		// Validating the title of the page

//		 String expectedTitle = "#dropdowm-menu-1";
//	     WebElement title = driver.findElement(By.cssSelector("#main-header > h1"));
//		 boolean h1 = title.isDisplayed();
//		 
//		 if(h1) {
//			 System.out.println("Test case 1 pass");
//			 System.out.println(expectedTitle);
//			  }
//		 else {
//			 System.out.println("Test case 1 fail");
//		 }

		// TEST CASE 2
		// Selecting orange radio button and asserting if it is checked.

//		 WebElement orangebutton = driver.findElement(By.cssSelector("#radio-buttons"));
//		 boolean h2 = orangebutton.isEnabled();
//		 
//		 if(h2) {
//			 System.out.println("Test case 2 pass");
//		 }
//		 else {
//			 System.out.println("Test case 2 fail");
//		 }

		// TEST CASE 3
		// From first drop down,select python and assert
		
		
		/******************************************************************************
		 * INCORRECT CODE
		 * // List<WebElement> dropdowns =
		 * driver.findElements(By.cssSelector("#dropdowm-menu-1")); // for (WebElement
		 * dropdown : dropdowns) { // if (!dropdown.isSelected()) { // dropdown.click();
		 * // if(dropdown.includes("orange") { // System.out.println("Test case 3
		 * pass"); // } // } // else { // System.out.println("Test case 3 fail"); // }
		 * 
		 *********************************************************************************/

		
		// CORRECT CODE

		// Find all dropdown elements with the CSS selector
		List<WebElement> dropdowns = driver.findElements(By.cssSelector("#dropdowm-menu-1"));

		for (WebElement dropdown : dropdowns) {
			if (!dropdown.isSelected()) {
				dropdown.click();

				// Check if the dropdown includes "Python"
				if (dropdown.getText().contains("Python")) {
					System.out.println("Test case 3 pass");
				} else {
					System.out.println("Test case 3 fail");
				}
			} else {
				System.out.println("Dropdown is already selected.");
			}
		}

		// TEST CASE 4
		// Validate the heading of the page

//		String expectedHeading = "WebdriverUniversity.com (Dropdown Menu(s), Checkboxe(s), Radio Button(s))";
//
//		WebElement heading = driver.findElement(By.cssSelector("body > nav > div > div"));
//
//		if (heading.isDisplayed()) {
//			System.out.println("Test case 4 pass");
//			System.out.println(expectedHeading);
//		} else {
//			System.out.println("Test case 4 fail");
//		}
//
//		// TEST CASE 5
//		// Selecting all the checkboxes and assert if they are checked
//
//		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//
//		List<WebElement> checkboxes = driver.findElements(By.cssSelector("body > div > div:nth-child(3) > div > h2"));
//		for (WebElement checkbox : checkboxes) {
//			if (!checkbox.isSelected()) {
//				checkbox.click();
//				System.out.println("Test case 5 pass");
//			} else {
//				System.out.println("Test case 5 fail");
//			}
//		}

	}

}
