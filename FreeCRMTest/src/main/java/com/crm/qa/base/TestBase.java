package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.crm.qa.util.TestUtil;

public class TestBase {
	 public static WebDriver driver;
	 public static Properties prop;
	public TestBase(){
		
		try {
			Properties prop = new Properties();
			FileInputStream ip = new FileInputStream("D:/others/pageobjectmodeltest/src/main/java/com/crm/qa/config/config.properties");
			prop.load(ip);
			System.out.println(prop.getProperty("name"));

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
		
		e.printStackTrace();
	}
	}

//create one method
public static void initialization(){
	 String browserName = (prop.getProperty("browser"));
	 if(browserName.equals("chrome")){
		 System.setProperty("webdriver.chrome.driver","E:\\anto\\seleniumchrom\\chromedriver.exe");
			 driver = new ChromeDriver();  
			driver.manage().window().maximize();
		
//		}else if(browserName.equals("ff")){
//			 System.setProperty("webdriver.chrome.driver","C:\\Users\\moses\\Downloads\\geckoDriver.exe");
//				WebDriver driver = new FirefoxDriver(); 
//		}else if(browserName.equals("IE")){
//			 System.setProperty("webdriver.chrome.driver","C:\\Users\\moses\\Downloads\\InternetexplorerDriver.exe");
//				WebDriver driver = new InternetExplorerDriver(); 
		}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
//	press ctrl and mouse over on the page load timeout it navigate to the testutil page.
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
}
}
