package assignment_9;

import java.util.Scanner;

public class Question15_CataAndDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Question-15

      Print true if the string "cat" and "dog" appear the same number of times in the given string word.

       Sample Output:

          input: catdog
          output: true

          input: catcat
          output: false

          input: cat-cheetah-dog-cat
          output: false 
          
          */
		Scanner scan= new Scanner(System.in);
		String word=scan.next();
		int word1=word.length();
		int countCat=0;
		int countDog=0;
		for(int i=0 ; i<= word1-3 ;i++) {
			if(word.substring(i,i+2).equals("cat")){
			countCat++;
			}
		
			}
		for(int i=0 ; i<= word1-4 ;i++) {
			if(word.substring(i,i+3).equals("dog")){
				countDog++;
			}
		
		}
		System.out.println(countCat == countDog);
	}

}
