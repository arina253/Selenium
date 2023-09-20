package Seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12ClassTestb {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
	
		
	List <WebElement> radioButtons = driver.findElements(By.cssSelector("input[name ='color']"));
	
	 for (WebElement radioButton:radioButtons) {
		boolean q1 = radioButton.isSelected();
		if (!radioButton.isSelected()){
			radioButton.click();
			 System.out.println("radioButton selected: " + radioButton.isSelected() );
			 
			}
		}
		
	}

}
