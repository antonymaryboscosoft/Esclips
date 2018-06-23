package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(name= "companycode")
	WebElement companycode;
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//button[contains(text(), 'Log in')]")
	WebElement submit;
	
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	public HomePage login( String cmpid, String un, String pwd) throws InterruptedException {
		companycode.sendKeys(cmpid);
		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		submit.click();
		return new HomePage();
}
}