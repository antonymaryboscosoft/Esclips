package exampearraycrud;

import java.util.ArrayList;

public class Arrayconcept {
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("user 1");
		list.add("user2");
		list.add("user3");
		list.add("user4");
		System.out.println("the array list contain following elements:"+list);
	
		// check the index of the item
		int pos = list.indexOf("user2");
		System.out.println("the index of the item is:"+ pos);
		
		//check if the array list is empty
		boolean check = list.isEmpty();
		System.out.println("Check if the arraylist is empty :" + check);
		// getting the size of the array 
		int size = list.size();
		System.out.println("The size of the array list is :"+size);
		// check if the element include in the array list
		boolean element = list.contains("user5");
		System.out.println("checking the array list contains the object user5:"+element);
	}
	

}
