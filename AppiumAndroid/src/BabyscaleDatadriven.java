import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;






//import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;






//import com.utility.Xls_Reader1;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;


public class BabyscaleDatadriven {
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
		capabilities. setCapability("platformVersion","6.0");
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
		
		
		
		 
//1.Add  8 babies
				//1.enter name
			for(int rowCount1=2; rowCount1<=9; rowCount1++){
				String name=reader.getCellData("Addbabies", "Name", rowCount1);
				System.out.println("Name:"+name);
					
				driver.findElementByClassName("android.widget.EditText").sendKeys(name);
				Thread.sleep(1000);
				
				//2.enter date of birth
				driver.findElementById("com.ozeri.babyscale:id/txtDob").click();
				Thread.sleep(1000);
				
				//select year
				driver.findElementById("android:id/date_picker_header_year").click();
				Thread.sleep(1000);
				driver.findElementById("android:id/text1").click();
				Thread.sleep(1000);
				for (int j=1; j<=rowCount1; j++){
					driver.findElementById("android:id/next").click();
					Thread.sleep(1000);
				}
			
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
				
			if (rowCount1==2){
					driver.findElement(By.id("com.ozeri.babyscale:id/smallLabel")).click();
					Thread.sleep(2000);
			}
			if (rowCount1<9){

				driver.findElement(By.id("com.ozeri.babyscale:id/fbtn_add")).click();
				Thread.sleep(2000);
			}
			}
		
			
			for(int rowNum = 2; rowNum<= rowCount; rowNum++){		
//2.Add Measurement
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
			
	//Print the reading in console
				String Number=reader.getCellData("Addbabies", "Number", rowNum);
				System.out.println("****Baby Reading****"+Number);
				
				String weight=reader.getCellData("Addbabies", "Weight", rowNum);
				System.out.println("Weight:"+weight);
				
				String height=reader.getCellData("Addbabies", "Height", rowNum);
				System.out.println("Height :"+height);
				
				String Headsize=reader.getCellData("Addbabies", "HeadCircumference", rowNum);
				System.out.println("HeadSize : "+Headsize);
			
				String Date= reader.getCellData("Addbabies", "date", rowNum);
			
				driver.findElementById("com.ozeri.babyscale:id/txtMeasurementDate").click();
				Thread.sleep(2000);
				
				driver.findElementById("android:id/date_picker_header_year").click();
				Thread.sleep(2000);
				driver.findElementById("android:id/text1").click();
				Thread.sleep(2000);
				
			
					for (int j1 =1; j1 <= rowNum; j1++) {
					driver.findElementById("android:id/prev").click();
			
					driver.findElementById("android:id/next").click();
					Thread.sleep(1000);
				
			
			
					for (int i = 0; i < 60; i++) {
						driver.findElementByXPath("//android.view.View[ @index='"+i+"']").sendKeys(Date);
						Thread.sleep(1000);
						driver.findElement(By.id("android:id/button1")).click();
						Thread.sleep(1000);
					}
					
			
				//date picker 
					/*
					List<WebElement> list= driver.findElement(By.xpath("//android.view.View"));
					list.get(19).click();    
					*/
			
			//Enter weight
			
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
		
				
					}
			}}
					
				
				
		/*
				TouchAction action1=new TouchAction(driver);
				action1.press(0, 300).waitAction(500).moveTo(700, 300).release().perform();*/
	public void editPage() throws InterruptedException{
		
		driver.findElementById("com.ozeri.babyscale:id/smallLabel").click();
		driver.findElementByClassName("android.support.v7.app.ActionBar$Tab").click();
		
//Scroll the page
		WebElement fromElement=driver.findElementById("com.ozeri.babyscale:id/chartTab");
		WebElement toElement= driver.findElement(By.xpath("//android.widget.TextView[@text='List']"));
		TouchAction tAction=new TouchAction(driver);
		tAction.press(fromElement).moveTo(toElement).release().perform();
	
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
		
		  //Click edit Button
		  driver.findElementById("com.ozeri.babyscale:id/txtEdit").click();
			Thread.sleep(1000);
			
			
			
			
	}
	
}
