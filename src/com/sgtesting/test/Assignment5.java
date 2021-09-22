package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
          public static WebDriver oBrowser=null;
          
	public static void main(String[] args) {
		//launchBrowser-->navigate-->login-->createCustomer-->CreateProject-->DeleteProject-->deleteCustomer-->logout -->closeApplication
		 launchBrowser();
		 navigate();
		 login();
		 minimize();
		 createCustomer();
		 createProject();
		// deleteProject();
		// deleteCustomer();
		// logOut();
		// closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
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
    		 oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void createCustomer()
     {
    	 try
    	 {
    		 oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")).click();
    		 Thread.sleep(1000);
    		 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")).click();
    		 oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
    		 oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("zzzzzz");
    		 Thread.sleep(1000);
    		 oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
    		 oBrowser.findElement(By.id("customerLightBoxCloseButton")).click();
    		
    		 
    		 
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void createProject()
     {
    	 try
    	 {
    		 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
    		 oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
    		 Thread.sleep(1000);
    		 oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("java");
    	      oBrowser.findElement(By.id("ext-gen32")).click();
    		
    		 oBrowser.findElement(By.xpath("//*[@id=\"ext-gen117\"]")).click();
    		 oBrowser.findElement(By.id("projectPopup_commitBtn")).click();
    		 Thread.sleep(1000);
    		 oBrowser.findElement(By.id("closeProjectLightBoxBtn")).click();
    		
    		 
    		 
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void deleteProject()
     {
    	 try
    	 {
    		 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[4]/div[3]")).click();
    		 Thread.sleep(1000);
    		 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
    		 Thread.sleep(1000);
    		 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
    		 Thread.sleep(1000);
    		 oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
    		 
    		 
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void deleteCustomer()
     {
    	 try
    	 {
    		 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[4]")).click();
    		 Thread.sleep(1000);
    		 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
    		 Thread.sleep(1000);
    		 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
    		 oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
    		
    		 
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void logOut()
     {
    	 try
    	 {
    		 Thread.sleep(20000);
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

