package Seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day11Dropdowna {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\joshi\\Downloads\\chromedriver-win64\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		// Automated Testing of Dropdown Selections in Selenium WebDriver
		// Dropdown should have select tagName
		// There are multiple ways to select: Select by Value,Select by index
		// and Select by visible text

		WebElement select = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		Select dropdown = new Select(select);
		dropdown.selectByIndex(0);
		dropdown.selectByValue("python");
		dropdown.selectByVisibleText("Python");

//		List<WebElement> opt = dropdown.getOptions();
//		for (int i = 0; i < opt.size(); i++) {
//			dropdown.selectByIndex(i);
//			}

		// if we donot know options for dropdown

		List<WebElement> opt = dropdown.getOptions();
		for (int i = 0; i < opt.size(); i++) {
			System.out.println(opt.get(i).getText());
			if (opt.get(i).getText().startsWith("P")) {
				dropdown.selectByVisibleText(opt.get(i).getText());
				break;
			}
			// driver.close();
		}

	}

}
