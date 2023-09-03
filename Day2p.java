package Seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2p {

	public static void main(String[] args) {
		
		//Test case 1
		
		//Arrangement
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		
//		//Action
//		
//		WebElement username = driver.findElement(By.cssSelector("#user-name"));
//		WebElement password = driver.findElement(By.cssSelector("#password"));
//		WebElement login = driver.findElement(By.cssSelector("#login-button"));
//		
//		username.sendKeys("standard_user");
//		password.sendKeys("secret_sauce");
//		login.click();
		
		//Assertion
		
//		WebElement header = driver.findElement(By.cssSelector("#header_container > div.primary_header > div.header_label > div"));
//		
//		if (header.isDisplayed()) {
//			System.out.println("Test case 1 pass");
//		}
//		else {
//			System.out.println("Test case 1 fail");
//		}
		
		//Test case 2
		
		driver.get("https://www.saucedemo.com/");
		
		//Action
		
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));
				
				username.sendKeys("standard_user");
				password.sendKeys("secret");
				login.click();
				
				//Assertion
				
WebElement error = driver.findElement(By.cssSelector("h3[data-test=\"error\"]"));
String expectedText = error.getText();
System.out.println(expectedText);
		
if (expectedText.contains("Epic sadface: Username and password do not match any user in this service")) {
	System.out.println("Test case 2 pass");
}

else {
	System.out.println("Test case 2 fail");
}
	

driver.close();
		

	}

}
