package repl_It60;

import java.util.Scanner;

public class Q_106PrintVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Inputs:
          String word;

        Write a for loop that will loop through every letter of the input and print out just the vowels.
        Sample input/outputs
        In: howdyho
        output:oo
         */
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String word = inp.nextLine();
		// write your code below

		
		for (int i = 0; i < word.length(); i++) {

			char current = word.charAt(i);

			if (current == 'a' || current == 'o' || current == 'i' || current == 'e' || current == 'u') {

				System.out.print(current);
			}
		}
	}

}
