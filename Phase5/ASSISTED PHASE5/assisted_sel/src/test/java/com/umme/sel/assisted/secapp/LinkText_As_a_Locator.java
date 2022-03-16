package com.umme.sel.assisted.secapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkText_As_a_Locator {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.wikipedia.org/");
	        
	        
			
			driver.manage().deleteAllCookies();
			
			driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("Testing");
			
			driver.findElement(By.cssSelector("button[type=submit]")).click();
			
			// click on the link
			
			WebElement li=	driver.findElement(By.linkText("Current events"));

			li.isDisplayed();
			li.isEnabled();
			li.click();
			
			Thread.sleep(10000);
			

			driver.findElement(By.partialLinkText("Log")).click();
			
			
			driver.close();
	}

}


