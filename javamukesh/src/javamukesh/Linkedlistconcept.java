package javamukesh;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> L1 = new LinkedList<String>();
L1.add("test");
L1.add("seenium");
L1.add("java");
L1.add("Qtp");
//print
System.out.println("The linkedlist is :"+L1);
	
//	add frt
L1.addFirst(".net");
//add last
L1.addLast("Jira");
System.out.println("The linkedlst is:"+L1);
//	get method
System.out.println(L1.get(0));
//set
L1.set(0, "C##");
System.out.println(L1.get(0));
//remove frt and last element
L1.removeFirst();
L1.removeLast();
System.out.println("The linkedlst is:"+L1);

L1.remove(2);
System.out.println("The linkedlst is:"+L1);

// using iterator
System.out.println("*** using iteratoe");
Iterator<String> it = L1.iterator();
while(it.hasNext()){
	System.out.println(it.next());
	
	
}
	}
	

}
