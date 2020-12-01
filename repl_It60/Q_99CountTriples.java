package repl_It60;

import java.util.Scanner;

public class Q_99CountTriples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*We'll say that a "triple" in a string is a char appearing three times in a row.
		 *  Print out the number of triples in the given string. The triples may overlap.
              Example:
              input: abcXXXabc
              output: 1

             Example:
             input: xxxabyyyycd
             output: 3
             */
		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int count = 0 ;
	    //WRITE YOUR CODE HERE
	    int charCount=str.length();
	    
	    for(int i=0 ; i<=charCount-3 ; i++) {
	    	if(str.substring(i,i+1).equals(str.substring(i+1,i+2)) && str.substring(i,i+1).equals(str.substring(i+2,i+3))) {
	    		count++;
	    	}
	   
	    }
		System.out.println(count);
	}

}
