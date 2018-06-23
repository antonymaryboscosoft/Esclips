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
	
	public LoginPageTest() {
		super();
	}
@BeforeMethod
public void setUp(){
initialization();
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
