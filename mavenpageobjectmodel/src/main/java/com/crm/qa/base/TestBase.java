package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
//	Step1
	public TestBase(){
		try {
			Properties prop = new Properties();
			FileInputStream ip = new FileInputStream("C:/Users/unit2a/Desktop/New folder/workspace/mavenpageobjectmodel/src/main/java/cpm/crm/qa/config/config.properties");
			prop.load(ip);
			System.out.println(prop.getProperty("name"));

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
		
		e.printStackTrace();
	}	
	}
//	Step2 create one method
	public static void initialization(){
		
		 String browserName = (prop.getProperty("browser"));
		 if(browserName.equals("chrome")){
			 System.setProperty("webdriver.chrome.driver","E:\\anto\\seleniumchrom\\chromedriver.exe");
				 driver = new ChromeDriver();  
				driver.manage().window().maximize();
		
		
	}

	}
	
}
