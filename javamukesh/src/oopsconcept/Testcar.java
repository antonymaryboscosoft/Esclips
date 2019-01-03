package oopsconcept;
//method overriding
public class Testcar {
// when same method is present in parent class as well as child class  with the same name
	//and same number of argument is call method overriding
	public static void main(String[] args) {
		Bmw b = new Bmw();
		// this is called compile time polymorphism
		b.start();
		b.stop();
		b.theftsafty();
		
		System.out.println("*********");
Car c = new Car();
c.start();
c.stop();
	
	System.out.println("*********");
	
	
	Car c1 = new Bmw();// child class obj can be refered by parent class reference variable 
	//---> called dynamic polymorphism or run time polymorphism
	c1.start();
	c1.stop(); 
	

	}
}
