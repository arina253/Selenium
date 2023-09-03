package Seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4TestcaseB {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		
		//TEST CASE2 (HAPPY PATH )-where a user submits the contact form with valid input.
		
		
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("arina");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("joshi");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("aaa@hotmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Automated test script");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
		
		//Assertion 
		
		boolean b1 = driver.findElement(By.cssSelector("h1")).isDisplayed();
		
		if (b1) {
			System.out.println("Test case 2 pass");
		}
		else {
			System.out.println("Test case 2 fail");
		}
		
		
/*************************************************************************************************************/		
	
		//TEST CASE 3)INVALID EMAIL FORMAT
		
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
		
		
/*************************************************************************************************************/
		
		
		//TEST CASE 4)Testing the functionality of RESET button
		
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("arina");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("joshi");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("aaa@hotmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Automated test script");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).click();
		
		String b3 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).getText();
		if (b3.isEmpty()) {
			System.out.println("Test case 4 pass");
		}
		else {
			System.out.println("Test case 4  fail");
		}
		
	}

}
