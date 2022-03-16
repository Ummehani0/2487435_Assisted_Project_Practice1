package com.umme.sel.assisted.fourthapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // start browser session
		        
		        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		        
		        driver.manage().window().maximize();
		        
		        // click on RED checkbox
		        
		        WebElement ch= driver.findElement(By.xpath("(//*[contains(@name,'color')])[3]"));
		        
		        
		        System.out.println("Is chek box is Displayed? ="+ch.isDisplayed());
		        
		        System.out.println("Is chek box is Enabled? ="+ch.isEnabled());
		        
		        System.out.println("Is chek box is selected? ="+ch.isSelected());
		        
		        System.out.println("click on the check box.");
		        
		        ch.click();
		        
		        System.out.println("Is chek box is selected now ? ="+ch.isSelected());

		        
		        
		        
		        
		           
			}

		}
