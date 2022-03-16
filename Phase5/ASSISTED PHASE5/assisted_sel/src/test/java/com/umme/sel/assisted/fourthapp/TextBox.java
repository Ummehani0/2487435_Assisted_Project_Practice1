package com.umme.sel.assisted.fourthapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // start browser session
        
        driver.get("http://www.linkedin.com/");
        
        driver.manage().window().maximize();
        
        //find the element of the textbox
       WebElement text = driver.findElement(By.name("session_key"));
       
      // System.out.println("Is TextBox is displayed? = "+text.isDisplayed());
       System.out.println("******************************************************");
       boolean dis =text.isDisplayed();
       
       if (dis=true)
       {
    	   System.out.println("Text Box Is displayed in the Browser......");
       }
       else {
    	   System.out.println("Text Box is not displayed in the Browser");
       }
       
      // System.out.println("Is TextBox is Enabled? = "+text.isEnabled());
       System.out.println("******************************************************");

       boolean en =text.isEnabled();
       
       if (en=true)
       {
    	   System.out.println("Text Box is Enabled to work on it...... ");
       }
       else
       {
    	   System.out.println("Text Box is not enabled to work");
       }
       
       System.out.println("******************************************************");

       System.out.println("Is there any text in the TextBox? = "+text.getAttribute("value"));
       
       System.out.println("clear The TextBox");
       
       text.clear();
       
       System.out.println("Add Text in the TextBox ");
       
       text.sendKeys("umme@gmail.com");
       
       
       Thread.sleep(5000);
       
       System.out.println("what is written in the TextBox = "+text.getAttribute("value"));
	}

}

