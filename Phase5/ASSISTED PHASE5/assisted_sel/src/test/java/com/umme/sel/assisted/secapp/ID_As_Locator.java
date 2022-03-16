package com.umme.sel.assisted.secapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ID_As_Locator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.wikipedia.org/");
        
        driver.manage().window().maximize();
        
        // Check if the element is displayed
        
        boolean dis = driver.findElement(By.id("searchInput")).isDisplayed();
        
        System.out.println("IS the element displayed ?" + dis);
        
        // check if the element is enabled or not
        
        boolean enb = driver.findElement(By.id("searchInput")).isEnabled();
        
        System.out.println("IS the element enabled ?" + enb);
        

		// Enter data in the webelement - input box
		
		if(enb==true)
		{
		driver.findElement(By.id("searchInput")).sendKeys("umme");
		}
		else
		{
			System.out.println("textbox is not enabled");
		}	}

	

}


