package repl_it2;

import java.util.Scanner;

public class Q_23FoorLoops5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    //write your code below
		    
		   
		    for(int i=0 ; i<=word.length()-1 ; i++) {
		    	 char letter=word.charAt(i);
		    	if(letter=='a' || letter=='e'  || letter=='o' || letter=='u') {
		    		System.out.println(letter);
		    		
		    	}
		    }System.out.println();
		    
	}

}
