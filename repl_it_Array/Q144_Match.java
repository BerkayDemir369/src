package repl_it_Array;

import java.util.Scanner;

public class Q144_Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner inp = new Scanner(System.in);
		    int rows = inp.nextInt(), cols = inp.nextInt();
		    int[][] arr = new int[rows][cols];
		    for(int i=0 ;i<=rows-1;i++)
		    {
		      for(int j=0 ;j<=cols-1;j++)
		      {
		        arr[i][j]=inp.nextInt();
		      }//end for cols
		    }//end for rwos
		    
		    //your code here
		    
		    int matches = 0;
			//int[] nums= {1,2,2,3,4,5,5};
			
			for(int row=0 ; row<rows ; row++) {
			for(int x=0 ; x<=cols-2 ;x++) {
				
				if(arr[row][x]==arr[row][x+1]) {
					matches++;
				}
			}
			}
				
		    
		    
		    System.out.print("matches: "+matches);
	}

}
