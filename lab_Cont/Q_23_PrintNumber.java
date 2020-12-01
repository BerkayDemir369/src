package lab_Cont;

import java.util.Arrays;

public class Q_23_PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Question-23
		 * Write a method that accepts a number and create and prints 
		 * a new array of lengthnumber, containing the numbers 0,1,2,...number-1.
		 * fizzArray(4) ->[0, 1, 2, 3]
		 * fizzArray(1) ->[0]
		 * fizzArray(10) ->[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]*/
		System.out.println(Arrays.toString(fizzArray(8)));
	}
	
	public static int[] fizzArray(int x) {
		
		int[] array = new int[x];
		
		for(int i=0;i<array.length;i++) {
			array[i]=i;
		}
		
		return array;
	}

}
