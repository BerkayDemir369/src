package lab_Cont;

import java.util.Arrays;

public class Q_5Rotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         /* 
          *Write a method that accepts an array and prints 
          *an array with the elements"rotated left”
          **/
          int[] x = {1,2,3}; // = > [2,3,1]
          int[] y = {17,12,10,8};// = > [12,10,8,17]
          int[] a = {7,0,0};  // = > [0,0,7] 
		
		System.out.println(Arrays.toString(rotatedLeft(x)));
	}

	public static int[] rotatedLeft(int[] arr) {
		int x=arr[0];
		for(int i=0 ; i<arr.length-1 ;i++) {
			arr[i] =arr[i+1];
			
		}
		arr[arr.length-1]=x;
		return arr;
	}
}
