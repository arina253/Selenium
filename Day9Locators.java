package Seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9Locators {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
				
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
/*<input class="input_error form_input" placeholder="Username" type="text"
data-test="username" id="user-name" name="user-name" autocorrect="off" 
autocapitalize="none" value="">*/
		
		driver.findElement(By.id("user-name"));
		driver.findElement(By.name("password"));
		driver.findElement(By.className("submit-button"));
		driver.findElement(By.tagName("form"));
		
		
		//Css Selector
		
//<input type="submit" class="submit-button btn_action" data-test="login-button" id="login-button" name="login-button" value="Login">
		
		driver.findElement(By.cssSelector("form"));  //By tagName
		driver.findElement(By.cssSelector(".submit-button"));   //By className
		driver.findElement(By.cssSelector("#login-button"));   //By id
		
		//tagName[attribute = "value"];
		
	driver.findElement(By.cssSelector("input[data-test=\"login-button\"]"));
	
	driver.findElement(By.cssSelector("input[class=\"submit-button btn_action\"]"));
	//We have to give complete value if used  with cssSelector.
	//With className locator,we use first one
	
	// x path
	//tagName[@attribute = "value"];
	
	WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
	WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
	WebElement login = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
	
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		//linkText() and partialLinkText()
		
		driver.findElement(By.linkText("Sauce Labs Backpack"));
		driver.findElement(By.partialLinkText("Sauce"));
		System.out.println("hello");
		driver.close();
		driver.quit();
		
		
		
		
		
	}

}




//driver.findElement(By.id("user-name"));
//driver.findElement(By.name("password"));
//driver.findElement(By.className("submit-button"));
//
//// <input type="submit" class="submit-button btn_action" data-test="login-button" id="login-button" name="login-button" value="Login">
//driver.findElement(By.cssSelector("form"));
//driver.findElement(By.cssSelector(".submit-button"));
//driver.findElement(By.cssSelector("#login-button"));
//// tagName[attribute = "value"];
//driver.findElement(By.cssSelector("input[data-test = \"login-button\"]"));
//driver.findElement(By.cssSelector("input[class =\"submit-button btn_action\"]"));
//driver.findElement(By.tagName("form"));
//
//////tagName[@attrbute= "value"]
//driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
//
//WebElement username =driver.findElement(By.cssSelector("#user-name"));
//WebElement password =driver.findElement(By.cssSelector("#password"));
//WebElement login = driver.findElement(By.cssSelector("#login-button"));
//username.sendKeys("standard_user");
//password.sendKeys("secret_sauce");
//login.click();
//
//driver.findElement(By.linkText("Sauce Labs Backpack"));
//driver.findElement(By.partialLinkText("Twit"));
//System.out.println("hello");
//driver.close();
