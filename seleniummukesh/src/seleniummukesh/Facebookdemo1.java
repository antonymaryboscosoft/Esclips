package seleniummukesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdemo1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\anto\\seleniumchrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//*[@id='u_0_l']")).sendKeys("selenium");
//male or female selection
driver.findElement(By.xpath("//*[@id='u_0_c']")).click();
driver.findElement(By.xpath("//*[@id='u_0_13']")).click();
Select sel1=new Select(driver.findElement(By.xpath("//*[@id='month']")));
sel1.selectByVisibleText("Sept");
Select sel2=new Select(driver.findElement(By.xpath("//*[@id='day']")));
sel2.selectByValue("10");
Select sel3=new Select(driver.findElement(By.xpath("//*[@id='year']")));
sel3.selectByValue("2000");
//click create page
driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a")).click();
driver.navigate().back();
driver.quit();
}
}
