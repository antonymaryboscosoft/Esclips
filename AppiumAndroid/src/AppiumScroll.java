import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AppiumScroll {
	AppiumDriver driver;
    Dimension size; 
    private static WebDriver Driver;
	public static WebDriver getDriver(){
	return Driver;
	}
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

	
	swipeDownLikeSwipeElementDirection(loginlink, 0);
	
	}

		public static void swipeDownLikeSwipeElementDirection(MobileElement element, int duration){
	        int offset = 1;
	        Point p = element.getCenter();
	        Point location = element.getLocation();
	        Dimension size = element.getSize();
	         ((AppiumDriver) getDriver()).swipe(p.getX(), location.getY() + size.getHeight() - offset, p.getX(), location.getY() , duration);
	    
	  
	  
	  }
}
