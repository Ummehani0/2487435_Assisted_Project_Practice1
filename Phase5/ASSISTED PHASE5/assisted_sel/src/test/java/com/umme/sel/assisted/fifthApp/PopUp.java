package com.umme.sel.assisted.fifthApp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PopUp {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		// Switch from main window to Alert box
		
		Alert a = driver.switchTo().alert();
		
		
		String text = a.getText(); // fetch text from alert box
		
		System.out.println(text);
		
		Thread.sleep(5000);
		
		a.accept();  // click on OK button and alert box should close
		

		Thread.sleep(5000);
		
		
		
		  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		  
		  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"w");

		
		driver.close();
	}

}

