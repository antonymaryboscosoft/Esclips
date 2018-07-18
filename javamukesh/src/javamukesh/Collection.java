package javamukesh;
//collection c17

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
	public static <E> void main(String[] args) {

int a[] = new int[3]; // static array ..... size is fixed
a[0]= 20;
a[1]=10;
a[2]=40;

//dynamic array ---- array list
//1. can contain duplication value
//2.maintain insertion order list
//synchronize
//4.allow randam acess to fetch the element bcz it store the value on the basis of index

// example of non generic and generic 
//1.non-generic(no declar any datatype)

ArrayList arr= new ArrayList();
arr.add(10);//[0]
arr.add(20);//[1]
arr.add("anto");//[2]
System.out.println(arr.size());
arr.add(20);//[3]
arr.add(40);//[4]
System.out.println(arr.size());//size of the array list
System.out.println(arr.get(2));// get the value from the index
//java 1.5 and above only support generic
//2 . generic
ArrayList<Object> arr1= new ArrayList<Object>();
arr1.add(10);//[0]
arr1.add(20);//[1]
arr1.add("anto");//[2]
System.out.println(arr.size());
arr1.add(20);//[3]
arr1.add(40);//[4]
System.out.println(arr.size());//size of the array list
System.out.println(arr.get(2));// get the value from the index
// to print all the  value from the arraylist
//for loop advance for each(one method)
for(Object s1:arr1){
System.out.println(s1);
}
// ex generic
ArrayList<Integer> ar1 = new ArrayList<Integer>();
ar1.add(10);

ArrayList<String> ar2 = new ArrayList<String>();
ar2.add("test");
ar2.add("Automation testing");
System.out.println("******");
//ArrayList<E> ar3 = new ArrayList<E>();

// call Emparray class object
EmpArray e1 =  new EmpArray("anto", 20, "java");
EmpArray e2 =  new EmpArray("madhu", 23, ".net");
EmpArray e3 =  new EmpArray("mani", 25, "php");
//create array list
ArrayList<EmpArray> ar4 = new ArrayList<EmpArray>();
ar4.add(e1);
ar4.add(e2);
ar4.add(e3);

// Iterator to traverse the list
Iterator<EmpArray> it = ar4.iterator();
while(it.hasNext()){
	EmpArray emp = it.next();
	System.out.println(emp.name);
	System.out.println(emp.age);
	System.out.println(emp.dept);
	
}
	
	//add all method
	ArrayList<String> ar5 = new ArrayList<String>();
	ar5.add("test");
	ar5.add("dev");
	ar5.add("design");
	
	ArrayList<String> ar6= new ArrayList<String>();
	ar6.add("java");
	ar6.add("selenium");
	ar6.add(".net");
	
	ar5.addAll(ar6); //add ar6 to ar5
	
	for(String s2:ar5){
		System.out.println(s2);
}

	// removeall method
	ar5.removeAll(ar6);
	for(String s2:ar5){
		System.out.println(s2);
}
	System.out.println("*****");

	//retain method
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("dev");
		ar7.add("design");
		
		ArrayList<String> ar8= new ArrayList<String>();
		ar8.add("test");
		ar8.add("selenium");
		ar8.add(".net");
		
		ar7.retainAll(ar8); // only come value print in ar7,ar8
		
		for(String s3:ar7){
			System.out.println(s3);
		}
	
}}