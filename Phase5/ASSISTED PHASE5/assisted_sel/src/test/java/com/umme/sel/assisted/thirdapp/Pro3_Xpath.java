package com.umme.sel.assisted.thirdapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Pro3_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		// Find an element using XPATH locator
		
		// XPATh : Relative XPATH : //tag[@attribute='value']
		 
		
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Testing");
		
		// element 2 to click on button
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
/* There are two types of XPath:
a.	Absolute XPath
	It is direct way to find the element, but the disadvantage of the absolute XPath is that if there are any changes made in the path of the element then that XPath gets failed.
	The key characteristic of XPath is that it begins with the single forward slash (/), which means you can select the element from the root node.
	Syntax for absolute Path: html/body/div[1]/div[1]/div/h4[1]/b
	Example: driver.findElement(By.xpath(“html/body/div[1]/div[1]/div/h4[1]/b”));
	Writing absolute XPath on the elements which are present in the webpage will be very lengthy. To reduce the length, we use relative XPath. 
b.	Relative XPath
	For relative XPath the path starts from the middle of the HTML DOM structure. It starts with the double forward slash (//), which means it can search the element anywhere at the webpage.
	You can start from the middle of the HTML DOM structure and no need to write long XPath.
	Syntax for relativeXPath: //*[@class=’relativexapath’]
	Example: driver.findElement(By.xpath(“//*[@class=’relativexapath’]”))
*/
