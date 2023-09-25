package Seleniumtutorials;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Day10dFluentWait {

	public static void main(String[] args) {
		
		//FluentWait
		
/*Fluent Wait is a dynamic way of waiting for a certain condition to be met 
  before proceeding with the next steps in a test script.
  The key features of Fluent Wait are:

 1)Polling: Fluent Wait repeatedly checks the condition at specified intervals 
 (polling) until either the condition is met or a timeout is reached.

2) Timeout: It has a maximum time limit (timeout) for how long it will wait for 
the condition to be met.
 
3) Frequency: Fluent Wait allows you to define the polling frequency, which is 
the time interval between consecutive checks of the condition.

4)Customized Conditions: You can define custom conditions based on your specific
 testing needs.For example, you might wait for an element to be visible,
  clickable, or have a specific attribute value.*/
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		driver.findElement(By.cssSelector(".bm-burger-button")).click();
		
		// Define a Fluent Wait with a timeout of 30 seconds and a polling interval of 2 seconds
		
		Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(30))   //total time
				 .pollingEvery(Duration.ofSeconds(2))  //polling time
				 .ignoring(NoSuchElementException.class); //exemption
		
/*the provided code sets up a FluentWait instance to wait for a condition with
 *  the following characteristics:

It waits for a maximum of 30 seconds.
It checks the condition every 2 seconds.
It ignores NoSuchElementException exceptions.*/
		
		// Wait for a specific element to be clickable
		
		
//		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#logout_sidebar_link"))));
		
		// Perform actions on the element
		element.click();
		
		
		}
}

//It's called "fluent" because you can chain different methods together to 
//configure the wait conditions and timeouts in a more readable and flexible way.
