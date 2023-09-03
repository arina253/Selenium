package Seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6HW {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// get(String url): Navigates the browser to a specified URL
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

		// navigate().to(String url): A more flexible way to navigate to a URL, similar
		// to get()
		driver.navigate().to("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

		// • navigate().back(): Navigates to the previous page in the browser history.
		driver.navigate().back();

		// • navigate().forward(): Navigates to the next page in the browser history.
		driver.navigate().forward();

		// navigate().refresh(): Refreshes the current page
		driver.navigate().refresh();

		// getCurrentUrl(): to retrieve the URL of the webpage the user is currently
		// accessing

		String s1 = driver.getCurrentUrl();
		System.out.println(s1);

		// getTitle() : to retrieve the title of the webpage the user is currently
		// working on

		String s2 = driver.getTitle();
		System.out.println(s2);

		// getPageSource() : to retrieve the page source of the webpage the user is
		// currently accessing

		String s3 = driver.getPageSource();
		System.out.println(s3);

		// <h2 name="contactme" class="section_header">CONTACT US</h2>

		// findElement(By by): Locates a single web element based on a specified
		// selector (e.g., ID, name, XPath,css).

		WebElement s4 = driver.findElement(By.cssSelector("h2"));
		String a = s4.getText();
		System.out.println(a);

		// findElements(By by): Locates multiple web elements based on the specified
		// selector

		List<WebElement> elements = driver.findElements(By.cssSelector("h2"));
		System.out.println("Number of elements: " + elements.size());

		// close(): Closes the current browser window

		driver.close();

		// quit() : Quits the WebDriver session, closing all windows.

		driver.quit();

	}
}
