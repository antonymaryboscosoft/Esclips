package com.datadrivenhalfebay;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Reader.Xls_Reader1;

public class Parameterizetest {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\anto\\seleniumchrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterinfo");
		Thread.sleep(2000);
		
//	get the data from excel
	Xls_Reader1 reader = new Xls_Reader1("C:/Users/unit2a/Desktop/Newfolder/workspace/Halfebay/src/com/Reader/Xls_Reader1.java");
	int rowCount = reader.getRowCount("RegTestData");
	for(int rowNum=2; rowNum<=rowCount ; rowNum++){
		System.out.println("==============");
		
		String firstName =reader.getCellData("RegTestData", "firstname", rowNum);
		System.out.println(firstName);
		
	    String lastName=reader.getCellData("RegTestData", "lastnane", rowNum);
		System.out.println(lastName);
		
		String address1 =reader.getCellData("RegTestData", "address1", rowNum);
		System.out.println(address1);                                                                                                                                                       
		
		String address2=reader.getCellData("RegTestData", "address2", rowNum);
		System.out.println(address2);
		
		
	}
	
}
}
