package Addreading;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Duration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Addbaby {
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
	File file = new File("/Users/unit2a/Downloads", "app-debug (1).apk");
	capabilities.setCapability("app",file.getAbsolutePath());

	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	
	
	
	}
	@Test 

	public void TestMethod() throws InterruptedException{
 
	MobileElement loginlink = (MobileElement) driver.findElement(By.className("android.widget.TextView"));
	loginlink.click();
	Thread.sleep(1000);

	
	driver.findElementById("com.ozeri.babyscale:id/btnLetsGo").click();
	driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	 
	//Add babies
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
	
	//Add Measurement
	driver.findElement(By.id("com.ozeri.babyscale:id/btn_add_measurement")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("android:id/button1")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.ozeri.babyscale:id/rbManualBtn")).click();
	Thread.sleep(1000);
	
	//Select date
	driver.findElementById("com.ozeri.babyscale:id/txtMeasurementDate").click();
	Thread.sleep(1000);
	
	driver.findElementById("android:id/date_picker_header_year").click();
	Thread.sleep(1000);
	driver.findElementById("android:id/text1").click();
	Thread.sleep(1000);
	driver.findElementById("android:id/next").click();
	Thread.sleep(1000);
	
	/*List<WebElement> pick = driver.findElementsById("android:id/month_view");           
	Thread.sleep(2000);
	System.out.println(pick);
    //pick.get(0).sendKeys("2018");
   // pick.get(1).sendKeys("Mar");
    pick.get(19).sendKeys("20");
	System.out.println("Date Pick Sucess");*/
	for( int i=0; i<=50; i++){
	driver.findElementByXPath("//android.view.View[@index='"+i+"']");
	Thread.sleep(1000);
	driver.findElement(By.id("android:id/button1")).click();
	Thread.sleep(1000);
	
	}
	
	//Enter value
	driver.findElementById("com.ozeri.babyscale:id/edtWeight1").sendKeys("9");
	Thread.sleep(1000);
	
	driver.findElementById("com.ozeri.babyscale:id/edtHeight2").sendKeys("65");
	Thread.sleep(1000);
	
	driver.findElementById("com.ozeri.babyscale:id/edtHead2").sendKeys("39");
	Thread.sleep(1000);
	
	//save value
	driver.findElementById("com.ozeri.babyscale:id/img_tick").click();
	driver.findElementById("android:id/button1").click();
	Thread.sleep(1000);

	editPage();
	
	
	}
	
	public void editPage() throws InterruptedException{
		
		driver.findElementById("com.ozeri.babyscale:id/nav_grth").click();
		Thread.sleep(2000);
	//Scroll the page

		WebElement fromElement=driver.findElementById("com.ozeri.babyscale:id/chartTab");
		WebElement toElement= driver.findElement(By.xpath("//android.widget.TextView[@text='List']"));
		TouchAction tAction=new TouchAction(driver);
		tAction.press(fromElement).moveTo(toElement).release().perform();

		
		WebElement fromElement1=driver.findElement(By.xpath("//android.widget.LinearLayout[ @index='0']"));
		WebElement toElement1= driver.findElement(By.xpath("//android.widget.TextView[@text='Graph']"));
		TouchAction tAction1=new TouchAction(driver);
		tAction1.press(fromElement1).moveTo(toElement1).release().perform();

		
		
		
		
		
		//Scroll the page right to left

		size = driver.manage().window().getSize();
		  System.out.println(size);
		//Find start x point which is at right side of screen.
		  int startx = (int) (size.width * 0.70);	
		  
		//Find endx point which is a t left side of screen.
		  int endx = (int) (size.width * 0.30);
		//Find vertical point where you wants to swipe. It is in middle of screen height.
		  int starty = size.height / 2;
		  System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);
		
		  //Swipe from Right to Left.
		  driver.swipe(startx, starty, endx, starty, 3000);
		  Thread.sleep(2000);
		  
		  driver.findElementById("com.ozeri.babyscale:id/txtEdit").click();
			Thread.sleep(1000);
			
			
		//Enter weight
			
			driver.findElementById("com.ozeri.babyscale:id/edtWeight1").clear();
			driver.findElementById("com.ozeri.babyscale:id/edtWeight1").sendKeys("15");
			Thread.sleep(1000);
		
		//Enter Height
			driver.findElementById("com.ozeri.babyscale:id/edtHeight2").clear();
			driver.findElementById("com.ozeri.babyscale:id/edtHeight2").sendKeys("65");
			Thread.sleep(1000);
		
		//Enter Head size
			driver.findElementById("com.ozeri.babyscale:id/edtHead2").clear();
			driver.findElementById("com.ozeri.babyscale:id/edtHead2").sendKeys("43");
			Thread.sleep(1000);
		
		//save value
			driver.findElementById("com.ozeri.babyscale:id/img_tick").click();
			driver.findElementById("android:id/button1").click();
		
		  
	}
	}
		


		



