package repl_it_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q109_Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*T      The code provided in your main method will take in five Strings and 
 *       save them into an array called arr.  Print out the first three letters of each
 *       element of arr, one per line. 
 *         You can assume that every element of arr is at least 3 letters long.
 *         
 *         Example:
arr         -> ["apple", "banana"] 
 pr          ints: app
              ban
 *         */
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		}
		//leave above alone! :)   
		//assume you have String array of 5 items 
		//write your code below
		str(arr);
	}

	public static void str(String[] s) {
		
		for(int i=0 ; i<s.length; i++) {
			System.out.println(s[i].substring(0,3));
			}
		
		}
	
}
