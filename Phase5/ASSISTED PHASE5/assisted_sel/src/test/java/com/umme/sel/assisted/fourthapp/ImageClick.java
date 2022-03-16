package com.umme.sel.assisted.fourthapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImageClick {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver(); // start browser session
        
        driver.get("http://demo.automationtesting.in/");
        
        driver.manage().window().maximize();
        
        
        //clicking on image 
      WebElement im=  driver.findElement(By.id("enterimg"));
        
      System.out.println("Is image is displayed? = "+im.isDisplayed());
      System.out.println("Is image is Enabled? = "+im.isEnabled());
      System.out.println("Is image is selected? = "+im.isSelected());
      im.click();
     

	}

}
