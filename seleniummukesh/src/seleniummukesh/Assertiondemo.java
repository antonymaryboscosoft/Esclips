package seleniummukesh;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertiondemo {
	@Test
	public void test1(){
		Assert.assertEquals(12, 13);
		
	}
		@Test
	public void test12(){
			System.out.println("test case 2 started");
		Assert.assertEquals(12, 13,"drop down does not match plz check the developer");
		System.out.println("test case 2 completed");
		
	}
		@Test
		public void test13(){
				System.out.println("test case 3 started");
			Assert.assertEquals("Hello", "Hello","word does not match raise the bud");
			System.out.println("test case 3 completed");
	}
		@Test
		public void test11(){
			String mystr="selenium";
			Assert.assertTrue(mystr.contains("selenium"));
		}
		@Test
		public void test22(){
			
			Assert.assertTrue(false);
		}
}
