package repl_It60;

import java.util.Scanner;

public class Q_86Party {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
         Ask for the first guest name.
         Then ask does user want to enter one more guest.
         If yes - take input from.
         If not - finish the program and print list of the guests.
         
         output:Guest's list: Nick, Linda
           */
		  Scanner input = new Scanner(System.in);

		    
		    // your code 
		    // ------------------------------------------
		  String name,answer,guestList="";
		  
		 
	    	do {
		    	System.out.println("Please enter guest name:");
		    	name=input.next();
		    	guestList += name ;
		    	
		    	System.out.println("Do you want to enter new guest name:");
		    	answer=input.next();
		    	if(answer.equalsIgnoreCase("yes")) {
		    		guestList+=", ";
		    	}
		    	
		    	
		    	
		    	
		    	}while(answer.equalsIgnoreCase("yes"));
		    	System.out.println("Guest's list: " + guestList);
		    
		   
		    
	}

}
