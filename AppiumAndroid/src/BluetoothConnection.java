import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BluetoothConnection {
	static AppiumDriver driver;
    Dimension size; 

	XSSFWorkbook wb;
	XSSFSheet sheet;
	FileInputStream fis;

	
	@BeforeTest
	public void g() throws IOException {
	File src = new File ("C:/Users/unit2a/Desktop/Newfolder/workspace/AppiumAndroid/src/Xlfile/Datadriven1.xlsx");
	fis = new FileInputStream(src);	
	wb = new XSSFWorkbook(fis);
	sheet = wb.getSheetAt(0);
	}
	@Test 
	public void main() throws MalformedURLException, InterruptedException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "TestOneAdb1");
		capabilities.setCapability(CapabilityType.PLATFORM,"Android");
		capabilities. setCapability("platformVersion","5.0");
		capabilities.setCapability("unicodeKeyboard", true);
		capabilities.setCapability("resetKeyboard", true);
		File file = new File("/Users/unit2a/Downloads", "app-debug (2).apk");
		capabilities.setCapability("app",file.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

		MobileElement loginlink = (MobileElement) driver.findElement(By.className("android.widget.TextView"));
		loginlink.click();
		
		driver.findElementById("com.ozeri.babyscale:id/btnLetsGo").click();
		driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
		driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
		driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
		driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
		driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
		driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	
		Reading();
		}
	
	public void Reading() throws InterruptedException{
		
		
		utilpackage.Xls_Reader1 reader = new utilpackage.Xls_Reader1("C:/Users/unit2a/Desktop/Newfolder/workspace/AppiumAndroid/src/Xlfile/Datadriven1.xlsx");
		int rowCount = reader.getRowCount("Addbabies");
		//1.status view in xl sheet like pass or fail
		//reader.addColumn("RegT estData", "Status");
		
//Add babies
		//add baby image
				driver.findElementById("com.ozeri.babyscale:id/imgMedia").click();
				Thread.sleep(1000);
				driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
				Thread.sleep(1000);
				driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
				Thread.sleep(1000);
				driver.findElementByXPath("//android.widget.TextView[@index='0' and @text='Camera']").click();
				Thread.sleep(2000);
				driver.findElementById("com.lenovo.scg:id/shutter_button").click();
				Thread.sleep(1000);
				driver.findElementById("com.lenovo.scg:id/btn_done").click();
				Thread.sleep(1000);
		//without enter name throw error msg.		
				driver.findElementById("com.ozeri.babyscale:id/img_add").click();
				Thread.sleep(1000);
				driver.findElementById("com.ozeri.babyscale:id/btnOk").click();
				Thread.sleep(1000);
		
		//1.enter name
				driver.findElementByClassName("android.widget.EditText").sendKeys("anto");
				Thread.sleep(1000);
		
		//2.enter date of birth
				driver.findElementById("com.ozeri.babyscale:id/txtDob").click();
				Thread.sleep(1000);
		
		//select year
				driver.findElementById("android:id/date_picker_header_year").click();
				Thread.sleep(1000);
				driver.findElementById("android:id/text1").click();
				Thread.sleep(1000);
				driver.findElementByXPath("//android.view.View[@text ='20' and @index='19']").click();
				Thread.sleep(1000);
				driver.findElement(By.id("android:id/button1")).click();
				Thread.sleep(1000);
		
		//select gender
				driver.findElement(By.id("com.ozeri.babyscale:id/txt_gender")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("android:id/text1")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("com.ozeri.babyscale:id/img_add")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("android:id/button1")).click();
				Thread.sleep(1000);
		//2.Add Measurement		
				for(int rowNum = 2; rowNum<= rowCount; rowNum++){		
				driver.findElement(By.id("com.ozeri.babyscale:id/nav_home")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("com.ozeri.babyscale:id/btn_add_measurement")).click();
				Thread.sleep(2000);
				if(rowNum==2){
				driver.findElement(By.id("android:id/button1")).click();
				Thread.sleep(2000);  
				driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
				Thread.sleep(2000);
				}
				driver.findElement(By.id("com.ozeri.babyscale:id/img_connect_ble")).click();
				Thread.sleep(2000);
	}
}}
