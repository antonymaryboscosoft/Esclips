package javamukesh;

import java.util.ArrayList;

public class ArrayConcept {
	public static void main(String[] args) {
		
// array is store the similar data type value in a array variable
//		Dis-adv of array
//		1.size is fixed -->static array -->to overcome this prb 
//		--> we use collection - arraylist, hashtable --> dynamic arry
//		2.store only similar data type --> to overcome  -> we use object array.
//		1. int array
		int i[]= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[1]);
		System.out.println(i.length); //print size/length of the array
		
//		print all the value of the array	
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
		}
//		2.double array
		double d[]= new double[3];
		d[0] = 22.22;
		d[1]= 11.1;
		d[2]= 23.11;
		System.out.println(d[2]);
		
//		3.char array
		char c[] = new char[3];
		c[0]= 'a';
		c[1]= 'b';
		c[2]='c';
		System.out.println(c[2]);
		
//		4. boolean array
		boolean b[]= new boolean[2];
		b[0]= true;
		b[1]= false;
		System.out.println(b[1]);
		
//		5.String array
		 String s[] = new String[3];
		 s[0] = "hellow";
		 s[1]= "world";
		 s[2]= "java";
		 
		 for(int k=0;k<s.length;k++){
			 System.out.println(s[k]);
		 }
//			for loop advance for each
			ArrayList<String> list=new ArrayList<String>();  
			   list.add("vimal");  
			   list.add("sonoo");  
			   list.add("ratan");  
			  
			   for(String s1:list){  
			     System.out.println(s1);  
			   }  
			   //*********
			   int arr[]={12,13,14,44};  
			   
			   for(int i1:arr){  
			     System.out.println(i1);  
			   }  
			   
			   System.out.println("*********");
//			   6.Object array (Object is class)  is use to store diff data type values
			   Object ob[]= new Object[5];
			   ob[0]= "tom";
			   ob[1]= 'm';
			   ob[2]= 1/1/1990;
			   ob[3]=22.3;
			   ob[4]= "london";
			   for(int j=0;j<ob.length;j++){
				   System.out.println(ob[j]);
			   }
	}

}