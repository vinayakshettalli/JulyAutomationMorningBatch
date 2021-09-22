package com.testing.cssselector;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
      public static WebDriver oBrowser =null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//absoluteSelector();
		//basedOnTagName();
		//basedOnTagNameWithIdAtrributevalue();
		//basedOnIdAtrributevalue();
	//	basedOnTagNameWithclassAtrributevalue();
		//basedOnclassAtrributevalue();
		tagnameattributenamevalue();

	}
     static void launchBrowser()
     {
    	 try
    	 {
    		 System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
    		 oBrowser =new ChromeDriver();
    		 
    	 }catch(Exception e )
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void navigate()
     {
    	 try
    	 {
    		 oBrowser.get("D:\\Notes\\HTML\\CSS_Selector_13th_Sept_2021\\Sample.html");
    		 oBrowser.manage().window().maximize();
    	 }catch(Exception e )
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void absoluteSelector()
     {
    	 try
    	 {
    		 oBrowser.findElement(By.cssSelector(" html body div form input ")).sendKeys("vinayak");
    	 }catch(Exception e )
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void basedOnTagName()
     {
    	 try
    	 {
    		 oBrowser.findElement(By.cssSelector("input ")).sendKeys("vinayak");
    	 }catch(Exception e )
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void basedOnTagNameWithIdAtrributevalue()
     {
    	 try
    	 {
    		 oBrowser.findElement(By.cssSelector("input#firstname")).sendKeys("vinayak");
    	 }catch(Exception e )
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void basedOnIdAtrributevalue()
     {
    	 try
    	 {
    		 oBrowser.findElement(By.cssSelector("#uid1user1name1")).sendKeys("vinayak");
    	 }catch(Exception e )
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void basedOnTagNameWithclassAtrributevalue()
     {
    	 try
    	 {
    		 oBrowser.findElement(By.cssSelector("input.firstname")).sendKeys("vinayak");
    	 }catch(Exception e )
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void basedOnclassAtrributevalue()
     {
    	 try
    	 {
    		 oBrowser.findElement(By.cssSelector(".chrome")).click();
    	 }catch(Exception e )
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void tagnameattributenamevalue()
     {
    	 try
    	 {
    		 Thread.sleep(2000);
    		 List<WebElement> obj=oBrowser.findElements(By.cssSelector("a[href]")); System.out.println(obj);
    		 System.out.println("no of links "+obj.size());
    		 for( int i=0;i<obj.size();i++)
    		 {
    			 WebElement obj1=obj.get(i);
    			 System.out.println(obj1.getText());
    					 
    		 }
    	 }catch(Exception e )
    	 {
    		 e.printStackTrace();
    	 }
     }
}
