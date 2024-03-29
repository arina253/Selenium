package Seleniumtutorials;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12WindowHandling {

	public static void main(String[] args) {
		
		//WindowHandling
		
		
		try {
		    // Your Selenium code to interact with the web page
					
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/");
		
		//To get the first window/current handle 
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);     //get the parent window unique string
	
		driver.findElement(By.cssSelector("#contact-us")).click();
		
		Set<String>windows = driver.getWindowHandles();     //to get all handles
		for (String window : windows) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement firstName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastName = driver.findElement(By.cssSelector ("#contact_form > input:nth-child(2)"));
		WebElement email_address = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement comments = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement submit_button = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
		
		firstName.sendKeys("arina");
		lastName.sendKeys("joshi");
		email_address.sendKeys("joshiarina@gmail.com");
		comments.sendKeys("I am learning java");		
		submit_button.click();	
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
		
		} 
		
		catch (org.openqa.selenium.WebDriverException e) {
		    System.out.println("WebDriverException: " + e.getMessage());
		    // Handle the exception, e.g., refresh the page or navigate to a different URL
		}
		
		
		
		
		
		

	}

}
