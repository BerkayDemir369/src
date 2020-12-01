package exercise;

import java.util.Scanner;

public class LargestNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Given a 2d array of ints, find the biggest number(int) 
		 * in the array and print it.*/
		
		    Scanner inp = new Scanner(System.in);
		    int rows = inp.nextInt(), cols = inp.nextInt();
		    int[][] arr = new int[rows][cols];
		    for(int i=0 ;i<=rows-1;i++)
		    {
		      for(int j=0 ;j<=cols-1;j++)
		      {
		        arr[i][j]=inp.nextInt();
		      }//end for cols
		    }//end for rows
	
		    int max =arr[rows][cols];
		    
		    for(int i=0 ; i<rows ; i++) {
		    	
		    	for(int y=0 ; y<cols ;y++) {
		    		if(arr[i][y]>max) {
		    			max=arr[i][y];
		    			
		    		}
		    		
		    	}
		    }
		    System.out.println(max);
	}

}
