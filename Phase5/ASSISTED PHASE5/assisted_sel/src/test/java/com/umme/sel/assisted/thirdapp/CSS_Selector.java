package com.umme.sel.assisted.thirdapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSS_Selector {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://signup.heroku.com/");
//1. find element using tag and id ==> tagname#idvalue
	        
	        driver.findElement(By.cssSelector("input#first_name")).sendKeys("Afzal");
	        
	        // tag and attribute
	        driver.findElement(By.cssSelector("input[name=last_name]")).sendKeys("Hussain");
	        
	        driver.findElement(By.cssSelector("input#email")).sendKeys("Afzal@gmail.com");
	}

}
/*	CSS Selector have many formats, namely
a.	Tag and ID
	Syntax: “css = tag#id”
	Example: driver.findElement(By.cssSelector(“input#email”));

b.	Tag and Class
	Syntax: “css = tag.class”
	Example: driver.findElement(By.cssSelector(”input.inputtext”));

C.	 Tag and Attribute
	Syntax: “css = tag[attribute=value]”
	Example: driver.findElement(By.cssSelector(“input[name=lastName]”));

c.	Tag, Class and Attribute
	Syntax: “tag.class[attribute=value]”
	Example:
driver. findElement(By.cssSelector(“input.inputtext[tabindex=1]”));

d.	Inner text
	Syntax: “css = tag.contains(“innertext”)”
	Example: driver.findElement(By.cssSelector(font:contains(“Boston”)));
*/
