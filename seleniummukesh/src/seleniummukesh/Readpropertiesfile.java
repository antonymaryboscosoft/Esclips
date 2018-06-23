package seleniummukesh;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Readpropertiesfile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
	Properties prop = new Properties();
	FileInputStream ip = new FileInputStream("C:/Users/unit2a/Desktop/New folder/workspace/seleniummukesh/src/seleniummukesh/config.properties/config1.properties");
prop.load(ip);
System.out.println(prop.getProperty("name"));
System.out.println(prop.getProperty("age"));
 String url =prop.getProperty("URL");
 System.out.println(url);
 String browserName = (prop.getProperty("browser"));
 System.out.println(browserName);
 if(browserName.equals("chrome")){
	 System.setProperty("webdriver.chrome.driver","E:\\anto\\seleniumchrom\\chromedriver.exe");
		 driver = new ChromeDriver();  
		driver.manage().window().maximize();
	
	}else if(browserName.equals("ff")){
		 System.setProperty("webdriver.chrome.driver","E:\\anto\\seleniumchrom\\chromedriver.exe");
			 driver = new FirefoxDriver(); 
	}else if(browserName.equals("IE")){
		 System.setProperty("webdriver.chrome.driver","E:\\anto\\seleniumchrom\\chromedriver.exe");
			 driver = new InternetExplorerDriver(); 
	}
 driver.get(url);
	}
}
