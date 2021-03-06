package com.datadriven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.readerutility.Xls_Reader1;

public class Datadriven {
public static void main(String[] arg) throws InterruptedException{
	Xls_Reader1 r1 = new Xls_Reader1("C:/Users/unit2a/Desktop/Newfolder/workspace/example/src/com/exel/utility/register.xlsx");
	
	 String Title =r1.getCellData("register", "title", 2);
	 System.out.println(Title);
	 String firstName =r1.getCellData("register", "firstname", 2);
	 System.out.println(firstName);
	  
	String lastName= r1.getCellData("register", "lastname", 2);
	System.out.println(lastName);
	
	String Company=r1.getCellData("register", "company", 2);
	System.out.println(Company);
	
	String Position=r1.getCellData("register","position", 2);
	System.out.println(Position);
	
	String Department=r1.getCellData("register", "department", 2);
	System.out.println(Department);
	
	String Assistance=r1.getCellData("register", "assistance", 2);
	System.out.println(Assistance);
	
	String Address=r1.getCellData("register","address", 2);
	System.out.println(Address);
	
	String City=r1.getCellData("register", "city", 2);
	System.out.println(City);
	 
	String Country=r1.getCellData("register", "country", 2);
	System.out.println(Country);
	
	System.setProperty("webdriver.chrome.driver","E:\\anto\\seleniumchrom\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.freecrm.com/index.html");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("antonymary");
	driver.findElement(By.name("password")).sendKeys("antonymary");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	driver.switchTo().frame("mainpanel");
	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/ul/li[1]/a")).click();
	
	
	/*List  col = driver.findElements(By.xpath("//*[@id='contactForm']/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/select")); 
	 System.out.println("No of cols are : " +col.size());
	    System.out.println("No of rows are : " + rows.size());oih
	 */
	Select select = new Select(driver.findElement(By.xpath("//select[@name = 'title' ")));
	 select.selectByVisibleText(Title);
	
	
}

}
