package com.sgtesting.test;
//launchBrowser-->navigate-->login-->createUser-->deleteUser-->logout -->closeApplication

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static WebDriver oBrowser=null;
	
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		entrysalaryforpersonsachintelndulkar();
		
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			oBrowser= new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("file:///D:/Notes/HTML/WebTableHTML.html");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void entrysalaryforpersonsachintelndulkar()
	{
		try
		{
			oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[2]/td[4]/input")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
}
