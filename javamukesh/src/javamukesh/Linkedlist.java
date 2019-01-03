package javamukesh;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	int id;  
	String name,author,publisher;  
	int quantity;  
	public Linkedlist(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}
	
	
	public static void main(String[] args) {  
	    //Creating list of Books  
	    List<Linkedlist> list=new LinkedList<Linkedlist>();  
	    //Creating Books  
	    Linkedlist b1=new Linkedlist(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Linkedlist b2=new Linkedlist(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Linkedlist b3=new Linkedlist(103,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to list  
	    list.add(b1);  
	    list.add(b2);  
	    list.add(b3);  
	    //Traversing list  
	    for(Linkedlist b:list){ 	
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }  
	}  
}
