package repl_it2;

import java.util.Scanner;

public class QuestionIfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		    String word = scan.nextLine();
		    String sentence = scan.nextLine();
		    //WRITE YOUR CODE HERE

		    
		    boolean b;
		    b=sentence.contains(word);
				
				
				if(b==true) {
					System.out.println("true");
				}
				else {
					System.out.println("false");
				}

	
	}

}
