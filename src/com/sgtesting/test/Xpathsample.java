package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathsample {
             public static WebDriver oBrowser =null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		navigate();
		basedOnTagNme();
		basedOntagnemIndex();
		//tagNameWithAtrributesAndValues();
		 tagNameWithMultipleAttribute();
	}
  static void launchBrowser()
  {
	  try
	  {
		  System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
		  oBrowser =new ChromeDriver();
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  static void navigate()
  {
	  try
	  {
		  oBrowser.get("file:///C:/Users/vinay/AppData/Local/Temp/Rar$EXa28876.31413/tests_2nd_SEPT_2021/Sample.html");
		  Thread.sleep(2000);
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  static void basedOnTagNme()
  {
	  try
	  {
		  oBrowser.findElement(By.xpath("//input")).sendKeys("vinayak");
		  Thread.sleep(2000);
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  static void basedOntagnemIndex()
  {
	  try
	  {
		  oBrowser.findElement(By.xpath("//input[2]")).sendKeys("vinayak@gmail.com");
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  static void tagNameWithAtrributesAndValues()
  {
	  try
	  {
		  oBrowser.findElement(By.xpath("//input[@class='submit1btn1']")).click();
		 
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  static void tagNameWithMultipleAttribute()
  {
	  try
	  {
		  oBrowser.findElement(By.xpath("//select[@id='tools'and @name='selectbox1']")).click();
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
}
