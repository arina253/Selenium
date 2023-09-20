package Seleniumtutorials;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12WindowHandlingc {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		
driver.findElement(By.id("contact-us")).click();
driver.findElement(By.id("login-portal")).click();
driver.findElement(By.id("button-clicks")).click();
driver.findElement(By.id("to-do-list")).click();
driver.findElement(By.id("page-object-model")).click();

Set <String> windows = driver.getWindowHandles();
System.out.println(windows);

//WebDriver  |  Page Object Model	

	Iterator <String> s = windows.iterator();
	while (s.hasNext()) {
		String windowId = s.next();
		driver.switchTo().window(windowId);
		//if (driver.getTitle().equals("WebDriver | Page Object Model")){
		if (driver.getTitle().equals("WebDriver | Page Object Model")) {
			System.out.println(driver.getTitle());
			System.out.println("Test case pass");
			break;
		}
	}
	}

}

/*Sets the system property to specify the path to the Chrome WebDriver executable.
Initializes a ChromeDriver instance.
Navigates to the "https://www.webdriveruniversity.com/" website.
Retrieves the parent window handle.
Prints the parent window handle.
Performs a series of actions (clicks) on elements on the web page.
Retrieves all window handles after the clicks.
Iterates through the window handles and switches to each window.
Checks the title of each window and breaks the loop when it finds a window with the title "WebDriver | Page Object Model."
Prints the title of the window and "Test case pass" when it finds the matching window.*/

