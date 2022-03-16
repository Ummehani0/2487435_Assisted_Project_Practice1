package com.umme.sel.assisted.firstapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssistedPraPro1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://signup.heroku.com/");
	        
	        Thread.sleep(10000);
	        
	        driver.close();
	}

}
