package assignment_8;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		sign1(8);
		
		
	}
	public static void sign1(int sign) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number:");
		sign=scan.nextInt();
		
		if (sign>0) {
			System.out.println("positive");
			
			
		}else if(sign<0) {
			System.out.println("negative");
		}else if(sign==0){
			System.out.println("zero");
			
		}
	}

}
