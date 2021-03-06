package seleniummukesh;


	import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

import static org.openqa.selenium.OutputType.*;

	public class Testcase {
	    public static void main(String[] args) throws Exception {
//	        FirefoxDriver wd;
			System.setProperty("webdriver.chrome.driver","E:\\anto\\seleniumchrom\\chromedriver.exe");

	       WebDriver  wd = new ChromeDriver();
	       wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        wd.get("https://www.freecrm.com/index.html");
	        wd.findElement(By.name("username")).click();
	        wd.findElement(By.name("username")).sendKeys("antonymary");
	        wd.findElement(By.name("password")).click();
	        wd.findElement(By.name("password")).sendKeys("antonymary");
	        new Actions(wd).doubleClick(wd.findElement(By.name("username"))).build().perform();
	        new Actions(wd).doubleClick(wd.findElement(By.name("password"))).build().perform();
	        wd.findElement(By.cssSelector("input.btn.btn-small")).click();
	        wd.findElement(By.name("username")).click();
	        wd.findElement(By.name("username")).sendKeys("\\undefined");
	        wd.findElement(By.name("password")).click();
	        wd.findElement(By.name("password")).sendKeys("\\undefined");
	        wd.quit();
	    }
	    
	    public static boolean isAlertPresent(FirefoxDriver wd) {
	        try {
	            wd.switchTo().alert();
	            return true;
	        } catch (NoAlertPresentException e) {
	            return false;
	        }
	    }
	}
