package assignment_9;

import java.util.Scanner;

public class Question_7PrintHalfofTheWordTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program that will print out the first half of the word twice.

         Sample Output:

           input: java
           output: jaja
     */

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word:");
		String word=scan.next();
	
		String repeated=word.substring(0,word.length()/2).repeat(2);
  	     
  	    System.out.println(repeated);
	}

}
