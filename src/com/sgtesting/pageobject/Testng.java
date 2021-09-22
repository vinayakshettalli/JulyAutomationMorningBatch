package com.sgtesting.pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testng {
	public static WebDriver oBrowser=null;
	public static PageObject oPage=null;
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
	static void closeBrowser()
	{
		try
		{
			oBrowser.close();
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
			oPage.getFirstName().sendKeys("vinayak");
			oPage.getlastName().sendKeys("k");
			oPage.getEmail().sendKeys("vinayakk@gmail.com");
			oPage.getUsername().sendKeys("jhon");
			oPage.getUserPassWord().sendKeys("1234567891");
			oPage.getUserRePassWord().sendKeys("1234567891");
			oPage.getCommitBtn().click();
			System.out.println("vvvv");
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
			oPage.getUserNameSpan().click();
			Thread.sleep(2000);
			oPage.getFirstName().clear();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("abhi");
			oPage.getCommitBtn().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			oPage.getUserNameSpan().click();
			Thread.sleep(2000);
			oPage.getUserDeletebtn().click();
			Alert o=oBrowser.switchTo().alert();
			o.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createCustomer()
	{
		try
		{
			oPage.getContenttask().click();
			Thread.sleep(2000);
			oPage.getNewButton().click();
			Thread.sleep(2000);
			oPage.getAddCustomer().click();
			Thread.sleep(2000);
			oPage.getEntercustomerName().sendKeys("wipro");
			oPage.getcreateCustomer().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteCustomer()
	{
		try
		{
			Thread.sleep(2000);
			oPage.geteditButtonforCustomer().click();
			Thread.sleep(2000);
			oPage.getactionButtonForDeleteCustomer().click();
			Thread.sleep(2000);
			oPage.getDeleteButtonForCustomer().click();
			Thread.sleep(2000);
			oPage.getPermanentDeleteButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyCustomer()
	{
		try
		{
			oPage.geteditButtonforCustomer().click();
			Thread.sleep(2000);
			oPage.getnameLabel().click();
			Thread.sleep(2000);
			oPage.getnameLabel2().clear();
			Thread.sleep(2000);
			oPage.getnameLabel2().sendKeys("HCL");
			Thread.sleep(2000);
			oPage.closeButton().click();
			Thread.sleep(2000);
			System.out.println();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}


