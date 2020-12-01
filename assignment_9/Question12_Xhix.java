package assignment_9;

import java.util.Scanner;

public class Question12_Xhix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.

      Sample output:

     input: xHiX
     output: Hi

     input: apple
     output: apple

     input: xUxL
     output: UxL

     input: JavaX
     output: Java
     
     */
		
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if(word.substring(0,1).equalsIgnoreCase("X")) {
	    	word=word.substring(1);
	    }
		if(word.substring(word.length()-1).equalsIgnoreCase("X")) {
			word=word.substring(0,word.length()-1);
		}
		System.out.println(word);
	}

}
