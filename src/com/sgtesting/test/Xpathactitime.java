package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathactitime {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		// //1) launchBrowser-->navigate-->login-->createUser-->deleteUser-->logout -->closeApplication
		launchBrowser();
		navigate();
		logIn();
		minimize();
		createUser();
		
	}
	static void launchBrowser()
	{
      try
      {
    	  System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
    	  oBrowser=new ChromeDriver();
    	  System.out.println("luanched sucessfully");
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
    	  Thread.sleep(2000);
    	  oBrowser.manage().window().maximize();
    	  System.out.println("navigated sucessfully");
      }catch(Exception e)
      {
    	  e.printStackTrace();
      }
      
	}
	 static void minimize()
		{
			try
			{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
				System.out.println("Minimized FlyOutWindow successfully");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	static void logIn()
	//  tagname and atributes and values
	{
      try
      {
    	  oBrowser.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
    	  oBrowser.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
    	  oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
      }catch(Exception e)
      {
    	  e.printStackTrace();
      }
      
	}
	static void createUser()
	{
		
      try
      {
    	  //xpath
    	  oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
    	  ///fulltag name attribute and values
    	  oBrowser.findElement(By.xpath("//*[@class='buttonText']")).click();
    	  //tag name,attribute,and values[and opreator]
    	  oBrowser.findElement(By.xpath("//input[@placeholder='First Name'and @name='firstName']")).sendKeys("vinayak");
    	  //tagnaem attiribute adn values
    	  oBrowser.findElement(By.xpath("//input[@class='lastNameField inputFieldWithPlaceholder']")).sendKeys("shettalli");
    	  //irrespective any tag and attribute And value(alone)
    	  oBrowser.findElement(By.xpath("//*[@*='email']")).sendKeys("abc@gmail.com");
    	  //
    	  oBrowser.findElement(By.xpath("//*[@*='username1'or@*='Username']")).sendKeys("abhi");
      }catch(Exception e)
      {
    	  e.printStackTrace();
      }
      
	}
	static void deleteUser()
	{
      try
      {
    	  
      }catch(Exception e)
      {
    	  e.printStackTrace();
      }
      
	}
	static void logOut()
	{
      try
      {
    	  
      }catch(Exception e)
      {
    	  e.printStackTrace();
      }
      
	}
	static void closeBrowser()
	{
      try
      {
    	  
      }catch(Exception e)
      {
    	  e.printStackTrace();
      }
      
	}


}
