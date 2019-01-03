package Javaselenium;

public class StringConcatenation2 {
//+ is concatenation operation
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		String x = "hello";
		String y = "world";
		double c =12.33;
		double c1 = 13.44;
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		
		System.out.println(c+c1);
		System.out.println(x+y+c+c1);
		System.out.println("the value of a is :"+a);
		System.out.println("the addition of a and b is :"+(a+b));
		
		System.out.println("============");
		System.out.print("Hello world");
		System.out.println("Hello world"); //ln means : new line
	}

}
