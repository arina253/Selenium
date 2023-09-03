package Seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4TestcaseA {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

		// Test case 1: Finding heading is available or not, i.e. "CONTACT US"

		// <h2 name="contactme" class="section_header">CONTACT US</h2>------WebElement
		// Whatever available in webpage/DOM is webelement.Webpage opens in webbrowser.
		// HTML page in javascript is document
		// Two ways to find webelement: X-path and cssSelector
		// Four basic ways to find element by cssSelector:1)tagName 2)class 3) id
		// 4)anyAttribute
		// when dealing with element,make sure the element is unique.

		// tagName
		// Finding the <h2> element with tagName/to find the "CONTACT US" element
		// In DOM: Press ctrlF & type tagName that is highlighted

		WebElement headTwo = driver.findElement(By.cssSelector("h2"));
		String q1 = headTwo.getText();
		System.out.println(q1); // CONTACT US

		// class
		// Finding the <h2> element with class "section_header"to find the "CONTACT US"
		// element
		// In DOM: Press CtrlF & type .section_header (value of that attribute)

		WebElement headTwob = driver.findElement(By.cssSelector(".section_header"));
		String q2 = headTwob.getText();
		System.out.println(q2); // CONTACT US

		// id - to give unique property to element
		// Finding element with id to validate that "CONTACT US" is displayed
		// In DOM: Press CtrlF &type #contact_form

		// <form action="contact_us.php" method="post" id="contact_form">

		WebElement headTwoc = driver.findElement(By.cssSelector("#contact_form"));
		boolean pre = headTwoc.isDisplayed();
		System.out.println(pre); // Output should be "true" if it's displayed

		// anyAttribute
		// tagName[attribute = "value"]
		// Finding the <h2> element with attribute name="contactme"

		WebElement headThreeD = driver.findElement(By.cssSelector("h2[name='contactme']"));
		String q3 = headThreeD.getText();
		System.out.println(q3); // Output should be "CONTACT US"

		// Performing a test

		if (q3.equals("CONTACT US")) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case failed");
		}

	}

}
