package javamukesh;

public class Contructor {
// constructor can be over loaded
	public Contructor(){
		System.out.println("default constructor");
	}
	public Contructor(int i){
		System.out.println("Single parameter constructor");
		System.out.println("the value of :" +i);
	
	}
	public Contructor(int i , int j){
		System.out.println("Two parameter constructor");
		System.out.println("the value of :" +i);
		System.out.println("the value of :" +j);
	}
	public static void main(String[] args) {
		Contructor obj = new Contructor();
		Contructor obj1 = new Contructor(10);
		Contructor obj2 = new Contructor(10,20);
	}

}
