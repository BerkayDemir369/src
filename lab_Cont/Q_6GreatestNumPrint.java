package lab_Cont;

import java.util.Arrays;

public class Q_6GreatestNumPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Question-6Write a method that accepts an array and figure 
		 * outwhich is greatest element in the array, 
		 * a and set all the other elements to be that value.
		 *  Print the changed array.
		 *  int[] x = {1,2,3}; = > [3,3,3]
		 *  int[] y = {11,5,9}; = > [11,11,11]
		 *  int[] a = {110,5,98,0,1200,11,-4}; = > [1200,1200,1200,1200,1200,1200,1200]*/
		
		int[] x = {1,2,3};
		System.out.println(Arrays.toString(greatest(x)));
	}

	public static int[] greatest(int[] arr) {
		int max=arr[0];
		
		for(int i =0 ; i<arr.length-1 ; i++) {
			
			if(arr[i+1]>max) {
				max=arr[i+1];
				
			}
			
		}
		for(int i =0 ; i<arr.length; i++) {
			arr[i]=max;
		}
		return arr;
	}
}
