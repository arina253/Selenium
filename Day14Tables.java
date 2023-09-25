package Seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14Tables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Visiting the url
		driver.get("https://www.webdriveruniversity.com/Data-Table/index.html");

		// Tables
		//Task: Add all the age in third column of table

		// Get the total number of tables
		// Get the total number of rows
		// Get the total number of columns
		// Iterate rows and columns and print text of element
		// Convert it into integer and add
		
		//*[@id="t01"]
		
		//Getting the total number of tables
		// use "//table" to find all tables on the page.
	    List<WebElement> tbl = driver.findElements(By.xpath("//*[table]"));   //2 tables
//		List<WebElement> tbl = driver.findElements(By.xpath("//table"));------//3 tables
		driver.findElements(By.cssSelector("table"));
		System.out.println(tbl.size());
		
		//Getting the total number of rows
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
		int totalRows = rows.size();
		System.out.println(totalRows);
		
		//Getting the total number of columns
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr[2]/td"));
		int totalColumns = columns.size();
		System.out.println(totalColumns);
		
		//*[@id="t01"]/tbody/tr[2]/td[3]
		
		//Iterating through the age and summing up the ages
		
		int sum = 0;
		
	    for (int i = 2; i <= totalRows ; i++){
//		System.out.println(i);
		String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[3]")).getText();
		System.out.println(text);
		
		//Converting into integer and adding
	     sum = sum + Integer.parseInt(text);
	   }
		
		System.out.println(sum);
		
		
		//Task2: Find the person with Michael in first column
		
		for (int i = 2; i <= totalRows; i++) {
		
		String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[1]")).getText();
		System.out.println(text);
		if (text.equals("Michael")) {
			System.out.println("Test case pass");
			break;
		}
		
		}
		
		driver.quit();
	
	
		
	}

}
