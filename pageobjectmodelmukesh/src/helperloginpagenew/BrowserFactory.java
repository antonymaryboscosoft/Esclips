package helperloginpagenew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
 static WebDriver driver;
	public  static WebDriver startBrowser(String browserName, String url){
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:/anto/seleniumchrom/chromedriver.exe");	
			
			driver = new ChromeDriver();	
	}
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		}
	
}
