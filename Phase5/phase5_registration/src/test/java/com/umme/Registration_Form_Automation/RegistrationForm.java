package com.umme.Registration_Form_Automation;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class RegistrationForm {
	WebDriver driver;
	@Test
	public void invokeBrowser() {
		 WebDriver driver = new ChromeDriver();
		  
		  //navigate to URL
		  driver.navigate().to("http://automationpractice.com/index.php");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		  
		  driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("ummephase5refor@gmail.com");
		  driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
		  
		  //Select Radio Button
		  String valueOfGender = "2"; //in this case, value is integer, it can be String in most of the cases.
		  
		  List<WebElement> RadioButtonList = driver.findElements(By.name("id_gender"));
		  
		  System.out.println("Total numer of Radio Buttons for gender field is: " +RadioButtonList.size());
		  
		  for (int i = 0; i < RadioButtonList.size(); i++){
		   String gend = RadioButtonList.get(i).getAttribute("value");
		   if (gend.equalsIgnoreCase((valueOfGender))){
		    RadioButtonList.get(i).click();
		    break;
		   }
		   
		  }
		  
		  //Enter customer details
		  driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("FirstName");
		  driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("lastName");
		  driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("Password@123");
		  
		  //Select date of Birth
		  Select sDate = new Select(driver.findElement(By.xpath("//*[@id='days']")));
		  sDate.selectByVisibleText("2  ");
		  
		  Select sMonth = new Select(driver.findElement(By.xpath("//*[@id='months']")));
		  sMonth.selectByVisibleText("May ");
		  
		  Select sYear = new Select(driver.findElement(By.xpath("//*[@id='years']")));
		  sYear.selectByVisibleText("2015  ");
		  
		  //select required check boxes
		  String newsLetterReq = "Yes";
		  if (newsLetterReq.equalsIgnoreCase(newsLetterReq)){
		  driver.findElement(By.xpath(".//*[@id='newsletter']")).click();
		  }
		  
		  String reciveSpclOffer = "Yes";
		  if (reciveSpclOffer.equalsIgnoreCase(reciveSpclOffer)){
		   driver.findElement(By.xpath("//*[@id='optin']")).click();
		   
		   
		  //Fill address related details
		  driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("FnameInAddr");
		  driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("LnameinAddr");
		  driver.findElement(By.xpath("//*[@id='company']")).sendKeys("comp");
		  driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("addr1");
		  driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("addr2");
		  driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Pune");
		  
		  Select sState = new Select(driver.findElement(By.xpath("//*[@id='id_state']")));
		  sState.selectByVisibleText("Alabama");
		  
		  driver.findElement(By.xpath("//*[@id='postcode']")).sendKeys("12345");
		  
		  Select sCountry = new Select(driver.findElement(By.xpath("//*[@id='id_country']")));
		  sCountry.selectByVisibleText("United States");
		  
		  driver.findElement(By.xpath("//*[@id='other']")).sendKeys("any other info");
		  driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("123457876");
		  driver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("868768768768");
		  driver.findElement(By.xpath("//*[@id='alias']")).sendKeys("alias");
		  
		  driver.findElement(By.xpath("//*[@id='submitAccount']")).click();
		   
		   
		  }
	}

}