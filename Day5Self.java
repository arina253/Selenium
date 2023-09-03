package Seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5Self {

	public static void main(String[] args) {
		
		
        ChromeDriver driver = new ChromeDriver();
		
//		driver.get("http://www.saucedemo.com");
//		
//		//Finding elements
//		
//		WebElement username1 = driver.findElement(By.cssSelector("#user-name"));
//		WebElement password1 = driver.findElement(By.cssSelector("#password"));
//		WebElement login1 = driver.findElement(By.cssSelector("#login-button"));
//		
//		username1.sendKeys("standard_user");
//		password1.sendKeys("secret_sauce");
//		login1.click();
//		
//		WebElement products = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container"));
//              products.getSize();
              
        login ( driver,"standard_user","secret_sauce");
//        login ( driver,"locked_out_user","secret_sauce");
//        login ( driver,"problem_user","secret_sauce");
//        login ( driver,"performance_glitch_user","secret_sauce");
        
        
        
        
              
              
              
              
//              
//              import org.openqa.selenium.By;
//              import org.openqa.selenium.WebDriver;
//              import org.openqa.selenium.WebElement;
//              import org.openqa.selenium.chrome.ChromeDriver;
//
//              public class LoginTest {
//
//                  public static void main(String[] args) {
//                      // Set up WebDriver and open the browser
//                      System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
//                      WebDriver driver = new ChromeDriver();
//
//                      try {
//                          // Navigate to the login page
//                          driver.get("https://example.com/login"); // Replace with your login page URL
//
//                          // Locate and interact with login elements
//                          WebElement usernameField = driver.findElement(By.id("username"));
//                          WebElement passwordField = driver.findElement(By.id("password"));
//                          WebElement loginButton = driver.findElement(By.id("login-button"));
//
//                          // Enter credentials
//                          usernameField.sendKeys("your_username"); // Replace with your username
//                          passwordField.sendKeys("your_password"); // Replace with your password
//
//                          // Submit the login form
//                          loginButton.click();
//
//                          // Add verification steps to check if the login was successful
//                          // For example, check if the user is redirected to a dashboard page or if a logout button is visible
//                          // You may use Selenium's findElement or WebDriverWait here
//                          // Example:
//                          // WebElement dashboardElement = driver.findElement(By.id("dashboard"));
//                          // assertTrue(dashboardElement.isDisplayed());
//
//                      } catch (Exception e) {
//                          // Handle exceptions (e.g., if login fails)
//                          System.out.println("Login failed: " + e.getMessage());
//                      } finally {
//                          // Close the browser
//                          if (driver != null) {
//                              driver.quit();
//                          }
//                      }
//                      
//                      import org.openqa.selenium.By;
//                      import org.openqa.selenium.WebDriver;
//                      import org.openqa.selenium.WebElement;
//                      import org.openqa.selenium.chrome.ChromeDriver;
//
//                      public class LoginTest {
//
//                          public static void main(String[] args) {
//                              // Replace this path with the actual path to your ChromeDriver executable
//                              System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
//
//                              // Create a WebDriver instance (open a Chrome browser)
//                              WebDriver driver = new ChromeDriver();
//
//                              // Example usage of the login function
//                              login(driver, "your_username", "your_password");
//
//                              // Close the browser
//                              driver.quit();
//                          }
//
//                          // Reusable login function
//                          public static void login(WebDriver driver, String username, String password) {
//                              try {
//                                  // Open the login page (replace with the actual URL of the login page)
//                                  driver.get("https://example.com/login");
//
//                                  // Locate the username and password input fields and the login button
//                                  WebElement usernameField = driver.findElement(By.id("username")); // Replace with the actual ID of the username input field
//                                  WebElement passwordField = driver.findElement(By.id("password")); // Replace with the actual ID of the password input field
//                                  WebElement loginButton = driver.findElement(By.id("login-button")); // Replace with the actual ID of the login button
//
//                                  // Enter the username and password into their respective input fields
//                                  usernameField.sendKeys(username);
//                                  passwordField.sendKeys(password);
//
//                                  // Submit the login form by clicking the login button
//                                  loginButton.click();
//
//                                  // Optionally, wait for a specific element to appear on the next page, indicating that the login is successful
//                                  // You may need to adjust the locator and conditions based on your website
//                                  // WebDriverWait wait = new WebDriverWait(driver, 10);
//                                  // wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dashboard"))); // Replace with the actual locator on the next page
//
//                                  // You can perform further actions on the logged-in page here
//
//                              } catch (Exception e) {
//                                  // Handle exceptions (e.g., if login fails)
//                                  System.out.println("Login failed: " + e.getMessage());
//                              }
//                          }
//                      }
//
//                  }
//              }
//
//		

	}
	
	public static void login(ChromeDriver driver,String username,String password) {
       driver.get("http://www.saucedemo.com");
		
		//Finding elements
		
		WebElement username1 = driver.findElement(By.cssSelector("#user-name"));
		WebElement password1 = driver.findElement(By.cssSelector("#password"));
		WebElement login1 = driver.findElement(By.cssSelector("#login-button"));
		
		username1.sendKeys("username");
		password1.sendKeys("password");
		login1.click();
		
		WebElement products = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container"));
		if (products.isDisplayed()){
			System.out.println("Test case pass");
			}
		else {
			System.out.println("Test case fail");
		}
	}
}
