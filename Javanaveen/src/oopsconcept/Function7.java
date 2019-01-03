package oopsconcept;


//class 7 frt create non static method.
public class Function7 {

	public static void main(String[] args) {
		Function7 obj = new Function7();
//		One object will be created , is the reference variable, reffering to this obj
//		after creating the object ,the copy of all non static method will be given to this obj.
//		 can i access the non static using obj reference .. yes
		obj.test1();
		
		int i=obj.value1();
		System.out.println(i);
		
		String j= obj.text1();
		System.out.println(j);
		
		int d = obj.division1(50, 10);
		System.out.println(d);
		


	}
//	non static method
	//1.return type is void
		public void test1( ){
			System.out.println("test method"); //no input, no output
		}
		
//		2.here void des't return type 
	//	return type is int
		// method  name(value)
		public int value1(){  // no input , some output
			System.out.println("value method");

			int a = 10;
			int b = 20;
			int c = a+b;
			return c ;
		}
//		return type is String
		public String text1(){ // no input , some output
			System.out.println("text method");
			String s = "selenium";
			return s ;
		}
		public int division1(int x , int y){
			System.out.println("division method");
			int d = x/y;
			return d;
		} 

}
