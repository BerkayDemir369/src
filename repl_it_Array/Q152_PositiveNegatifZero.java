package repl_it_Array;

import java.util.Scanner;

public class Q152_PositiveNegatifZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
	    
	    plus_minus(arr);
	  }//end main
	
	public static void plus_minus(int[] arr1) {
		int counPositive=0;
		int countNegative=0;
		int countZero=0;
		
		for(int i=0 ; i<arr1.length ; i++) {
			if(arr1[i]==0) {
				countZero++;
			}else if(arr1[i]>0) {
				counPositive++;
			}else if(arr1[i]<0) {
				countNegative++;
			}
		}
		System.out.println("positives:"+counPositive + ", negatives:" + countNegative
				+", zeros:" + countZero);
		
	}

}
