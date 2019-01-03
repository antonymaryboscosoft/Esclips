package oopsconcept;

public class Wrapperclass10 {

	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+20);
		//data conversion string to integer
		 int i =Integer.parseInt(x);
		 System.out.println(i+20);
//	integer to string
		 int a = 100;
		 System.out.println(a+20);
		 
		 String s =String.valueOf(a);
		 System.out.println(s+40);
		 
		 String r = "100A";
		int z= Integer.parseInt(r);// exception accuse in console
		System.out.println(z);
	}
	

}
