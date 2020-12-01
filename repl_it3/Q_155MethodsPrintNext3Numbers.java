package repl_it3;

import java.util.Scanner;

public class Q_155MethodsPrintNext3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a method called next3 . This method gets an int argument and prints
		 * the next 3 numbers after that number. Call the method from main method and
		 * pass num to it.
		 * 
		 * enter number 1 
		 * next 3 are: 2 3 4
		 * 
		 */
		Scanner inp = new Scanner(System.in);
		System.out.print("enter number");
		int num = inp.nextInt();

		next3(num);
	}

	public static void next3(int num) {
		System.out.println((num + 1) + " " + (num + 2) + " " + (num + 3));
	}
}
