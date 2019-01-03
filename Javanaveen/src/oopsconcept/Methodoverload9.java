package oopsconcept;

public class Methodoverload9 {
	public static void main(String[] args) {
		
//		Same method diff argument 
//		can't create method inside the method
//		 can be overload the main method like below
		
		Methodoverload9 obj = new Methodoverload9();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
		}
		public static void main(int p){
		}
	
	public void sum(){
		System.out.println("sum method --- zero parameter");
	}
	public void sum(int i){
		System.out.println("sum method ----one input");
		System.out.println(i);
	}
	public void sum(int j ,int k){
		System.out.println("sum method------ two input");
		System.out.println(j+k);
		
	}
}
