package seleniummukesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoalert {
	@Test
	public void handleAlert() throws InterruptedException{
		

	System.setProperty("webdriver.chrome.driver","E:\\anto\\seleniumchrom\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.aanavandi.com/");
	driver.findElement(By.xpath(".//*[@id='btnSearch']")).click();
	Thread.sleep(2000);
//	Alert alt=driver.switchTo().alert();
//	alt.accept();
	//gettext use to captuer the alert msg
	String actual_msg=driver.switchTo().alert().getText();
	System.out.println("Alert msg is"+actual_msg);
	driver.switchTo().alert().accept();
	}
}
