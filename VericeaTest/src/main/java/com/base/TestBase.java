package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Testutil.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() {
		
		try {
			prop = new Properties();
			File file = new File("C:/Users/unit2a/Desktop/Newfolder/workspace/VericeaTest/src/main/java/crm/config/config.properties");
			FileInputStream ip = new FileInputStream(file);	
			
			prop.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
}
	
public static void initialization(){
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "E:/anto/seleniumchrom/chromedriver.exe");	
		
		driver = new ChromeDriver(); 
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
}
}
