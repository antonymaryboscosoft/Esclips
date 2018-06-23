package oopsconcept;
//method overriding
public class Testcar {
// when same method is present in parent class as well as child class  with the same name
	//and same number of argument is call method overriding
	public static void main(String[] args) {
		Bmw b = new Bmw();
		// this is called compile time polymorphism
		b.start();
		b.theftsafty();
		
		System.out.println("*********");
Car c = new Car();
c.start();
c.stop();
	}

}
