package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
//after login to check the user name as antony mary
		@FindBy(xpath="//td[contains(text(),'User: antony mary')]")
		@CacheLookup
		WebElement userNameLable;
	
		
		@FindBy(xpath="//a[contains(text(),'Contacts')]")
		WebElement contactsLink;
		
//		1.class 4 pom using 
		@FindBy(xpath ="//a[contains(text(),'New Contact')]")
		WebElement newContactLink;
		
		@FindBy(xpath="//a[contains(text(),'Deals')]")
		WebElement dealsLink;
		
		@FindBy(xpath = "//a[contains(text(),'Tasks')]")
		WebElement tasksLink;
		

		//Initializing the Page Objects:
		public HomePage(){
			PageFactory.initElements(driver, this);
		}
		
		
	public String verifyHomePageTitle(){
		 return driver.getTitle();
		
	}
	public boolean verifyCorrectUserName(){
		return userNameLable.isDisplayed();
	}
	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage();
	}
	public DealsPage clickOnDealsLink(){
		dealsLink.click();
		return new DealsPage();
	}
	public TasksPage clickOnTasksLink(){
		tasksLink.click();
		return new TasksPage();
		
	}
//	2.class 4 pom using 
	public void clickOnNewContactLink(){
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		
	}
	}


