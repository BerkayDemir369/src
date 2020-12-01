package repl_it3;

import java.util.Scanner;

public class Q_191StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*reverse method reverse a string.
         it gets a string and returns it in reverse.

         for example:

         reverse("foo") ==> "oof"

         reverse("student") ==> "tneduts"*/
		
		Scanner scan= new Scanner(System.in);
		String word=scan.next();
		int word1=word.length();
		
		for(int i=word1 ; i>0 ; i--) {
			System.out.print(word.substring(i-1,i));
		}
	}

}
