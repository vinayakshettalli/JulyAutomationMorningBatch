package com.sgtesting.testngloginlogoutscenario;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAssignment2 {
	public static WebDriver oBrowser=null;
	// launchBrowser-->navigate-->login-->createUser-->modifyUser-->deleteUser-->logout -->closeApplication

	@Test(priority=1)
	static void lunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			System.out.println("launch sucessfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
			System.out.println("navigated successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	} 
	@Test(priority=3)
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			System.out.println("login sucessfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	@Test(priority=4)
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
	@Test(priority=5)
	static void createUsers()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("sunny");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("F");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("sunnyf@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("sunny");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("147852369");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("147852369");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			System.out.println("Usercreated succeffully");


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("F");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Fernandes");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("aaa@gamil.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Fernandes");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);
			System.out.println("modified sucessfully");


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert obj=oBrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
			System.out.println("Deleted Sucessfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			System.out.println("logout sucessfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	static void closeBrowser()
	{
		try
		{
			oBrowser.close();
			System.out.println("Browser closed successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


