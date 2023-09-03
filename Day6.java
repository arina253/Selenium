package Seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6 {

	public static void main(String[] args) {
	
		//Web operations on Web Elements
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\joshi\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		//<h2 name="contactme" class="section_header">CONTACT US</h2>
		
		//getText()
		
		WebElement el = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
            String txt = el.getText();
            System.out.println(txt);
            
            
            //getTagName()
            
           String txt2 =  el.getTagName();
           System.out.println(txt2);
           
           
           //getAttribute()
           
           String txt3 = el.getAttribute("class");
           System.out.println(txt3);
           
           
           //getSize()
           
           Dimension a = el.getSize();  
           System.out.println(a);            //(940, 46)
           
           //to maximize the window to get actual size
           
           driver.manage().window().maximize();
           Dimension aa = el.getSize();  
           System.out.println(aa);            //(1140, 46)
           
           
           Dimension b = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).getSize();
           System.out.println(b);
           
           //font-size,font-family and color
           
           String txt4 = el.getCssValue("font-size");
           String txt5 = el.getCssValue("font-family");
           String txt6 = el.getCssValue("color");
           
           System.out.println(txt4);
           System.out.println(txt5);
           System.out.println(txt6);
           
           
           //getLocation();
           driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
 		   Point P = el.getLocation();
 		   System.out.println(P);
 		   
 		   
 		   //driver.quit();
   		   
   		   
   		
           
           
           

           
           

           
           
           
	}

}
