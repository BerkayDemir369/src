package repl_it_Array;

import java.util.Scanner;

public class Q172_Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
		                            };
		    int result = 0;
		    
		    result=(matrix[0][0] + matrix[1][1] + matrix[2][2])-
		    		(matrix[0][2] + matrix[1][1] + matrix[2][0]);
		    		
		    // FINAL PRINT
		    System.out.println(Math.abs(result));
	}

}
