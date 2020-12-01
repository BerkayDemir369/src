package repl_it_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q130_ArraysShiftLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. You may modify and print the given array, or print a new array.
           Example: 
          input: 6, 2, 5, 3
          output: [2, 5, 3, 6]*/
		
		  Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i = 0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    //WRITE YOUR CODE HERE
		    
		    int temp =nums[0];
		    for(int i = 0; i < size-1; i++){
			      nums[i] =nums[i+1];
			    }
		    nums[size-1] =temp;
		    
		    System.out.println(Arrays.toString(nums));
		    
		    
//		    int[] numsShifted = new int[size];
//		    for(int i=0 ; i<size-1 ;i++) {
//		    	numsShifted[i] =nums[i+1];
//		    	
//		    }
//		    numsShifted[size-1] = nums[0];
//		    System.out.println(Arrays.toString(numsShifted));
		    
		    
	}

}
