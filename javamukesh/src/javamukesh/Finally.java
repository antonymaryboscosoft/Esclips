package javamukesh;

public class Finally {
//fannally is a block
//	finally always use to try catch statement to execute the code
	/*finalize: is a Method
	finalize is called when an object is garbage collected. You rarely need to override it.*/
	public static void main(String[] args) {
	
		test();
		test2();
		devision();
	}

	public  static void test(){
		try{
			System.out.println("inside the try block");
			throw new RuntimeException("test");
			
		}catch (Exception e){
			System.out.println("inside the catch block");
		}
	finally
	{
		System.out.println("inside the finally block");
		System.out.println("******");
	}
}
	public static void test2(){
		try{
			System.out.println("inside the test2 block");
		}
		finally {
			System.out.println("inside the finally test2 block");
			System.out.println("********");
		}}
		// another example
		public  static void devision(){
			int i = 10;
			try{
				System.out.println("inside the try block");
				int k = i/0;
			/*1.catch(ArithmeticException e (or)
				2.if we enter nullpointerexception , exception has trown
				but no one catch code will be executed*/
			}catch(NullPointerException e){
				System.out.println("inside the catch block");
				System.out.println("devision by zero error");
				
			}
			finally {
				System.out.println("exicute the code even any exception accure");
			}
		}
	
	}