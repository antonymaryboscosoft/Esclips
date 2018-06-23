package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
//4. class 4 pom using
//	click inside the contact -> contact
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLable;
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	//Initializing the Page Objects:
		public ContactsPage(){
			PageFactory.initElements(driver, this);
		}
		
		public boolean verifyContactsLabel(){
			return contactsLable.isDisplayed();
		} 
		
		public void selectContactsByName(String name){
		driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]/parent::td//parend-sibling::td//input[@name='contact_id']")).click();	
		}
//		3.class 4 pom using
		public void createNewContact(String title, String ftName, String ltName, String comp){
			Select select = new Select(driver.findElement(By.name("title")));
			select.selectByVisibleText(title);
			
//		5.class 4 pom using
			firstName.sendKeys(ftName);
			lastName.sendKeys(ltName);
			company.sendKeys(comp);
			saveBtn.click();
			
		}
		 

}
