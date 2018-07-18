package javamukesh;
//collection c17
public class EmpArray {

	String name; //global variable
	int age;
	String dept;
	
	EmpArray(String name, int age, String dept){ // local variables
		this.name= name; //means global variable = local variable
		this.age= age;
		this.dept= dept;
	}
}
