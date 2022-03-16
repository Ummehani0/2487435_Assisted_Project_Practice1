package com.umme.sel.assisted.fourthapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Button {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver(); // start browser session
        
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        
        driver.manage().window().maximize();
        //if radio button for Opera is not selected, click on it
        
        //first locator/address of the radio button and store it in webelement object 
        
        WebElement e1 = driver.findElement(By.xpath("//*[contains(@name,'browser')][3]"));
       
        System.out.println("Is the Button is Displayed? = "+e1.isDisplayed());
        
        System.out.println("Is the Button in enabled? = "+e1.isEnabled()); 
        
        System.out.println("Is the Button is Selected? = "+e1.isSelected());
        
        System.out.println("Click on the Button");
        
        e1.click();
        
        System.out.println("Now Check is the Button is Selected? = "+e1.isSelected());
        

	}

}