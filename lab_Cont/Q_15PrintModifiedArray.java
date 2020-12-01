package lab_Cont;

import java.util.Arrays;

public class Q_15PrintModifiedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Question-15Write a method that accepts an array and
		 *  swap the first and last element in the array.
		 *  Print the modified arrayint[] x = {1,2,3,4} = > [4,2,3,1]
		 *  int[] y = {1,2,3}  = > [3,2,1]
		 *  int[] z= {8,6,7,9,5} = > [5,6,7,9,8]
		 *  */
		
		
		int[] x = {1,2,3,4,8,9}; //= > [4,2,3,1]
		
		System.out.println(Arrays.toString(swapEnds(x)));
	}

	public static int[] swapEnds(int[] arr) {
		int temp=0;
		temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		return arr;
		
	}
}
