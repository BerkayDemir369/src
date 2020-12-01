package repl_it_Array;

import java.util.Scanner;

public class Q154_isPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			    Scanner inp = new Scanner(System.in);
			    int size = inp.nextInt();
			    
			    int[] arr = new int[size];
			    for(int i=0 ;i<=size-1;i++)
			    {

			        arr[i]=inp.nextInt();
			    }
			    //#2 Your code here
			    for(int eachNum: arr) {
			    	isPos(eachNum);
			    }
			  
			  }

			  public static void isPos(int num)
			  {
			    //#1 your code here
				if(num>0) {
					System.out.println("positive");
				}else {
					System.out.println("not positive");
				}
			   
	}

}
