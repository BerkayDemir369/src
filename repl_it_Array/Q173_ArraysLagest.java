package repl_it_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q173_ArraysLagest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		     Scanner inp = new Scanner(System.in);
		    int rows = inp.nextInt(), cols = inp.nextInt();
		    int[][] arr = new int[rows][cols];
		    for(int i=0 ;i<=rows-1;i++){
		      for(int j=0 ;j<=cols-1;j++){
		        arr[i][j]=inp.nextInt();
		      }//end for cols
		    }//end for rows
		    
		    
		    //TODO write your code below
		    int max= arr[0][0];
		    for(int[] eachArr : arr) {
		    	
		    	for(int eachNum : eachArr) {
		    		
		    		if(eachNum>max) {
		    			
		    			max=eachNum;
		    		}
		    	}
		    }
		    for(int i=0 ; i<=rows-1 ;i++) {
		    	for(int j=0 ; j<=cols-1 ; j++) {
		    		arr[i][j]=max;
		    	}
		    }
		   
		    
		    
		    
		    //FINAL PRINT
		    System.out.println(Arrays.deepToString(arr));
	}

}
