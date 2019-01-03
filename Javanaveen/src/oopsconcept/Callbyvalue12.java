package oopsconcept;

public class Callbyvalue12 {
	int p ; // global variables 
	int q ;
// call by value or pass the value to another variable
	//call by reference not in java by achieved using obj reference
	public static void main(String[] args) {
		Callbyvalue12 obj = new Callbyvalue12();
		int x = 10;
		int y = 20;
		obj.test(x, y);
		
		obj.p= 30;
		obj.q = 50;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
public int test(int a , int b){
	int c = a+b;
	System.out.println(c);
	return c;
}
public void swap(Callbyvalue12 t){
	int temp;
	temp = t.p;  //temp =30
	t.p= t.q; //t.p = 50
	t.q= temp;//t.q= 30
	
	
}
}
