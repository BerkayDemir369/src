package repl_it2;

import java.util.Scanner;

public class Q_68verifyContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    String sentence = scan.nextLine();
	    //WRITE YOUR CODE HERE
	    boolean b1=sentence.contains(word);
	    System.out.println(b1);
	    		
	    
	}

}
