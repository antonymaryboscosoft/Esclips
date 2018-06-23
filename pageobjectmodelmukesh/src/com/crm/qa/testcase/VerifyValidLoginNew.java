package com.crm.qa.testcase;

import helperloginpagenew.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.qa.pages.LoginPageNew;

public class VerifyValidLoginNew {
	@Test
	public void checkValidUser(){
//		launch the browser and enter the url
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
//		create page object using page factory
		LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
//		call the method
		login_page.login_wordpress("admin", "demo123");
	}

}
