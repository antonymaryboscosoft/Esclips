package com.crm.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
//		1.parent class (testbase)
		super();
	}
	@BeforeMethod
	public void setUp(){
//		2.parent class 
		initialization();
//		3.navigate to the login page
	
		loginPage = new LoginPage();	
	}
	
//	4.title checked
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM software in the cloud powers sales and customer service");
	}
//	5.logo checked
	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}
//	6.login check
	@Test(priority=3)
	public void loginTest() throws InterruptedException{
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}



