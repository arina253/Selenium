package Seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsHW {

	public static void main(String[] args) {
		
		//LOCATORS/DIFFERENT WAYS TO FIND ELEMENTS IN SELENIUM
		
		/*Locators: strategies or methods used to identify and locate web elements within a web page
		There are 8 different types of locators available in Selenium.
		1)ID Locator
	    2)Name Locator
	    3)Class Name Locator
	    4)TagName Locator
	    5)XPath Locator
	    6)CSS Selector Locator
	    7)Link Text Locator
	    8)Partial Link Text Locator
	    
	     ID,Name and ClassName have attribute locators.Ways to access the element
		 using these properties is same
		 ID is a unique locator,locating elements by their id attribute is one of the most efficient and 
		 preferred methods--- -will raise NoSuchElementException if not found

***************************************************************************************************************/



		// Setting up the chromedriver
	System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		

		// Opening up the yahoo login page in chrome browser
		driver.get("https://login.yahoo.com/?");
		

		
		//1)Find by id- a unique locator

//		WebElement username = driver.findElement(By.id("login-username"));
//		username.sendKeys("test@yahoo.com");
////
//		WebElement nextButton = driver.findElement(By.id("login-signin"));
//		nextButton.click();

		// 2)Find by name

//		driver.findElement(By.name("username")).sendKeys("test@yahoo.com");
//		driver.findElement(By.name("signin")).click();
//
//		//3) Find by className
//		//className is not unique,it can be same for different elements. Not recommended to use
//		 
//		driver.findElement(By.className("phone-no")).sendKeys("test@yahoo.com");
//		
//
//		// 4)Find by tagNam
		List<WebElement> inputList = driver.findElements(By.tagName("input"));
		inputList.get(6).sendKeys("test@yahoo.com"); // 14,match multiple elements.***
//		
//
//		// 5)Find by xpath
//		//Xpath - extended HTML path, address of any specific element.
//
//		// Right click on particular input, go to copy and copy xpath to find address of
//		// particular input element
//
//        ////General Syntax. //Tagname[@AttibuteName = 'value']
//		// "//*[@id=\"login-username\"]"---------//input[@id='login-username']----
//		// start with forward double slash, html tagnamein place of star & id value should be in single quote
//        
//		
//		driver.findElement(By.xpath("//*[@id=\'login-username\']")).sendKeys("test@yahoo.com");
//		driver.findElement(By.xpath("//input[@id=\'login-signin\']")).click();
//		
//
//		//6)Find by CSSSelector
//		//to provide style rules for web pages and can identify one or more web elements.
//
//		driver.findElement(By.cssSelector("#login-username")).sendKeys("test@yahoo.com");
//		driver.findElement(By.cssSelector("#login-signin")).click();
//		
//
//		//7) Find by LinkText- 
//		//only for links,all the links are represented by 'a' tag, angular tag
//		// Specifically for locating hyperlinks (anchor tags) by their exact visible text.
//        
//		driver.findElement(By.linkText("Forgot username?")).click();   //to find the locator of "Forgot username?"link
////		
//
//		// 8)Find by PartialLinkText:
//		// only for links but not recommended
//		// If two,three lines of link available,we pass partial part only using partialLinkText
//
		 driver.findElement(By.partialLinkText("Forgot")).click();//to find a link with the partial text "Forgot."

	}

}
