package repl_It60;

import java.util.Scanner;

public class Q_146MethodsSimpleCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     plus();
	    
	  }
	  
	  public static void plus(){
	     
	    //your code here
		  Scanner scan=new Scanner(System.in);
		 
		  int num1=scan.nextInt();
		 
		  int num2=scan.nextInt();
		  int result=num1+num2;
		  System.out.println("result: " + result);
	}

}
