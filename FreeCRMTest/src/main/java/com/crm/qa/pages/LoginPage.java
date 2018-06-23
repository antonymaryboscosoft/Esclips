package com.crm.qa.pages;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory - OR:
			@FindBy(name="username")
			WebElement username;
			
			@FindBy(name="password")
			WebElement password;
			
			@FindBy(xpath="//input[@type='submit']")
			WebElement loginBtn;
			
			@FindBy(xpath="//button[contains(text(),'Sign Up')]")
			WebElement signUpBtn;
			
			@FindBy(xpath="//img[contains(@class,'img-responsive')]")
			WebElement crmLogo;
			
			//Initializing the Page Objects:
			public LoginPage(){
				PageFactory.initElements(driver, this);


}
