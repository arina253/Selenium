package Seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13Alert {

	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Visiting the url
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Test case 1:Click for JS Alert
//		
//		//Finding the element and clicking on it
//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
//		
//        //Switching to alert and get Text
//		String alertString = driver.switchTo().alert().getText();
//		
//		if (alertString.equals("I am a JS Alert")) {
//			System.out.println("Test case 1 pass");
//		}
//		else {
//			System.out.println("Test case 1 fail");
//		}
		
//		driver.switchTo().alert().accept();
//		WebElement ele = driver.findElement(By.id("result"));
//		WebElement ele = driver.findElement(By.cssSelector("#result"));
//		if (ele.getText().equals("You successfully clicked an alert")) {
//			System.out.println("Test case 1a pass");
//		}
//		
		
/********************************************************************************/		
	
		
		//Test case 2:Click for JS Confirm & OK
		
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		
//	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
//	String alertString = driver.switchTo().alert().getText();
//	
//	if(alertString.equals("I am a JS Confirm")) {
//		System.out.println("Test case 2 for text pass");
//		}
//	
//	driver.switchTo().alert().accept();
//	WebElement ele = driver.findElement(By.id("result"));
//	
//	if(ele.getText().equals("You clicked: Ok")){
//		System.out.println("Test case 2 for element text pass");
//		
//	}
			 
/********************************************************************************/		
	
	//Test case 3: Click for JS Confirm & Cancel
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
	String text = driver.switchTo().alert().getText();
	if (text.equals("I am a JS Confirm")) {
		System.out.println("Test case 3 for text pass");
		}
	
	driver.switchTo().alert().dismiss();
	WebElement ele = driver.findElement(By.id("result"));
	if (ele.getText().equals("You clicked: Cancel")) {
		System.out.println("Test case 3 for element text pass");
	}
			
	
	
		
		
	}

}
