import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Addonebaby {
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
		File file = new File("/Users/unit2a/Downloads", "app-debug.apk");
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
				driver.findElement(By.id("com.ozeri.babyscale:id/rbManualBtn")).click();
				Thread.sleep(2000);
		
		//Select date
				driver.findElementById("com.ozeri.babyscale:id/txtMeasurementDate").click();
				Thread.sleep(1000);
				
				driver.findElementById("android:id/date_picker_header_year").click();
				Thread.sleep(1000);
				driver.findElementByXPath("//android.widget.TextView[@index='2' and @text='2018']").click();
				Thread.sleep(1000);
				driver.findElementById("android:id/prev").click();
				for (int j1 =2; j1 <= rowNum; j1++) {
				driver.findElementById("android:id/next").click();
				Thread.sleep(1000);
				}
					String Date= reader.getCellData("Addbabies", "date",rowNum );
					Thread.sleep(1000);
					driver.findElementByXPath("//android.view.View[@index='"+rowNum+"']").sendKeys(Date);
					Thread.sleep(1000);
					driver.findElement(By.id("android:id/button1")).click();
					Thread.sleep(1000);
					
			//Print the reading in console
					String Number=reader.getCellData("Addbabies", "Number", rowNum);
					System.out.println("****Baby Reading****"+Number);
					String weight=reader.getCellData("Addbabies", "Weight", rowNum);
					System.out.println("Weight:"+weight);
					
					String height=reader.getCellData("Addbabies", "Height", rowNum);
					System.out.println("Height :"+height);
					
		  			String Headsize=reader.getCellData("Addbabies", "HeadCircumference", rowNum);
					System.out.println("HeadSize : "+Headsize);
				
			//Enter weight
					if(rowNum==2){
					driver.findElementById("com.ozeri.babyscale:id/img_tick").click();
					Thread.sleep(1000);
					driver.findElementById("com.ozeri.babyscale:id/btnOk").click();
					Thread.sleep(1000);
					}
					driver.findElementById("com.ozeri.babyscale:id/edtWeight1").clear();
					driver.findElementById("com.ozeri.babyscale:id/edtWeight1").sendKeys(weight);
					Thread.sleep(1000);
				
			//Enter Height
					driver.findElementById("com.ozeri.babyscale:id/edtHeight2").clear();
					driver.findElementById("com.ozeri.babyscale:id/edtHeight2").sendKeys(height);
					Thread.sleep(1000);
				
			//Enter Head size
					driver.findElementById("com.ozeri.babyscale:id/edtHead2").clear();
					driver.findElementById("com.ozeri.babyscale:id/edtHead2").sendKeys(Headsize);
					Thread.sleep(1000);
				
			//save value
					driver.findElementById("com.ozeri.babyscale:id/img_tick").click();
					driver.findElementById("android:id/button1").click();
					
			editPage();
						}}
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
	