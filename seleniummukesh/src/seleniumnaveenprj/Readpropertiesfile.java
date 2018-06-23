package seleniumnaveenprj;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readpropertiesfile {
	static WebDriver driver;
	public static void main(String[] args) throws IOException{
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:/Users/unit2a/Desktop/Newfolder/workspace/seleniummukesh/src/config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		String url = prop.getProperty("URL");
		System.out.println(url);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("chrome"))  {
		System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
		driver = new ChromeDriver();  
		driver.manage().window().maximize();
		}
		driver.get(url);
	
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.xpath(prop.getProperty("city_xpath"))).sendKeys(prop.getProperty("city"));
		
	}
}
