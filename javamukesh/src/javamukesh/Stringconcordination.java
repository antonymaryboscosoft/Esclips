package javamukesh;

import java.util.ArrayList;

public class Stringconcordination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 10;
int b = 20 ;
String x = "hellow world";
String y = "Java";
System.out.println(a+b);
System.out.println(x+y+a+b);
System.out.println(x+y+(a+b));
//	class 3 naveen
//Dis-adv it will generate infinity loop if you don't give increment/decrement port
	int i=1;
	while(i<=10){
		System.out.println(i);
		i=i+1;
	}
	System.out.println("**********");
//	for loop print 1 t0 10
	for(i=1;i<=10;i++){
		System.out.println(i);
	}
//	print 10 to 1
	System.out.println("*******");
	for( int k=10;k>=1;k--)
	{
		System.out.println(k);
	}

}

}
