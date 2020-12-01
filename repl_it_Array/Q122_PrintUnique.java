package repl_it_Array;

import java.util.Scanner;

public class Q122_PrintUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Given an array nums with 7 integers every element is repeated twice - 
		 * except one. Find that element and print it to console.

               Example:

                nums -> [1, 1, 2, 3, 4, 3, 4]
                         2
                         */
		Scanner input = new Scanner(System.in);
	    int[] nums = {1, 1, 2, 3, 4, 3, 4};
	    
	    //TODO: write your code below
	    
	    for(int i=1; i<nums.length ; i++) {
	    	int counter=0;
	    	for(int j=0 ; j<nums.length ; j++) {
	    		if(nums[i] == nums[j]) {
	    			counter++;
	    			
	    		}
	    			
	    		
	    		}
	    	if(counter==1) {
    			System.out.println(nums[i]);
	    	}
	    }
	}

}
