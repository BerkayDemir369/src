package repl_it_Array;

import java.util.Scanner;

public class Q110_ArraysPrintFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Given a String array words, iterate through each word and print first and 
		 * last letter of each element in separate lines.

            Example:

           words -> ["hello", "why", "by", "apple" , "note"]
           print: 
             ho
             wy
             by
             ae
             ne
*/
		    Scanner input = new Scanner(System.in);
		     String[] words = {"hello", "why", "by", "apple" , "note"};
		   
		    // leave above code alone :)
		    // assume you have String array of 5 items 
		    //and print firt and last char of each items in one line
		    
		    //TODO: Write your code below
		       for(int i=0 ; i<words.length ; i++) {
		    	System.out.print(words[i].substring(0,1));
		    	System.out.println(words[i].substring(words[i].length()-1));
		    }
	}

}
