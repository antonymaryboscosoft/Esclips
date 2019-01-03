package Javaselenium;

public class Loopsconcept {

	public static void main(String[] args) {
	
		//1. While loop
		//dis it will generate infinity loop if you don't give increment /decrement part 
		int i = 1; //initialization
		while(i<=10){ // conditional part
			System.out.println(i);
			i=i+1; // increment or decrement part 
			
		}
		System.out.println("=========");
		//2. for loop   print 1 to 10 
		 for (int j=1 ; j<= 10; j++){
			 System.out.println(j);
		 }
		 System.out.println("*******");
		 //print 10 to 1
		 for(int k =10; k>=1; k --){
			 System.out.println(k);
		 }
		 System.out.println("*******");
		 
		 for(int m =10; m>=-10; m --){
			 System.out.println(m);
		 }
	}
	

}
