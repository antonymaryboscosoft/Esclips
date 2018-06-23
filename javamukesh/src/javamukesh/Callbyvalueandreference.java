package javamukesh;
//clss 12  call by value 
// can by reference posible in java by using obj  reference
public class Callbyvalueandreference {
	
	public static void main(String[] args) {
//		Callbyvalueandreference obj = new  Callbyvalueandreference();
		int a = 10;
		int b = 20 ;
		test(a, b);
	}
public static void test(int x , int y){
	int z = x+y ;
	System.out.println(z);
}
	
}

