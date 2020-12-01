package repl_it_Array;

import java.util.Arrays;

public class Q205_5Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] int3= {10, 40, 50, 3, 1};
		int[] int4= {11,0,500,44,1101};
				
		System.out.println(Arrays.toString(addElements(int3, int4)));
	}

	 public static int[] addElements(int[] ints1, int[] ints2) {
		    
		    int[] k = new int[5];
		    for(int i=0 ; i<ints1.length ; i++) {
		    	k[i]=ints1[i]+ints2[i];
		    	
		    }
		    return k;
		    
	  }
}
