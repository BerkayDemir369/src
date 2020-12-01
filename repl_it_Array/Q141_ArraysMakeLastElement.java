package repl_it_Array;

import java.util.Arrays;
import java.util.Scanner;



public class Q141_ArraysMakeLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i =0; i < size; i++) {
		    nums[i] = scan.nextInt();
				}
				//WRITE YOUR CODE HERE
		   int[] newNums = new int[size*2];
		   newNums[newNums.length-1] = nums[nums.length-1];
		   System.out.println(Arrays.toString(newNums));
		    
	}

}
