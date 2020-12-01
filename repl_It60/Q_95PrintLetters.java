package repl_It60;

import java.util.Scanner;

public class Q_95PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program that will print out letters in the alphabetic order accordingly
		  to the given range within 2 chars. 
            Example:
              input: A
              input: Z
              output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

           Example:
            input: a
            input: f
            output: abcdef
            */

		 Scanner scan = new Scanner(System.in);
		    char start = scan.next().charAt(0);
		    char end = scan.next().charAt(0);
		    
		for(char letter=start ; letter<=end ; letter++) {
			System.out.print(letter);
		}
	}

}
