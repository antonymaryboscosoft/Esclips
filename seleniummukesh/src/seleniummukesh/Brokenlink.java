package seleniummukesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Brokenlink {
	@Test
	public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver","E:\\anto\\seleniumchrom\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	
	System.out.println("Total links are "+links.size());
	
	for(int i=0;i<links.size();i++)
	{
		
		WebElement ele= links.get(i);
		
		String url=ele.getAttribute("href");
		
//	verifyLinkActive(url);
		
	}
	}
}
