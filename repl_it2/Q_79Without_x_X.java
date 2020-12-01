package repl_it2;

import java.util.Scanner;

public class Q_79Without_x_X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	   
	    
	    
	    if(word.substring(0,1).equalsIgnoreCase("X")) {
	    	word=word.substring(1);
	    }
		if(word.substring(word.length()-1).equalsIgnoreCase("X")) {
			word=word.substring(0,word.length()-1);
		}
		System.out.println(word);
	}

}
