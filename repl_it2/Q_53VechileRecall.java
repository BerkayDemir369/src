package repl_it2;

import java.util.Scanner;

public class Q_53VechileRecall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		// WRITE YOUR CODE HERE
		System.out.println("Enter vehicle's year:");
		int vechileYear = scan.nextInt();
		
		if (vechileYear >= 1995 && vechileYear <= 1998) {
			System.out.println("Your vehicle needs to be recalled!");
		} else if (vechileYear == 2001 || vechileYear == 2002) {
			System.out.println("Your vehicle needs to be recalled!");
		} else if (vechileYear >= 2004 && vechileYear <= 2006) {
			System.out.println("Your vehicle needs to be recalled!");
		} else if (vechileYear >= 2015 && vechileYear <= 2017) {
			System.out.println("Your vehicle needs to be recalled!");
		} else {
			System.out.println("Your vehicle is fine, enjoy!");
		}
	}

}
