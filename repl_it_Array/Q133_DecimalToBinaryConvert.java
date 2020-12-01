package repl_it_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q133_DecimalToBinaryConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 int decimal = input.nextInt();
		 int[] binary = new int[8];
		    
		  int result = decimal;
	      int arrayLength = binary.length - 1;
	      while (result != 0) {
	         if (result % 2 == 0) {
	            binary[arrayLength] = 0;
	         } else {
	            binary[arrayLength] = 1;
	         }
	         arrayLength--;
	         result /= 2;
	      }
	    System.out.println(Arrays.toString(binary));
	}

}
