package day25_Array_Cont;

import java.util.Arrays;

public class Task92TableArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      int[]  numbers = new int[10];
		
		
		for(int i=0;i<numbers.length;i++) {
			
			numbers[i] = i+1;
		}
		
		for(int i=0;i<numbers.length;i++) {
			
			System.out.println(numbers[i] * 19);
		}
		
		System.out.println(Arrays.toString(numbers));
		
	}

}
