package repl_it_Array;

import java.util.Scanner;

public class Q174_UniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i=0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    printUniqueNumbers(nums);
		  }
	 public static void printUniqueNumbers(int[] nums){
		    //WRITE YOUR CODE HERE
		 
		 int count=0;
		 for(int i=0; i<nums.length ; i++) {
			 for(int j=0 ; j<nums.length ; j++) {
				 if(nums[i]== nums[j]) {
					 count++ ;
				 }
			 }
			 
			 if(count==1) {
				 System.out.println(nums[i]);
			 }
			 
			 count=0;
		 }
		 
		 
		 
		 
		 
		 
	}

}
