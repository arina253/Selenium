package Seleniumtutorials;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day16PropertyFile {

	public static void main(String[] args) {
		
		//Reading the property file
		
		
        //Creating object of properties
		Properties prop = new Properties();
		//Path of file
		String path = "C:\\Users\\joshi\\eclipse-workspace\\seleniumtutorials\\src\\Seleniumtutorials\\config.properties";

		try {
			// Creating object of FileInputStream for reading the property file and  pass path
			FileInputStream fileInput = new FileInputStream(path);

			prop.load(fileInput);
			String url = prop.getProperty("baseUrl");
			System.out.println(url);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			String un = prop.getProperty("username");
			String pw = prop.getProperty("password");
			
			//Writing to the file
			prop.put("city", "kathmandu");
			FileOutputStream outputstream = new FileOutputStream(path);
			
			//Storing the properties file
			prop.store(outputstream, "This is a sample properties file");
			
			
			if (browser.equals("chrome")) {
				// code to set up browser
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get(url);

				driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
				driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
				;
				driver.findElement(By.cssSelector("#login-button")).click();

				if (driver.getCurrentUrl().contains("inventory")) {
					System.out.println("Test case pass");
				} else {
					System.out.println("Test case fail");
				}

			} else if (browser.equals("firefox")) {
				// code to firefox

			} else if (browser.equals("edge")) {
				// code to edge

			}
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
