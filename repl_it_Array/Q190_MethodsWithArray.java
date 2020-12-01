package repl_it_Array;

import java.util.Arrays;

public class Q190_MethodsWithArray {

	 public static int[] mergR(int[] a,int[] b) {
		    
		 int[] k=new int[a.length+b.length];
		 
		   for(int i=0 ; i<a.length ; i++) {
			   k[i]=a[i];
			   
		   }
		   int count=0;
		   
		   for(int j=a.length ; j<k.length ; j++) {
			   k[j]=b[count];
			   count++;
		   }
		   return k;
		    
	  }//end mergR
	  
	  public static void main(String[] args) 
	  {
		  int[] x = {1,2,6};    int[]y={3,2,8,4};
	   System.out.println(Arrays.toString(mergR(x, y)));
	  }
}
