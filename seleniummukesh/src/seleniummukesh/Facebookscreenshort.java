package seleniummukesh;

import java.io.IOException;

import library.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebookscreenshort {
	@Test
	public void captureScreenshot() throws IOException{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\moses\\Downloads\\ChromeDriver.exe");
	WebDriver driver = new ChromeDriver();  
	driver.manage().window().maximize();
	
driver.get("https://www.facebook.com/");
//enter x path for email id
Utility.captureScreenshot(driver,"Browserstarted");
driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("automation testing");
Utility.captureScreenshot(driver,"TypeUName");
}

}
