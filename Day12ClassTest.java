package Seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12ClassTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		// Task 1: Interaction with checkboxes on a web page and check their selected
		// status.
		 

		// <h2>Checkboxe(s)</h2>
		// <label><input type="checkbox" value="option-1">Option 1</label>

		// Finding all the checkboxes with tagName = "label"
		 List<WebElement> options = driver.findElements(By.tagName("label"));
		// Got 4 results on finding elements.Got false result on console1

		// Finding all the checkboxes with cssSelector & attribute type = "checkbox"

//		List<WebElement> options = driver.findElements(By.cssSelector("input[type = 'checkbox']"));
		// Got 4 results on finding elements.Got result as expected,ie.true on console

		// Iterate through each checkboxes

		for (WebElement option : options) {
			if (!option.isSelected()) {
				option.click();
				System.out.println("Option selected: " + option.isSelected());
			} else {
				System.out.println("Already selected");
			}
		}

		
	}

}
