package Seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15Iframe {

	public static void main(String[] args) {

		// Iframe Handling: page inside the page

		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/IFrame/index.html");

		// Finding the element defined in the iframe
//		WebElement ele = driver.findElement(By.cssSelector("div-main-nav > div > ul > li.active > a"));
//		System.out.println(ele.isDisplayed());
		// since element is in the iframe,we cannot find it.

		// Switching to a particular frame and finding the element

//		 WebElement ele = driver.findElement(By.cssSelector("#frame"));
//		 driver.switchTo().frame(ele);
//		 
		// Switch to iframe by index
		driver.switchTo().frame(0); // Only one iframe is there
		
		// Finding the element defined in the iframe
		WebElement ele = driver.findElement(By.cssSelector("div-main-nav > div > ul > li.active > a"));
		System.out.println(ele.isDisplayed());

		// Switching back to main content
		driver.switchTo().defaultContent();

		// Finding element in the main content
		driver.findElement(By.cssSelector("#nav-title")).isDisplayed();

		// Validating the title of the main content
		if (driver.getTitle().equals("WebDriver | IFrame")) {
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case fail");
		}

		// closing the browser
		driver.close();

	}

}


