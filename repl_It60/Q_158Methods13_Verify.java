package repl_It60;

import java.util.Scanner;

public class Q_158Methods13_Verify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    String numStr = scan.next();
		    printDataTypes(numStr);
		  }
		  
		  public static void printDataTypes(String numStr){
		    long num = 0;
		    try{
		       num = Long.valueOf(numStr);
		       System.out.println(num+" can be fitted in:");
		       if(num>=-128 && num<=127){
		            System.out.println("* byte");
		        }
		        //WRITE YOUR CODE HERE
		        
		        
		        //DO NOT CHANGE        
		    }catch(Exception e){
		       System.out.println(numStr+" can't be fitted anywhere.");
		    }
		  }
	

}
