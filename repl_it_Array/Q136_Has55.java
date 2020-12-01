package repl_it_Array;

import java.util.Scanner;

public class Q136_Has55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		    int[] nums = {1, 5, 5, 1, 1};
		  
		    
		    //TODO Type your code below:
		    
		    boolean result=false;
		    
		    for(int i=0 ; i<=nums.length-2 ;i++) {
		    	
		    	if(nums[i]==5 && nums[i+1]==5) {
		    		System.out.println(true);
		    		break;
		    	}
		    }
		    System.out.println(result);
	}

}
