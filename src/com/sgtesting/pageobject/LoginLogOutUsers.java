package com.sgtesting.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogOutUsers {
	public static WebDriver oBrowser=null;
	public static PageObject oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		 minimize();
		createUser();
		//loggOut();
		//user1();
		//loggOut();
		//user2();
		//loggOut();
		//user3();
		//loggOut();
		//login();
		 //minimize();
		 modifyUser();
		 
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			oBrowser =new ChromeDriver();
			oPage =new PageObject(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.manage().window().maximize();
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
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogInButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimize()
	{
		try
		{
			oPage.getFlyOutWin().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser()
	{
		try
		{
			oPage.getUserButton().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(2000);
		     oPage.getFirstName().sendKeys("user1");
		     oPage.getlastName().sendKeys("k");
		     oPage.getEmail().sendKeys("user1@gmail.com");
		     oPage.getUsername().sendKeys("user1");
		     oPage.getUserPassWord().sendKeys("12345");
		     oPage.getUserRePassWord().sendKeys("12345");
		     oPage.getCommitBtn().click();
		     Thread.sleep(2000);
		     //user2
		     oPage.getAddUser().click();
				Thread.sleep(2000);
			     oPage.getFirstName().sendKeys("user2");
			     oPage.getlastName().sendKeys("k");
			     oPage.getEmail().sendKeys("user2@gmail.com");
			     oPage.getUsername().sendKeys("user2");
			     oPage.getUserPassWord().sendKeys("123456");
			     oPage.getUserRePassWord().sendKeys("123456");
			     oPage.getCommitBtn().click();
			     Thread.sleep(2000);
			//user3
			     oPage.getAddUser().click();
					Thread.sleep(2000);
				     oPage.getFirstName().sendKeys("user3");
				     oPage.getlastName().sendKeys("k");
				     oPage.getEmail().sendKeys("user3@gmail.com");
				     oPage.getUsername().sendKeys("user3");
				     oPage.getUserPassWord().sendKeys("1234567");
				     oPage.getUserRePassWord().sendKeys("1234567");
				     oPage.getCommitBtn().click();
				     Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void loggOut()
	{
		try
		{
			oPage.getLogOut().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void user1()
	{
		try
		{
			
			oPage.getUserName().sendKeys("user1");
			oPage.getPassword().sendKeys("12345");
			oPage.getLogInButton().click();
			Thread.sleep(2000);
			oPage.getstartExploringText().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void user2()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			oPage.getPassword().sendKeys("123456");
			oPage.getLogInButton().click();
			Thread.sleep(2000);
			oPage.getstartExploringText().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void user3()
	{
		try
		{
			oPage.getUserName().sendKeys("user3");
			oPage.getPassword().sendKeys("1234567");
			oPage.getLogInButton().click();
			Thread.sleep(2000);
			oPage.getstartExploringText().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser()
	{
		try
		{
			
		//	oPage.getUserButton().click();
			//Thread.sleep(2000);
			oPage.getUser1().click();
			Thread.sleep(2000);
			 oPage.getUserPassWord().clear();
		     oPage.getUserPassWord().sendKeys("1234567");
		     Thread.sleep(2000);
			 oPage.getUserRePassWord().clear();
			 Thread.sleep(2000);
		     oPage.getUserRePassWord().sendKeys("1234567");
		     oPage.getCommitBtn().click();
			  
			  //user2
			  oPage.getUser2().click();
				Thread.sleep(2000);
				  oPage.getFirstName().clear();
				  Thread.sleep(2000);
				  oPage.getUserPassWord().clear();
				     oPage.getUserPassWord().sendKeys("12345678");
				     Thread.sleep(2000);
					 oPage.getUserRePassWord().clear();
					 Thread.sleep(2000);
				     oPage.getUserRePassWord().sendKeys("12345678");
				     oPage.getCommitBtn().click();
					  
				 // user3
				  oPage.getUser3().click();
					Thread.sleep(2000);
					 oPage.getUserPassWord().clear();
				     oPage.getUserPassWord().sendKeys("123456789");
				     Thread.sleep(2000);
					 oPage.getUserRePassWord().clear();
					 Thread.sleep(2000);
				     oPage.getUserRePassWord().sendKeys("123456789");
				     oPage.getCommitBtn().click();
					  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
