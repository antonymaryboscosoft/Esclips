package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	//Page Factory - OR(Obj repository):
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	//initialize the element with help of page factory
	//Initializing the Page Objects:
	// create constructor
	public LoginPage(){
		//defind one method (pagefactory-> class , initelements->method, this -> current class obj)
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	//1.get title of the page.
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	//to verify the freecrm image
	public boolean validateCRMImage(){
		return crmLogo.isDisplayed();
	}
	//login method return homepage .
	public HomePage login(String un, String pwd) throws InterruptedException{
		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		submit.click();
		    	/*JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", loginBtn);*/
		  	    	    
		return new HomePage();
}
}
