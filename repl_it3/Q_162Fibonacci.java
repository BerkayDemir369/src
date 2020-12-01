package repl_it3;

import java.util.Scanner;

public class Q_162Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    fib(num);
		  }
		  
		  public static void fib(int num){
		    //WRITE YOUR CODE HERE
			  
			 int num1=0;
			 int num2=1;
			
			 for(int i=2 ; i<=num ; i++) {
				 int num3=num1+num2;
				 
				 num1=num2;
				 num2=num3;
			 }
			  System.out.println(num2);
		    
	}

}
