package repl_it3;

import java.util.Scanner;

public class Q_89PrintLastFirstLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    System.out.print(word.substring(0,1).concat(word.substring(word.length()-1,word.length())));
	}

}
