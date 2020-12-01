package lab_Cont;

import java.util.Arrays;

public class Q_9DoubleTheLenghtZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Question-9Write a method that accepts an array 
		 * and prints a new array with double
		 *  the lengthwhere its last element is the same as the original array,
		 *  
		 * int[] x = {4,5,6};  = > [0,0,0,0,0,6]*/
		int[] x = {4,5,6};
		System.out.println(Arrays.toString(makeLast(x)));
		
		
	}

	public static int[] makeLast(int[] arr) {
		
		int[] newArray= new int[2*arr.length];
		newArray[newArray.length-1]=arr[arr.length-1];
		return newArray;
	}
}
