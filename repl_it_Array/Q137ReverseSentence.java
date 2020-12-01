package repl_it_Array;

import java.util.Scanner;

public class Q137ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		    //TODO: Type your code below
		    String[] words=sentence.split(" ");
		    
		    for(int i=words.length-1 ; i>=0 ; i--) {
		    	System.out.println(words[i]);
		    }
	}

}
