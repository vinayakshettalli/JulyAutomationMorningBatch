package com.sgtesting.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
  public PageObject(WebDriver oBrowser)
  {
	  PageFactory.initElements(oBrowser, this);
  }
  
  //user name field
  private WebElement username;
  public WebElement getUserName()
  {
	  return username;
  }
  //password filed
  private WebElement pwd;
  public WebElement getPassword()
  {
	  return pwd;
  }
  //loggin button field
 
  @FindBy(xpath="//div[text()='Login ']")
  private WebElement oLogin;
  public  WebElement getLogInButton()
  {
	  return oLogin;
  }
  //FlyOut window
  private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWin()
	{
		return gettingStartedShortcutsPanelId;
	}
	
  //logOut Button
	@FindBy(linkText="Logout")
  private WebElement ologoutLink;
  public WebElement getLogOut()
  {
	  return ologoutLink;
  }
  //create User start
	@FindBy(xpath="//a[@href and @class='content users']")
  private WebElement createUser;
  public WebElement getUserButton()
  {
	  return createUser;
  }
  @FindBy (xpath="//div[@class='addUserButton beigeButton useNativeActive']")
  private WebElement addUser;
  public WebElement getAddUser()
  {
	  return addUser;
  }
  private WebElement  userDataLightBox_firstNameField;
  public WebElement getFirstName()
  {
	  return  userDataLightBox_firstNameField;
  }
  private WebElement lastName;
  public WebElement getlastName()
  {
	  return lastName;
  }
  private WebElement email;
  public WebElement getEmail()
  {
	  return email;
  }
  private WebElement userDataLightBox_usernameField;
  public WebElement getUsername()
  {
	  return userDataLightBox_usernameField;
  }
  private WebElement userDataLightBox_passwordField;
  public WebElement getUserPassWord()
  {
	  return userDataLightBox_passwordField;
  }
  private WebElement userDataLightBox_passwordCopyField;
  public WebElement getUserRePassWord()
  {
	  return userDataLightBox_passwordCopyField;
  }
  private WebElement userDataLightBox_commitBtn;
  public WebElement getCommitBtn()
  {
	  return userDataLightBox_commitBtn;
  }
  //create user end
  //delete user start
  @FindBy(xpath="//div[@class='name']")
  private WebElement name;
  public WebElement getUserNameSpan()
  {
	  return name;
  }
  private WebElement userDataLightBox_deleteBtn;
  public WebElement getUserDeletebtn()
  {
	  return userDataLightBox_deleteBtn;
  }
  //delete user end
  //create customer start
 
  @FindBy(xpath="//a[@href and @class='content tasks']")
  private WebElement contentTask;
  public WebElement getContenttask()
  {
	  return contentTask;
  }
  @FindBy(xpath="//div[@class='addNewButton']")
    private WebElement  addNewButton;
  public WebElement getNewButton()
  {
	  return addNewButton;
  }
  @FindBy(xpath="//div[@class='item createNewCustomer ellipsis']")
  private WebElement newCustomer;
  public WebElement getAddCustomer()
  {
	  return newCustomer;
  }
  private WebElement customerLightBox_nameField;
  public WebElement getEntercustomerName()
  {
	  return customerLightBox_nameField;
  }
  
  private WebElement customerLightBox_commitBtn;
  public WebElement getcreateCustomer()
  {
	  return customerLightBox_commitBtn;
  }
  //create customer end
  //delete customer start
  @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
 private WebElement editButton;
  public WebElement geteditButtonforCustomer()
  {
	 return editButton;
  }
  @FindBy(xpath="//div[@class='actionButton']")
  private WebElement actionButton;
  public WebElement getactionButtonForDeleteCustomer()
  {
	  return actionButton;
  }
  @FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
  private WebElement deleteButton;
  public WebElement getDeleteButtonForCustomer()
  {
	  return deleteButton;
  }
  private WebElement customerPanel_deleteConfirm_submitTitle;
  public WebElement getPermanentDeleteButton()
  {
	  return customerPanel_deleteConfirm_submitTitle;
  }
  //delete customer end
  //Modify Customer start(used old codes)
  //create project
  @FindBy(xpath="//div[@class='nameLabel']")
  private WebElement nameLabel;
  public WebElement getnameLabel()
  {
	  return nameLabel;
  }
  @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")
  private WebElement nameLabel2;
  public WebElement getnameLabel2()
  {
	  return nameLabel2;
  }
  @FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
  private WebElement closeButton;
  public WebElement  closeButton()
  {
	  return closeButton;
  }
  
  @FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
  private WebElement startExploringText;
  public WebElement  getstartExploringText()
  {
	  return startExploringText;
  }
  //modify user 1 2 3
  @FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")
  private WebElement User1;
  public WebElement  getUser1()
  {
	  return User1;
  }
  @FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table")
  private WebElement User2;
  public WebElement  getUser2()
  {
	  return User2;
  }
  @FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/table")
  private WebElement User3;
  public WebElement  getUser3()
  {
	  return User3;
  }
 
}
