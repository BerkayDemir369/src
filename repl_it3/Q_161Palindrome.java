package repl_it3;

import java.util.Scanner;

public class Q_161Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Complete a method isPalindrome() that will check if number is a palindrome.
		 * Print your result as a boolean (true or false). Do not convert int into a
		 * string!
		 */

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		isPalindrome(num);
	}

	public static void isPalindrome(int num) {
		 // WRITE YOUR CODE HERE
         // 1254 --> 4 5 2 1
		 // 1254 % 10 --> 4 
		 // 1254 / 10 --> 125
		 // 125 % 10--> 5
		 //4 * 10 + 5 --> 45
		 //12 % 10 --> 2
		 //45 * 10 + 2 --> 452
		 // 12 % 10 -->2
		 // 12 / 10 --> 1
		 // 452 * 10 + 1-->4521
		
		int temp = num;
		int newNum = 0;
         // we will keep dividing as lond as we do not get 0
		while (temp != 0) {
			newNum = newNum * 10 + temp % 10;
			// System.out.println("newNum " + newNum + " temp " + temp);
			/*1254
			newNum 4 temp 1254 first loop
			newNum 45 temp 125  second loop
			newNum 452 temp 12   third loop
			newNum 4521 temp 1    fourth loop and stop
			false */
			temp = temp / 10;

		}
		System.out.println(newNum == num);
	}
}