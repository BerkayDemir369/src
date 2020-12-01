package repl_it2;

import java.util.Scanner;

public class Q_64_PrintLastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    System.out.println(word.charAt(word.length()-1));
	}

}
