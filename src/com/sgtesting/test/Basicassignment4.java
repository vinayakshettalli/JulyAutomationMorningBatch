package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicassignment4 {
         public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		//launchBrowser-->navigate-->login-->createCustomer-->modifyCustomer-->deleteCustomer-->logout -->closeApplication
		launchBrowser();
		navigate();
		login();
		createCustomer();
		//modfiyCustomer();
		deleteCustomer();
		logout();
		closeApplication();
	}
    static void launchBrowser()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
    		oBrowser=new ChromeDriver();
    		System.out.println("launched sucessfully");
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
    		Thread.sleep(2000);
    		System.out.println("logged in sucessfully");
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    static void createCustomer()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("honda");
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("hond");
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
			System.out.println("Custome createdsuccessfully");		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    static void modfiyCustomer()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(4000);
			System.out.println("xx");
    		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")).clear();
    		
//			//oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[1]")).sendKeys("Telefonica UK Ltd");
    		//oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).clear();
    		//oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("Hond Ltd");
    		//oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]")).click();
			Thread.sleep(2000);
    		System.out.println("xx");
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    static void deleteCustomer()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			System.out.println("deleted successfully");
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("loggedout successfully");
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
			Thread.sleep(2000);
			System.out.println("closed successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
