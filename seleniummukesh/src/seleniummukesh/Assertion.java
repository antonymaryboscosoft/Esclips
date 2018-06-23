package seleniummukesh;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	String  classname= "HardAssertion";
	@Test
	public void test_usingHardAssertion(){
		Assert.assertTrue(true == true);
		//method1==> Assert.assertEquals("HardAssertion", "HardAssertion");
		Assert.assertEquals("HardAssert", "HardAssertion");
		Assert.assertEquals(classname, "HardAssertion");
		System.out.println("sucessfully executed");
	}
}
