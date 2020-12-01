package repl_It60;

import java.util.Scanner;

public class Q_61TernaryOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
              // print greater number
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number1:");
			int num1 = scan.nextInt();
			System.out.println("Enter number2:");
			int num2 = scan.nextInt();
			//WRITE YOUR CODE HERE
			int num3=(num1>num2)? num1 :num2 ;
			System.out.println(num3);
	}

}
