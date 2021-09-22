package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sgtestinglogin {
             public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loggin();
	}
   static void launchBrowser()
   {
	   try
	   {
		   System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
		   oBrowser =new ChromeDriver();
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   static void navigate()
   {
	   try
	   {
		   oBrowser.get("http://www.sgtestinginstitute.com/login.php");
		   Thread.sleep(2000);
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   static void loggin()
   {
	   try
	   {
		   oBrowser.findElement(By.id("email")).sendKeys("vinayakcs93@gmail.com");
		   oBrowser.findElement(By.id("password")).sendKeys("9060597631");
		   oBrowser.findElement(By.className("btn-login")).click();
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   
}
