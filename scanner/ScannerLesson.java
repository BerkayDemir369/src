package scanner;

import java.util.Scanner;

public class ScannerLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create scanner object
		Scanner scan =new Scanner(System.in);
		
		// scan is the variable name you can put whatever you want 
		// in below case we are calling it scan
		//Scanner is data type,scan is the name,new Scanner(System.in) is the value
		
		System.out.println("What is your name : ");
		//String name ="Berkay";
		String name = scan.next();
		System.out.println("My name is " + name);
		
    //*****************************************************************
		System.out.println();
		System.out.println("What is birth year : ");
		
		int birthYear=scan.nextInt();
		int age=2020-birthYear;
		
		System.out.println("My age is " + age);
		
		System.out.println("What is you height ? ");
		double height=scan.nextDouble();
		System.out.println("My height is " + height);
		
		
		
		
		
	}

}
