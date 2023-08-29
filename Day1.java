package Seleniumtutorials;

import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		
		
		//Selenium webdriver jar download and added
		//check version for chrome
		//Download chrome driver and extract
		// Copy Chrome driver path into the testcase
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		
	}

}
//Testing means verifying whether the attribute is getting updated, added, retrieved or deleted.
//UI automation testing means verifying whether the element is created,updated,deleted or retrieved.