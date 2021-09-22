package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleDemo {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		luanchBrowser();
		navigate();
		login();
		minimize();
		//navigateToTask();
		openUsers();
		logout();


	}
	static void luanchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();

		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
		}catch (Exception e)
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
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigateToTask()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[3]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();

			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("C");
			Thread.sleep(3000);
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(2000);


			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[2]/a")).click();

			// Thread.sleep(3000);
			// oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_cancelBtn\"]")).click();
			//  oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[2]/a")).click();

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
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static void openUsers()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[2]/a")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}


	}
	static void logout()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.id("logoutLink")).click();


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
