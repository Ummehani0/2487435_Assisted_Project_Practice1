package com.umme.sel.assisted.sixth;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	       WebDriver driver = new ChromeDriver();
	       
	       driver.get("https://www.ebay.com.au/");


	       File sc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	       
	 
	       FileUtils.copyFile(sc, new File(".//Screenshot/screen.png"));
	       

	}

}
