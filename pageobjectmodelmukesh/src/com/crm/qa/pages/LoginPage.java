package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver ;
By username = By.id("user_login");
By password = By.xpath("//*[@id='user_pass']");
By Login= By.name("wp-submit");

	
/*public LoginPage(WebDriver driver){
	this.driver= driver ;
}*/
public LoginPage(WebDriver driver2) {
	this.driver =driver2;
}
public void typeUserName(String uid, String pwd){
	driver.findElement(username).sendKeys(uid);
	driver.findElement(password).sendKeys(pwd);
	driver.findElement(Login).click();
}
/*public void typePassword(String pwd){
	driver.findElement(password).sendKeys(pwd);

public void clickLoginButton(){
driver.findElement(Login).click();

}*/
}
