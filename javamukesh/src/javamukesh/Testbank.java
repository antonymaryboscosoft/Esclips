package javamukesh;
public class Testbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HDFCbank  b = new HDFCbank();
 b.credit();
 b.debit();
 b.transfermoney();
 b.eduloan();
 b.Homeloan();
 
 System.out.println("********");
 
 //dynamic polymorphism
 //child class obj can be refered parent interface reference variable
 Usbank b1 = new HDFCbank();
b1.credit();
b1.debit();
b1.transfermoney();

 
 
	}

}
