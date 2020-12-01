package repl_it2;

import java.util.Scanner;

public class Q_65_DublicateIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //YOUR CODE HERE
	    String replace=word1.replaceAll(word1, word2);
	    String replace2=word2.replaceAll(word2,word1);
	    System.out.println(word1+ word2 +replace + replace2);
	}

}
