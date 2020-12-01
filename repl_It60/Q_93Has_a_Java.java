package repl_It60;

import java.util.Scanner;

public class Q_93Has_a_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
		 *  such as with "javaxxx" or "xjavaxx" but not "xxjavaxx".
		 *   The string may be any length, including 0word = . 
          Example:
          input: javapython
         output: true
         */
		boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	     System.out.println(word.startsWith("java") || word.substring(1).startsWith("java"));
	   
	}

}
