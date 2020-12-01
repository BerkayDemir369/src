package repl_it2;

import java.util.Scanner;

public class Q_21FoorLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    //write your code below
		    for(int x=0 ; x<word.length(); x++) {
				  
				   System.out.println(word.charAt(x));
			   }
			   System.out.println();
		   
	}

}
