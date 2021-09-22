import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpBrowserDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		popUpBrowser();
		handlePopups();
		//popUpCount();
		//handlePopups();

	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
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
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void popUpBrowser()
	{
		try
		{
                // System.out.println("Before click on the link "+popUpCount());
                 oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
               //  System.out.println("After click on the link "+popUpCount());
                 if(popUpCount()>0)
                 {
                	 handlePopups();
                	 
                 }
                 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static int popUpCount()
	{ 
		int x=0;
		try
		{
         x=oBrowser.getWindowHandles().size()-1;
        
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	static void handlePopups()
	{
		try
		{
			oBrowser.findElement(By.xpath("/html/body/div[1]/section[1]/div/a")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
