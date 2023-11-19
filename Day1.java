package Seleniumtutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		
		
		//Selenium webdriver jar download and added
		//check version for chrome
		//Download chrome driver and extract
		//Copy Chrome driver path into the testcase
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\OneDrive\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		
//ChromeDriver driver = new ChromeDriver();
WebDriver driver = new ChromeDriver();

		driver.get("https://www.yahoo.com");
		System.out.println("Successful");
		driver.quit();
		
		}
}
		
		
		
		
		
		
		
		
		
//		try {
//		    // Your Selenium code to interact with the web page
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
//			ChromeDriver driver = new ChromeDriver();
//			driver.get("https://www.google.org");
//	 
//			
//		} catch (org.openqa.selenium.WebDriverException e) {
//		    System.out.println("WebDriverException: " + e.getMessage());
//		    // Handle the exception, e.g., refresh the page or navigate to a different URL
//		}
//	}
//}

//Testing means verifying whether the attribute is getting updated, added, retrieved or deleted.
//UI automation testing means verifying whether the element is created,updated,deleted or retrieved.