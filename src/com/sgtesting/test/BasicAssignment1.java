package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAssignment1 {
       public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		//1) launchBrowser-->navigate-->login-->createUser-->deleteUser-->logout -->closeApplication
		launchBrowser();
		navigate();
		login();
		minimize();
		createUser();
		deleteUser();
		logout();
		closeAppilcation();
	}
    static void launchBrowser()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
    		oBrowser= new ChromeDriver();
    		oBrowser.manage().window().maximize();
    		System.out.println("lunched suceffuly");
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
    		System.out.println("navigated sucessfully");
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
    		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
    		Thread.sleep(3000);
    		System.out.println("login sucessfully");
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
    static void  createUser()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
    		oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("jhon");
    		oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("s");
    		oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("jhons@gmail.com");
    		oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("abhi");
    		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456789");
    		oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456789");
   
    		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
    		Thread.sleep(3000);
    		System.out.println("user creadted suceffuly");
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    }
    static void deleteUser()
    {
    	try
    	{
    		
    	oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
    	Thread.sleep(2000);
    	oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
    	Alert obj=oBrowser.switchTo().alert();
    	obj.accept();
    	Thread.sleep(2000);
    	
       System.out.println("deleted sucessfully");
       
    	}catch (Exception e)
    	{
    	e.printStackTrace();
    	}
    }
    static void logout()
    {
    	try
    	{
    		oBrowser.findElement(By.id("logoutLink")).click();
    		Thread.sleep(2000);
    		System.out.println("logout successfully");
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    static void closeAppilcation()
    {
    	try
    	{
    		oBrowser.close();
    		System.out.println("closed sucessfully");
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
