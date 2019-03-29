import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.base.TestBase;


public class LoginPageTest extends TestBase {
	 
	LoginPage loginPage;
	HomePage homePage;
	//create loginpagetest constructor
	//1. execute super key call parent class
	public LoginPageTest() {
		super();
	}
@BeforeMethod
public void setUp(){
//2.execute init method
initialization();
//create obj of login page class
//3. execute login page
loginPage = new LoginPage();

}
@Test(priority=1)
public void loginPageTitleTest(){
	String title = loginPage.validateLoginPageTitle();
	Assert.assertEquals(title, "Vericea");
	
}

@Test(priority=2)
public void loginTest() throws InterruptedException{
	homePage = loginPage.login(prop.getProperty("companycode"), prop.getProperty("username"), prop.getProperty("password"));
	
}
@AfterMethod
public void tearDown(){
driver.quit();
}
}
