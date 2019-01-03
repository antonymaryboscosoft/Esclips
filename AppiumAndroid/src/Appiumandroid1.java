import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.server.SeleniumServer;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;


public class Appiumandroid1 {
	AppiumDriver driver;
//	JavascriptExecutor js = (JavascriptExecutor) driver;
	@BeforeMethod
	public void setUp() throws MalformedURLException {

	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName", "TestOneAdb1");
	capabilities.setCapability(CapabilityType.PLATFORM,"Android");
	capabilities. setCapability("platformVersion","5.0");
	capabilities.setCapability("appPackage", "io.appium.android.apis");
    capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");
	File file = new File("/Users/unit2a/Downloads", "app-debug.apk");
	capabilities.setCapability("app",file.getAbsolutePath());

	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

	
	}


	@Test
	public void TestMethod() throws InterruptedException{

	MobileElement loginlink = (MobileElement) driver.findElement(By.className("android.widget.TextView"));
	loginlink.click();
//	driver.wait(2000);

	driver.findElementById("com.ozeri.babyscale:id/btnLetsGo").click();
	driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	//driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	//driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	//driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
	driver.findElementById("com.ozeri.babyscale:id/btn_skip").click();
	/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	TouchActions action = new TouchActions(driver);
	action.scroll(loginlink, 10, 100);
	action.perform();*/
	
	
	
	

	 /*JavascriptExecutor js = (JavascriptExecutor) driver;
     HashMap<String, String> scrollObject = new HashMap<String, String>();
     scrollObject.put("direction", "down");
     js.executeScript("mobile: scroll", scrollObject);
	*/
	

	//driver.find_element_by_android_uiautomator('new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains("**/Agree to Terms & Conditions/**").instance(0))')

	/*driver.findElement(By.id("com.ozeri.babyscale:id/chk_agree")).click();
	WebElement scroll = driver.findElement(By.id("com.ozeri.babyscale:id/chk_agree"));
	scroll.sendKeys(Keys.PAGE_DOWN);
	
*/	/*JavascriptExecutor js = (JavascriptExecutor) driver
	 js.executeScript("window.scrollBy(0,250)", "");
*/
	
	/*driver.wait(2000);
	driver.findElementByClassName("android.widget.CheckBox").click();
	driver.findElementById("com.ozeri.babyscale:id/btn_accept").click();
	*/
	Thread.sleep(5000);	
	/*
	Thread.sleep(5000);

	WebElement e1 = driver.findElementById("com.ozeri.babyscale:id/edtBabyName");
	e1.click();
	//Thread.sleep(5000);
	e1.sendKeys("gaurav");*/
	
	//driver.findElementById("com.ozeri.babyscale:id/txtDob").click();

	
	//driver.findElementByXPath("android.widget.EditText[@name='type here..']").sendKeys("anto");
	//driver.findElement(By.id("com.ozeri.babyscale:id/edtBabyName")).sendKeys("anto");
	//driver.findElementByClassName("android.widget.TextView").sendKeys("anto");

	
	
	}
	/*
	public void scrollDown() throws Exception {

	    //The viewing size of the device
	    Dimension size = driver.manage().window().getSize();

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //Starting y location set to 80% of the height (near bottom)
	    int starty = (int) (size.height * 0.5);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //Ending y location set to 20% of the height (near top)
	    int endy = (int) (size.height * 0.2);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //x position set to mid-screen horizontally
	    int startx = size.width / 2;
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.swipe(0,starty,0,endy,1000); 
	    new TouchActions(driver)
	            .down(startx, starty)
	            .move(startx, endy)
	            .release()
	            .build()
	            .perform();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("com.ozeri.babyscale:id/chk_agree")).click();
		WebElement scroll = driver.findElement(By.id("com.ozeri.babyscale:id/chk_agree"));
		scroll.sendKeys(Keys.PAGE_DOWN);
	}
	
	public void jsScrollDown() throws Exception {

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    HashMap<String, String> scrollObject = new HashMap<String, String>();
	    scrollObject.put("direction", "down");
	    js.executeScript("mobile: scroll", scrollObject);

	}*/
/*	
	@AfterMethod
	public void teardown() throws Exception{

	Thread.sleep(5000);

    driver.quit();*/

	}

	//}
