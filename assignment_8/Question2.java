package assignment_8;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       cube();
		
	}
	public static void cube() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scan.nextInt();
		int cube=number*number;
		System.out.println(cube);
		
	}

}
