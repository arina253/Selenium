package Seleniumtutorials;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sep24Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/flights/");
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
				
WebElement twoWay = driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.makeFlex.hrtlCenter > ul > li.selected"));
twoWay.isSelected();

		
WebElement fromCity = driver.findElement(By.cssSelector("#fromCity"));
fromCity.sendKeys("Mumbai");

try {
    Thread.sleep(3000);
} catch (InterruptedException e) {
    e.printStackTrace();}


WebElement fromCitySuggestion = driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-0 > div > div.calc60 > p.font14.appendBottom5.blackText"));
fromCitySuggestion.click();


WebElement toCity = driver.findElement(By.cssSelector("#toCity"));
toCity.sendKeys("New Delhi");


try {
    Thread.sleep(3000);
} catch (InterruptedException e) {
    e.printStackTrace();}


WebElement toCitySuggestion = driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-0 > div > div.calc60 > p.font14.appendBottom5.blackText"));
toCitySuggestion.click();


try {
    Thread.sleep(3000);
} catch (InterruptedException e) {
    e.printStackTrace();}



WebElement departure = driver.findElement(By.cssSelector("#departure"));
departure.sendKeys("12 Oct 23");


try {
    Thread.sleep(3000);
} catch (InterruptedException e) {
    e.printStackTrace();}


WebElement back = driver.findElement(By.cssSelector("#return"));
back.sendKeys("10 Nov 23");


try {
    Thread.sleep(3000);
} catch (InterruptedException e) {
    e.printStackTrace();}

WebElement search = driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.fsw > p > a"));
search.click();


	}
}


		
		
	










