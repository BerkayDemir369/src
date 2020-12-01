package exercise;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [][] multiplicationTable = new int[10][10];
		 Scanner scan= new Scanner(System.in);
		
		for(int row=1 ; row<=multiplicationTable.length ;row++) {
			
			for(int col=1 ; col<=multiplicationTable.length; col++) {
			 	 multiplicationTable[row-1][col-1]=row*col;
			 	
			}
		}
		System.out.println(multiplicationTable);
	}

}
