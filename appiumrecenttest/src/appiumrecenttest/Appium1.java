package appiumrecenttest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Appium1 {
	AppiumDriver driver;

	@BeforeMethod
	public void setUp() throws MalformedURLException {

	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName", "TestOneAdb1");
	capabilities.setCapability(CapabilityType.PLATFORM,"Android");
	capabilities. setCapability("platformVersion","5.0");

	File file = new File("/Users/unit2a/Downloads", "app-debug.apk");
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
	driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	//driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	//driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	driver.findElementById("com.ozeri.babyscale:id/btn_skip").click();
	}
	public void scrollDown() {
		Dimension dimensions = MobileDriver.getDriver().manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
			
		new TouchAction((PerformsTouchActions) MobileDriver.getDriver())
			.press(PointOption.point(0, scrollStart))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			.moveTo(PointOption.point(0, scrollEnd))
			.release().perform();
	}
 
        public WebElement getItemViews() {
		return MobileDriver.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Views']"));
	}
	
	public List<WebElement> getItemWebView(){
		return MobileDriver.getDriver().findElements(By.xpath("//android.widget.TextView[@text='WebView']"));
	}
	
	public void scrollTillWebView() throws InterruptedException {
		getItemViews().click();
		
		while(getItemWebView().size() == 0) {
			scrollDown();
		}
		
		if(getItemWebView().size() > 0) {
			getItemWebView().get(0).click();
		}
		Thread.sleep(4000);	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//scroll();
	
	/*driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	 WebElement Accept = driver.findElement(By.id("com.ozeri.babyscale:id/btn_accept"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(Accept);
	     actions.click();*/
	   // actions.perform();
	
	
	
	
	
/*	//ADD BABY
		driver.findElementById("com.ozeri.babyscale:id/edtBabyName").sendKeys("anto");

		driver.findElementById("com.ozeri.babyscale:id/txtDob").click();
		
}*/

	/*public void scroll() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "down");
        js.executeScript("mobile: scroll", scrollObject);
		
	}*/
	
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  