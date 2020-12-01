package repl_it_Array;

import java.util.Scanner;

public class Q140_ArraysPrintFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner input = new Scanner(System.in);
		  String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		   
		  int charCount=words.length;
		  for(int i=0 ; i<words.length ;i++) {
			  System.out.println(words[i].substring(0,1) + words[i].substring(charCount-1));
			  
		  }
			 System.out.println();
			 
	}

}
