package repl_It60;

import java.util.Scanner;

public class Q_97CountJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Return the number of times that the string "java" appears anywhere in the given string word.

              Example:
              input: javaxjava
              output: 2

             Example:
             input: javaxjavaapplepearjavaegg
             output: 3
             
             */
		
		Scanner scan= new Scanner(System.in);
	    String word = scan.next();
	    int charCount=word.length();
	    int counter=0;
	    
	    for(int i=0 ; i<=charCount-4 ; i++) {
	    	
	    	//if(word.substring(i,i+4).equals("java")) {
    		//counter++;
	    	String current4=word.substring(i,i+4);
	    	if(current4.equals("java")) {
	    		counter++;
	    	}
	    }
	    System.out.println(counter);
	}

}
