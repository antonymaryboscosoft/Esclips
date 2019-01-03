package javaclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ExampleArrayListOperations {

	public static void main(String[] args) throws IOException {
		 ArrayList<String> players = new ArrayList<String>();
	        
	        players.add("Pele");
	        players.add("Maradona");
	        int choice = 0;
	        
	        do {
	        
	            System.out.println("\nArrayList Operations Demo: Building Soccer Team");
	            
	            System.out.println("0 : Display players list");
	 
	            System.out.println("1 : Add player");
	            System.out.println("2 : Remove player");
	            System.out.println("3 : Change player");
	            System.out.println("4 : Exit");
	            
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            choice = Integer.parseInt(br.readLine());
	            
	            String name;
	            int position;
	            
	            switch(choice){
	            case 0:
	                System.out.println("\nPlayers currently in ArrayList are " );
	                Iterator<String> it = players.iterator();
	                while(it.hasNext()){
	                    System.out.println(it.next() + " ");
	                }
	                break;
	            case 1:
	                System.out.println("Enter player name");
	                name = br.readLine();
	                System.out.println("Enter position in list");
	                position = Integer.parseInt(br.readLine());
	                players.add(position-1, name);
	                break;
	            case 2:
	                System.out.println("Enter player name to remove");
	                name = br.readLine();
	                players.remove(name);
	                break;
	            case 3:
	                System.out.println("Enter position in list");
	                position = Integer.parseInt(br.readLine());
	                System.out.println("Enter player name");
	                name = br.readLine();
	                players.set(position-1, name);
	                break;
	            default:
	                System.out.println("Exiting program");
	                return;
	            }
	            
	        }while(choice < 4 && choice >= 0);
	    
	 
	
	

}}
