package qaautomation.october2021;

import org.testng.annotations.Test;

import october.automation.pages.Tugas3Page;


import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver; 

	public class Tugas3Test extends BaseWebTest
	{ 
	 public static void main(String[] args) 
	 { 

	    WebDriver driver = new ChromeDriver(); 

	    driver.manage().window().maximize(); 

	// Store the URL in a variable of type String. 
	     String URL = "https://yopmail.com/en/wm"; 

	// Call get() method and pass the URL as a parameter. 
	     driver.get(URL); 

	
	// Locate the total number of iframes on the web page. 
	     int iFrameSize = driver.findElements(By.tagName("iframe")).size(); 
	     System.out.println("Total no of iframes: " +iFrameSize); 

	// Locate the first iframe and switch driver to first iframe by index value 0. 
	     driver.switchTo().frame(0); 
	     driver.findElement(By.xpath("//span[normalize-space()='The Test Studio Team at Progress']")).sendKeys("automationtest@yopmail.com"); 
	     driver.findElement(By.xpath("//div[normalize-space()='In case you missed it: R3 2021 is here!'])[1]")).click(); 

	// Now, switch to main web page from iframe by using defaultContent() method. 
	     driver.switchTo().defaultContent(); 

	// Closing first frame. 
	     String getTitleOfMain = driver.getTitle(); 
	     System.out.println("Title of main web page: " +getTitleOfMain); 
	   
	     String mainPageURL = driver.getCurrentUrl(); 
	     System.out.println("URL of main web page: " +mainPageURL); 

	// Switch to second iframe by its index value 1. 
	     driver.switchTo().frame(1); 
	     driver.findElement(By.xpath("//div[@id='wmmailmain'])[1]")).click();

	      driver.quit(); 
	
	 }	
}
