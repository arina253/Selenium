package Seleniumtutorials;



	
		
		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import java.util.List;

		public class DropdownTestchat {
		    public static void main(String[] args) {
		        // Set up the WebDriver (you need to download and set up WebDriver for Chrome)
		        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the web page
		        driver.get("URL_of_the_page");

		        // Find all dropdown elements with the CSS selector
		        List<WebElement> dropdowns = driver.findElements(By.cssSelector("#dropdowm-menu-1"));

		        for (WebElement dropdown : dropdowns) {
		            if (!dropdown.isSelected()) {
		                dropdown.click();
		                
		                // Check if the dropdown includes "orange"
		                if (dropdown.getText().contains("orange")) {
		                    System.out.println("Test case 3 pass");
		                } else {
		                    System.out.println("Test case 3 fail");
		                }
		            } else {
		                System.out.println("Dropdown is already selected.");
		            }
		        }


	}

}
