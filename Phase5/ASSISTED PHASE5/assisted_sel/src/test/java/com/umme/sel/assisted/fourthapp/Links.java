package com.umme.sel.assisted.fourthapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Links {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.wikipedia.org/");
	        
	        
			
			driver.manage().deleteAllCookies();
			
			driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("Testing");
			
			driver.findElement(By.cssSelector("button[type=submit]")).click();
			
			// click on the link
			
		WebElement li=	driver.findElement(By.linkText("Current events"));
		
		System.out.println("Using Linktext demo.......");
		System.out.println("Is the link is available? = "+li.isDisplayed());
		System.out.println("Is The link is in enabled status? = "+li.isEnabled());
		System.out.println("The link name is = "+li.getText());
		li.click();
	
		
		
		WebElement l2= driver.findElement(By.partialLinkText("Log"));
		System.out.println("Using PartialLinkText demo.......");
		System.out.println("Is the link is available? = "+l2.isDisplayed());
		System.out.println("Is The link is in enabled status? = "+l2.isEnabled());
		System.out.println("The link name is = "+l2.getText());
		l2.click();
		
		driver.close();
	}

}
