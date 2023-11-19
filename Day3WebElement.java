package Seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3WebElement {

	public static void main(String[] args) {

		// WebElement is a datatype and has properties and methods.

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// WebElement Methods

		// Program 1
		// ("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

		// Finding elements
		
		//.get();
		//.findElement();
		
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		WebElement firstName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastName = driver.findElement(By.cssSelector ("#contact_form > input:nth-child(2)"));
		WebElement email_address = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement comments = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement reset_button = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
		
		
		//.sendKeys();
		//.click();
		
		firstName.sendKeys("arina");
		lastName.sendKeys("joshi");
		email_address.sendKeys("joshiarina@gmail.com");
		comments.sendKeys("I am learning java");		
		reset_button.click();		
		
		//.clear();
		
		firstName.clear();
		
		//.gettext();
		
		//<h2 name="contactme" class="section_header">CONTACT US</h2>
		
		WebElement heading = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		String text = heading.getText();
		System.out.println(text);
		
		
		//Program 2
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html"); 
		   
		//.isDisplayed()
		// q1----------true
		
		WebElement header = driver.findElement(By.cssSelector("#main-header > h1"));
		boolean q1 = header.isDisplayed();
		System.out.println(q1);
		
		
		//isEnabled()
       //q2----------true
		
		WebElement enabled_radioB = driver.findElement(By.cssSelector("body > div > div:nth-child(4) > div > div"));
		boolean q2 = enabled_radioB.isEnabled();
		System.out.println(q2);
		
		
		//q3----------true
		
		WebElement disabled_radioB = driver.findElement(By.cssSelector("#radio-buttons"));
		boolean q3 = disabled_radioB.isEnabled();
		System.out.println(q3);
		
		
		//.isSelected();
		//false
		
		WebElement isSelected_radioB = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(1)"));
		boolean q4 = isSelected_radioB.isSelected();
		System.out.println(q4);
		
		//false
		
		WebElement isSelected_radiobutton = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled"));
		boolean q5 = isSelected_radiobutton.isSelected();
		System.out.println(q5);
		
	
	
}
}	
		
		

	// Webelement vs Webdriver
		 

		//isSelected_radioB.findElement(null)
		//isSelected_radioB.findElements(null)
		//isSelected_radioB.isDisplayed();
		//isSelected_radioB.isEnabled()
		//isSelected_radioB.isSelected();
		//isSelected_radioB.getText()
		//isSelected_radioB.getAttribute("id")
		//isSelected_radioB.getTagName();
		//isSelected_radioB.getSize()
		//isSelected_radioB.clear()
		//isSelected_radioB.getLocation();
		//isSelected_radioB.click()
		//isSelected_radioB.submit(), it will only work on submit button of form
		//isSelected_radioB.sendKeys(args)  // to type something on inputtext of element
		//isSelected_radioB.getCssValue("font-weight")
		 
       

		
		
		

	

