package lab_Cont;

import java.util.Arrays;

public class Q_8Contain2or3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Question-8Write
		 *  a method that accepts an array and prints true 
		 *  if it contains a 2 or a 3*/
//		        int[] x = {2,5};  = > true
//				int[] y = {4,3};  = > true
//				int[] z = {4,5};  = > false
		
		int[] z = {4,5};
		System.out.println(contains(z));
	}

	public static boolean contains(int[] arr) {
		
		for(int value : arr) {
		if(value ==3 || value==2) {
			return true;
		}
			
		
		}
		return false;
	}
}

