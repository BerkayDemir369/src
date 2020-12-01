package lab_Cont;

import java.util.Arrays;

public class Q_11_3ToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Question-11Write a method that accepts an array,
		 *  and if there is a 2 in the array immediatelyfollowed by a 3,
		 *   set the 3 element to 0. Print the changed Array
		 *   int[] x = {1,2,3}  = > [1,2,0]
		 *   int[] x = {2,3,5}  = > [2,0,5]
		 *   int[] x = {1,2,1}  = > [1,2,1]
		 *   int[] x = {11,2,13,3,2}  = > [11,2,13,3,2]*/
		int[] x = {1,2,3};
		System.out.println(Arrays.toString(changedArray(x)));
	}

	public static int[] changedArray(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]==2 && arr[i+1]==3) {
				arr[i+1]=0;
				
			}
			
		}
		return arr;
	}
}
