package com.crm.qa.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.qa.pages.LoginPage;

public class LoginPageTest {
	
@Test
	public void verifyLoginPageTest(){
	System.setProperty("webdriver.chrome.driver", "E:/anto/seleniumchrom/chromedriver.exe");
	 WebDriver driver = new ChromeDriver(); 
	 driver.manage().window().maximize();
	 driver.get("http://demosite.center/wordpress/wp-login.php");
	 
	 
//	 create object 
	 LoginPage login = new LoginPage(driver);
	 login.typeUserName("admin","demo123");
//	 login.typePassword("demo123");
//	 login.clickLoginButton();
	 driver.quit();
	}

}
