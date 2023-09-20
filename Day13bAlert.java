package Seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13bAlert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Test case 4:Click for JS prompt & OK
		
//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
//		String text = driver.switchTo().alert().getText();
//		
//		if (text.equals("I am a JS prompt")) {
//			System.out.println("Test case 4 pass");
//			}
//		else {
//			System.out.println("Test case 4 fail");
//		}
//			
//			driver.switchTo().alert().sendKeys("text");
//			driver.switchTo().alert().accept();
//			
//			WebElement ele = driver.findElement(By.cssSelector("#result"));
//			if (ele.getText().equals("You entered: text")) {
//				System.out.println("Test case 4 for element text pass");
//			}
//			else {
//				System.out.println("Test case 4 for element text fail");
//			}
			
			
/**************************************************************************************************************************************************/
			
			
			//Test case 5 : Click for JS prompt & Cancel
			
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			
			driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
			String text = driver.switchTo().alert().getText();
			
			if (text.equals("I am a JS prompt")) {
				System.out.println("Test case 5 pass");
				}
			else {
				System.out.println("Test case 5 fail");
			}
			
			driver.switchTo().alert().sendKeys("text");
			driver.switchTo().alert().dismiss();
			
			WebElement ele = driver.findElement(By.cssSelector("#result"));
			if (ele.getText().equals("You entered: null")) {
				System.out.println("Test case 5 for element text pass");
			}
			else {
				System.out.println("Test case 5 for element text fail");
			}
			
			driver.close();
			
		    driver.quit();
			
			
			

	}

}
