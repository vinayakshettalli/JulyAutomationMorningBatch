import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtesting.pageobject.PageObject;

public class aaaa {
	public static WebDriver oBrowser=null;
	public static PageObject oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
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
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
