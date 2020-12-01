package lab_Cont;

import java.util.Arrays;

public class Q_7FirstAndLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*Question-7
        * Write a method that accepts 2 arrays and prints the second array 
        * containing thefirst and last elements from the first array.
        * int[] x = {1,2,3};  int[] y = {};              = > [1,3]
        * int[] a = {7,4,6,2};int[] b = {};               = > [7,2]
            */
		int[] x = {1,2,3};
		 int[] y = {};
		
		System.out.println(Arrays.toString(elements(x,y)));
	}
	public static int[] elements(int[] arr1,int[] arr2) {
		arr2= new int[2];
		arr2[0]= arr1[0];
		arr2[1]=arr1[arr1.length-1];
		
		return arr2;
	}

}
