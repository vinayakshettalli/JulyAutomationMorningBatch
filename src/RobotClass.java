import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {
           public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		logIn();
		minimizeFlyingWindow();
		importTask();
	}
    static void launchBrowser()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
    		oBrowser =new ChromeDriver();
    		Thread.sleep(2000);
    	}catch(Exception e )
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
    		Thread.sleep(2000);
    	}catch(Exception e) 
    	{
    		e.printStackTrace();
    	}
    }
    static void logIn()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("admin");
    		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
    		Robot robot=new Robot();
    		robot.keyPress(KeyEvent.VK_ENTER);
    		robot.keyRelease(KeyEvent.VK_ENTER);
    		Thread.sleep(2000);
    		
    				
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    static void minimizeFlyingWindow()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//div[@class='gettingStartedShortcutsLabel']")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    static void importTask()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//div[@class='item importTasks ellipsis']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("dropzoneClickableArea")).click();
    		Thread.sleep(2000);
    		String Filename="D:\\RobotClass\\Sample.csv";
    		copyFile(Filename);
    		Thread.sleep(2000);
    		Robot robot=new Robot();
    		robot.keyPress(KeyEvent.VK_CONTROL);
    		robot.keyPress(KeyEvent.VK_V);
    		Thread.sleep(2000);
    		robot.keyRelease(KeyEvent.VK_CONTROL);
    		robot.keyRelease(KeyEvent.VK_V);
    		Thread.sleep(2000);
    		robot.keyPress(KeyEvent.VK_ENTER);
    		robot.keyRelease(KeyEvent.VK_ENTER);
    		Thread.sleep(2000);
    		
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    static void copyFile(String filename)
    {
    	try
    	{
    		StringSelection selection=new StringSelection(filename);
    		Toolkit obj=Toolkit.getDefaultToolkit();
    		Clipboard cb=obj.getSystemClipboard();
    		cb.setContents(selection, null);
    		
    	}catch(Exception e)
    	{
    	e.printStackTrace();	
    	}
    }
}
