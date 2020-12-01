package day26_Array_Part3;

import java.util.Random;

public class MethodArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
          printArray(3);
		
		
	      }
	
	
	public static int[] createArray(int arraySize) {
		
		
		Random rn  = new Random();
		
		int[] myArray = new int[arraySize];
		
		for(int i=0;i<myArray.length;i++) {
			
			myArray[i] = rn.nextInt(100);
			
		}
		
		return myArray;
		
		
	}
	
	
	public static void printArray(int number) {
		
	
		
		for(int value : createArray(number)){
			System.out.println(value);
		}
		
	
	
	}

}
