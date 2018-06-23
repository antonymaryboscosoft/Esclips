package seleniummukesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Drapdown {
	@Test
	public void selectDDValues() throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\anto\\seleniumchrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement month_dropdown=driver.findElement(By.id("month"));
//selenium select class
Select month_dd=new Select(month_dropdown);
month_dd.selectByIndex(3);
Thread.sleep(3000);
month_dd.selectByValue("10");
Thread.sleep(3000);
month_dd.selectByVisibleText("Aug");
	}
}
