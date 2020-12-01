package assignment_9;

import java.util.Scanner;

public class Question_6TooLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program that will reverse a string. 
		 * Your program should reverse a string only 5 characters long. 
		 * If the word is shorter, display message: "Too short!".
		 *  If the word is longer, display the message: "Too long!". 
		 *  Otherwise, reverse this word and print out the result into the console.

     Sample Output:

     input: cat
     output: Too short!


     input: singularity
     output: Too long!


     input: apple
     output: elppa*/

		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    if(word.length()>5) {
				System.out.println("Too long!");
			}
			
			if(word.length()<5) {
				System.out.println("Too short!");
				
				
			}if(word.length()==5) {
				
           for(int i =word.length()-1 ; i>=0 ; i--) {
        	   System.out.print(word.charAt(i));
           }
			System.out.println();	

			}
	}

}
