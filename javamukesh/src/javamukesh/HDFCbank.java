package javamukesh;

public class HDFCbank  implements Usbank{
// class is implementing any interface then it madatory to define/overide all the methods of interface.
	public void credit(){
		System.out.println("hdfcbank credited");
		
	}
	public void debit(){
		System.out.println("hdfcbank Debited");

	}
	public void transfermoney(){
		System.out.println("hdfcbank transfermoney");

	}
	public void eduloan(){
		System.out.println("hdfc eduloan");
	}
	public void Homeloan(){
		System.out.println("hdfc homeloan");
	}

}
