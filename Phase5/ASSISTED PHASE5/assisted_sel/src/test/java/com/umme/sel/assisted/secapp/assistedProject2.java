package com.umme.sel.assisted.secapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class assistedProject2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		// store the location of the element in an object of type WebElement
	
	// Name locator
	     
	 WebElement e2 =  driver.findElement(By.name("search")) ;  
	 
	 e2.sendKeys("New data for automation");
	     
	     
	}

}


