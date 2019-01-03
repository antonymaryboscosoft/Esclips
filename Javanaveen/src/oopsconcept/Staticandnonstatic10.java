package oopsconcept;

public class Staticandnonstatic10 {
String name = "tom"; //non static global var
static int age= 25; // static global var
public static void main(String[] args){
	// how to call static variable and method
	//1.Direct calling
	sum();
	//2.Calling by class name
	Staticandnonstatic10.sum();
	
	System.out.println(age);
	System.out.println(Staticandnonstatic10.age);
	
	//How to call non static method
	Staticandnonstatic10 obj = new Staticandnonstatic10();
	obj.sendmail();
	System.out.println(obj.name);
	
	//static method can access obj reference? yes
	obj.sum(); //give one warning
	
	
}

public void sendmail(){
	System.out.println("send mail method");
}
public static void sum(){
	System.out.println("sum method");
}
	
}
