package javamukesh;

public class LocalandGlobalvariable {
	// global variable ---> class variable
	String name = "anto";
	int age = 23;
	public static void main(String[] args) {
		int i = 10; //local variable for main method
		System.out.println(i);
		
		LocalandGlobalvariable obj = new LocalandGlobalvariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

}
