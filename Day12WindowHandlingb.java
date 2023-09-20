package Seleniumtutorials;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12WindowHandlingb {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/");
		
		driver.findElement(By.cssSelector("#contact-us")).click();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		Iterator <String> s = windows.iterator();
		String parentWindowA = s.next();
		System.out.println(parentWindow);
		String childWindow = s.next();
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		
		WebElement ele = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		     if(ele.isDisplayed()) {
		    	 System.out.println("Test case pass");
		     } 
		     
		     if (driver.getTitle().equals("WebDriver | Contact Us")) {
		    	 System.out.println("Test case pass");
		     }
		     
		     driver.switchTo().window(parentWindow);
		    System.out.println(driver.getCurrentUrl());
		    driver.quit();
		    
		     
		     
		     
		
	}

}
