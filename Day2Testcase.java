package Seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Testcase {

	public static void main(String[] args) {
		
//Basic Selenium test script in Java to automate a test case for a web application
		
		//1)Arranging the environment
		
		// Set up WebDriver

System.setProperty("webdriver.chrome.driver", "C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();


         //2)Selecting the elements

//Navigate to the website
driver.get("https://www.saucedemo.com");

//Find elements
WebElement username = driver.findElement(By.cssSelector("#user-name"));
WebElement password = driver.findElement(By.cssSelector("#password"));
WebElement login = driver.findElement(By.cssSelector("#login-button"));

      //3) Perform actions ----Dashboard elements

username.sendKeys("standard_user");
password.sendKeys("secret_sauce");
login.click();

     //4) Assertion

WebElement heading = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));

if (heading.isDisplayed()) {
	System.out.println("Test case pass");}
	else {
		System.out.println("Test case fail");
	}
}



}
	
