package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvaceAssignment2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		//2)launchBrowser-->navigate-->login as admin-->createuser [User1] -->logout ->login as User1-->createUser [User2] -->logout -->login as User2 --> createUser [User3]--> logout-->login as User3 --> logout -->login as User2 -->modify password for User3-->logout --> login as User3 --> logout-->
		//login as User1 -->modify password for User2 --> logout -->login as User2 --> logout-->login as admin--> modify password for User1 --> logout -->login as User1 --> logout --> login as User2 --> Delete User3--> logout --> login as User1 --> delete USer2 --> logout --> login as Admin --> delete User1 --> logout --> closeApplication

		launchBrowser();
		navigate();
		logginAsAdmin();
		minimize();
		createUSer1();
		 logOutAsAdmin();
		 logInAsUser1();
		 popWindow();
		 createUser2();
		 logOutUser1();
		 logInAsUser2();
		 popWindow();
		 createUser3();
		 logOutuser2();
		 

	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			System.out.println("launchesd sucessfully");
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
			oBrowser.manage().window().maximize();
			System.out.println("Navigated sucessfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logginAsAdmin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			System.out.println("Logged in as admin sucessfully");
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
			System.out.println("minimized");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 	
	static void createUSer1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("jhon");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("k");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("jhonk@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("jhonk");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Ab12345");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Ab12345");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			System.out.println("User1 creadted sucessfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logOutAsAdmin()
	{
		try
		{
          oBrowser.findElement(By.id("logoutLink")).click();
          Thread.sleep(2000);
          System.out.println("logged Out as admin sucessfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logInAsUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("jhonk");
			oBrowser.findElement(By.name("pwd")).sendKeys("Ab12345");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			System.out.println("Logged in as user1 sucessfully");
              
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void popWindow()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("abhi");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("m");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("abhim@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("abhi");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Ab123456");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Ab123456");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			System.out.println("User2 creadted sucessfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logOutUser1()
	{
		try
		{
			 oBrowser.findElement(By.id("logoutLink")).click();
	          Thread.sleep(2000);
	          System.out.println("logged Out as user1 sucessfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logInAsUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("abhi");
			oBrowser.findElement(By.name("pwd")).sendKeys("Ab123456");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			System.out.println("Logged in as user2 sucessfully");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("alex");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("k");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("alexk@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("alex");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Ab1234567");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Ab1234567");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			System.out.println("User2 creadted sucessfully");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logOutuser2()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
	          Thread.sleep(2000);
	          System.out.println("logged Out as user2 sucessfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
