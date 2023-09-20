package Seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day11Dropdownb {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		
		//To ger C#,Maven & JavaScript in drop down menu
		
		WebElement select = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		WebElement select2 = driver.findElement(By.cssSelector("#dropdowm-menu-2"));
		WebElement select3 = driver.findElement(By.cssSelector("#dropdowm-menu-3"));
		
		SelectDropDown(driver,select,"C#");
		SelectDropDown(driver,select2,"Maven");
		SelectDropDown(driver,select3,"JavaScript");
		
		
	}

	    public static void SelectDropDown(WebDriver driver,WebElement element,String text) {
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(text);
		System.out.println(dropdown.getFirstSelectedOption().getText());
	}
}
