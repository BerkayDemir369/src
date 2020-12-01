package repl_it_Array;

import java.util.Scanner;

public class Q138_ReverseSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		    String reversed = "";
		    //TODO: start your code here
            String[] words=sentence.split(" ");
		    reversed="";
		    for(int i=words.length-1 ; i>=0 ; i--) {
		    	reversed += words[i] + " ";
		    }
		    reversed = reversed.trim();
		    
		    //End your code here. do not modify below statement
		    System.out.println(reversed);
	}

}
