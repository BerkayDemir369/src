package day19_StringManipulation_Part1;

import java.util.Scanner;

public class Task75_TotalCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter your first name:");  
		String firstName = sc.next();
		
		System.out.print("Enter your last name:");
		String lastName = sc.next();
		
		System.out.println("Total characters in your first and last name is:" +((firstName.length())+lastName.length()) );
		
	}

}
