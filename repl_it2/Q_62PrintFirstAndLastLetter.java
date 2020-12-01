package repl_it2;

import java.util.Scanner;

public class Q_62PrintFirstAndLastLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    System.out.print(word.charAt(0));
		    System.out.print(word.charAt(word.length()-1));
	}

}
