package Seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4TestcaseC {

	public static void main(String[] args) {
		
		//TEST CASE 3)INVALID EMAIL FORMAT
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		
		
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("arina");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("joshi");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("aaahotmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Automated test script");
	    driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
		
		
		boolean b2 = driver.findElement(By.cssSelector("body")).isDisplayed();
		
		if (b2) {
			System.out.println("Test case 3 pass");
		}
		else {
			System.out.println("Test case 3 fail");
		}
		
		

	}

}
