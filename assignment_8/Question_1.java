package assignment_8;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        
		
		plus();
		
	}

	public static void plus() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=scan.nextInt();
		System.out.println("Enter second number:");
		int num2=scan.nextInt();
		int sum=num1+num2;
	     System.out.println("result is: " + sum);
	
		
	}
}
