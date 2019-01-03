import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.utility.Xls_Reader1;


public class Babyscale6 {
	AppiumDriver driver;
    Dimension size; 

	@BeforeMethod
	public void setUp() throws MalformedURLException {
 
		
		
		
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName", "TestOneAdb1");
	capabilities.setCapability(CapabilityType.PLATFORM,"Android");
	capabilities. setCapability("platformVersion","6.0");
	capabilities.setCapability("unicodeKeyboard", true);
	capabilities.setCapability("resetKeyboard", true);
	File file = new File("/Users/unit2a/Downloads", "ZBB1_Testing Build.apk");
	capabilities.setCapability("app",file.getAbsolutePath());

	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

	
	}
	@Test 

	public void TestMethod() throws InterruptedException{

	MobileElement loginlink = (MobileElement) driver.findElement(By.className("android.widget.TextView"));
	loginlink.click();
	
	driver.findElementById("com.ozeri.babyscale:id/btnLetsGo").click();
	driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	driver.findElementById("com.ozeri.babyscale:id/btn_skip").click();

	
			size = driver.manage().window().getSize();
			System.out.println(size);
			//Find swipe start and end point from screen's with and height.
			  //Find starty point which is at bottom side of screen.
			  int starty = (int) (size.height * 0.80);
			  //Find endy point which is at top side of screen.
			  int endy = (int) (size.height * 0.20);
			  //Find horizontal point where you wants to swipe. It is in middle of screen width.
			  int startx = size.width / 2;
			  System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

			  //Swipe from Bottom to Top.
			  driver.swipe(startx, starty, startx, endy, 3000);
			  Thread.sleep(1000);
			  /*//Swipe from Top to Bottom.
			  driver.swipe(startx, endy, startx, starty, 3000);
			  Thread.sleep(1000);
	*/
	
			
			  
			  
			  

	
	for (int i=1 ; i<= 8; i++){
		
		
		System.out.println(i);
		
		Thread.sleep(2000);

	driver.findElementByClassName("android.widget.EditText").sendKeys("anto");
	Thread.sleep(2000);
	
	driver.findElementById("com.ozeri.babyscale:id/txtDob").click();
	Thread.sleep(2000);

	driver.findElementByClassName("android.view.View").sendKeys("September 2018");	  //Set Year = 2009.
	Thread.sleep(2000);

	driver.findElement(By.id("android:id/button1")).click();
	Thread.sleep(2000);

	driver.findElement(By.id("com.ozeri.babyscale:id/txt_gender")).click();
	Thread.sleep(2000);

	driver.findElement(By.id("android:id/text1")).click();
	Thread.sleep(2000);

	driver.findElement(By.id("com.ozeri.babyscale:id/img_add")).click();
	Thread.sleep(2000);

	driver.findElement(By.id("android:id/button1")).click();
	Thread.sleep(2000);
	if (i==1){
		driver.findElement(By.id("com.ozeri.babyscale:id/smallLabel")).click();
		Thread.sleep(2000);
	}
	
	
	driver.findElement(By.id("com.ozeri.babyscale:id/fbtn_add")).click();
	Thread.sleep(2000);
	}
	
	
		driver.findElement(By.id("com.ozeri.babyscale:id/iconl")).click();
		Thread.sleep(2000);
	
	
	/*//	1.get the data from excel:
			utilpackage.Xls_Reader1 reader = new utilpackage.Xls_Reader1("C:/Users/unit2a/Desktop/Newfolder/workspace/Datadriven/src/com/excel/utility/Datadriven1.xlsx");
			
			int rowCount = reader.getRowCount("Addbabies");
//			.status view in xl sheet like pass or fail
			reader.addColumn("RegT estData", "Status");
			for(int rowNum = 0; rowNum<= rowNum; rowNum++){
				
				//Set Date = 25. 
				Integer data4= (int)wb.getSheetAt(0).getRow(rowNum).getCell(1).getNumericCellValue();
				  String str= data4.toString();
				driver.findElementByClassName("android.view.View").sendKeys(str);
				//Set Month = Aug.
				driver.findElementByClassName("android.view.View").sendKeys("September 2018");	  //Set Year = 2009.
				//Click on Done button.
				driver.findElement(By.id("android:id/button1")).click();
*/
		
		
	}
	}

//	}