package repl_it_Array;

import java.util.Arrays;

public class Q208_Populate {

	public static int[] populate(int[] r) 
	{
		int[] k=new int[r.length];
		int a=0;
		for(int j=1; j<=r.length ;j++) {
			k[a]=j;
			a++;
		}
		return k;
	}
	
	public static void main(String[] args) 
	{
	 
	  
    int [] i= new int[5]; 
    i= populate(i) ;
    System.out.println(Arrays.toString(i));
	}
}
