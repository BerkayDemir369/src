package repl_it_Array;

import java.util.Scanner;

public class Q135Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
			    Scanner input = new Scanner(System.in);
			    String sentence = input.nextLine();
			    
			    //type your code below
			   String[] s=sentence.split(" ");
			   for(String eachword: s) {
				   System.out.println(eachword);
			   }
			    
	}

}
