package assignment_8;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		next3(5);
	}
	public static void next3(int num1) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		num1=scan.nextInt();
		
		int num2=(num1 + 1); 
		int num3=(num1+2);
		int num4=(num1+3);
		System.out.println(num2 + " " + num3 + " " + num4 );
	}

}
