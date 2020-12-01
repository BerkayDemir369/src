package repl_it_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q140_pRINTlAST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
		  String[] words = {"hello", "why", "by", "apple" , "note"};
		   

		    //TODO: Write your code below
		      
			for(int i=0 ; i<=words.length-1 ; i++) {
					System.out.print(words[i].substring(0,1));
					System.out.print(words[i].substring(words[i].length()-1) + ", ");
					
				}
	}

}
