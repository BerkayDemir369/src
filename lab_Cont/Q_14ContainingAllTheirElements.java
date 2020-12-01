package lab_Cont;

import java.util.Arrays;

public class Q_14ContainingAllTheirElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Question-14Write a method that accepts 2 arrays and prints
		 *  a new array containing alltheir elements
		 *  int[] x = {1,2}    int[]y={3,4}  = > [1,2,3,4]
		 *  int[] x = {4,4}    int[] y = {2,2}  = > [4,4,2,2]
		 *  int[] x = {9,2}    int[] y = {3,4}  = > [9,2,3,4]
		 *  */
		int[] x = {1,2,6};    int[]y={3,2,8,4};
		int[] k = new int[x.length+y.length];
		
		for(int i=0 ; i<x.length; i++) {
			k[i]=x[i];
			
		}
		int a=0;
		for(int j=x.length ; j<k.length ; j++) {
			k[j]=y[a];
			a++;
		}
		System.out.println(Arrays.toString(k));
	}
	}

	
