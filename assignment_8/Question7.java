package assignment_8;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Palindrome();
	}
	public static void Palindrome() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num =scan.nextInt();
		int reversedInteger = 0;
		int remainder, originalInteger;
		
		boolean result=true;
		boolean result2=false;
		
        originalInteger = num;
        

        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(result);
        else
            System.out.println(result2);
   
		
	}

}
