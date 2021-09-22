package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvacesAssignment {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		//  launchBrowser-->navigate-->login as admin-->createuser [User1,User2,User3] -->logout--->
		///login as User1--->logout-->Login as User2 --> logout -->login as User3 --> logout-->
		//login as admin [modify the password for User1,User2,User3] --> logout -->
		//login as User1--->logout-->Login as User2 --> logout -->login as User3 --> logout-->
		//login as Admin --> Delete [User1,User2,User3]-->logout -->closeApplication
		launchBrowser();
		navigate();
		loginAsAdmin();
		minimize();
		createUsers();
		logOut();
		loginWithuser1();
		logOut();
		loginWithuser2();
		logOut();
		loginWithuser3();
		logOut();
		loginAsAdmin1();
		modify123();
		logOut();
		loginWithModified1();
		logoutAsModified1();
		loginWithModified2();
		logoutAsModified2();
		loginWithModified3();
		logoutAsModified3();
		loginAsAdmin2();
		deleteUser1();
		deleteUser2();
		deleteUser3();
		logOutAdmin2();
		closeBrowser();


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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsAdmin()
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

	static void createUsers()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Jhon");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("A");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("jhona@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("jhon");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("A123456");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("A123456");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			System.out.println("created user1 sucessfully");


			//Create user2
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Albert");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("k");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("albera@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("albert");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("A123456");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("A123456");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			System.out.println("created user2 sucessfully");
			///create user3
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Alex");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("m");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("alexm@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("alex");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("A123456");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("A123456");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			System.out.println("created user3 sucessfully");	

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logOut()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	static void loginWithuser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("jhon");
			oBrowser.findElement(By.name("pwd")).sendKeys("A123456");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			popWindow();

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
	static void loginWithuser2()
	{
		try
		{
			Thread.sleep(4000);
			oBrowser.findElement(By.id("username")).sendKeys("albert");
			oBrowser.findElement(By.name("pwd")).sendKeys("A123456");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			popWindow();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginWithuser3()
	{
		try
		{
			Thread.sleep(4000);
			oBrowser.findElement(By.id("username")).sendKeys("alex");
			oBrowser.findElement(By.name("pwd")).sendKeys("A123456");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			popWindow();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsAdmin1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");;
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			System.out.println("Logged admin 1 sucessfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modify123()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();

			//modify user1 password
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Ab1234567");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Ab1234567");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();

			//Modify user2 password
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Ab12345678");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Ab12345678");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();

			//modify user3 password
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Ab123456789");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Ab123456789");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			System.out.println("Modified sucessfull");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logOutAdmin1()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginWithModified1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Jhon");
			oBrowser.findElement(By.name("pwd")).sendKeys("Ab1234567");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			System.out.println(" logged in As Modified1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutAsModified1()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
			System.out.println(" logged out As Modified1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void loginWithModified2()
	{
		try
		{    
			oBrowser.findElement(By.id("username")).sendKeys("albert");
			oBrowser.findElement(By.name("pwd")).sendKeys("Ab12345678");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			System.out.println(" logged out As Modified2()");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutAsModified2()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
			System.out.println(" logged in As Modified2()");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void loginWithModified3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("alex");
			oBrowser.findElement(By.name("pwd")).sendKeys("Ab123456789");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			System.out.println(" logged in As Modified3()");

		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}


	static void logoutAsModified3()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
			System.out.println(" logged out As Modified3()");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsAdmin2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			System.out.println(" loggded in As Admin2");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert obj=oBrowser.switchTo().alert();
			String a=obj.getText();
			System.out.println(a);
			obj.accept();
			Thread.sleep(3000);
			System.out.println("deleted User1()");


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser2()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert obj=oBrowser.switchTo().alert();
			String a=obj.getText();
			System.out.println(a);
			obj.accept();
			Thread.sleep(3000);
			System.out.println("deleted User2()");



		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert obj=oBrowser.switchTo().alert();
			String a=obj.getText();
			System.out.println(a);
			obj.accept();
			Thread.sleep(3000);
			System.out.println("deleted User3()");


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logOutAdmin2()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
			System.out.println("loggedOut Admin2()");
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
			Thread.sleep(3000);
			System.out.println("Browser Closed sucessfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
