package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
          public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		createUser();
		//modifyUser();
		DeleteUser();
		//logOut();
	///closeApplication();
		//2)launchBrowser-->navigate-->login-->createUser-->modifyUser-->deleteUser-->logout -->closeApplication
	}
  static void launchBrowser()
  {
	  try
	  {
		 
	  System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
	  oBrowser=new ChromeDriver();
	  }catch(Exception e)
	  {
		 e.printStackTrace(); 
	  }
  }
  static void navigate()
  {
	  try
	  {
		  oBrowser.get("http://localhost:82/login.do");
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  static void login()
  {
	  try
	  {
		  oBrowser.findElement(By.id("username")).sendKeys("admin");
		  oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		  oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		  
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  static void minimize()
  {
	  try
	  {
		 
		  oBrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]")).click();
		  
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  static void createUser()
  {
	  try
	  {
		  oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
		  oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
		  oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("v");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Shettalli");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("vinayakshettalli@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("v");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345678");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345678");
		
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(1000);
			
			
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
     static void modifyUser()
     {
    	 try
    	 {
    		oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
    		// oBrowser.findElement(By.xpath("//*[@id=\"ext-comp-1166\"]/div[1]/div[1]/div/div[1]/table/tbody/tr/td[1]/a/span[1]")).click();
    		
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void DeleteUser()
     {
    	 try
    	 {
    		 oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
    		 oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]")).click();
    		 oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
    		 Alert obj=oBrowser.switchTo().alert();
 			String content=obj.getText();
 			System.out.println(content);
 			obj.accept();
    		
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void logOut()
 	{
 		try
 		{
 			oBrowser.findElement(By.id("logoutLink")).click();
 		}catch(Exception e)
 		{
 			e.printStackTrace();
 		}
 	}
 	static void closeApplication()
 	{
 		try
 		{
 			oBrowser.close();
 		}catch(Exception e)
 		{
 			e.printStackTrace();
 		}
 	}
}
