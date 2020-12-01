package assignment_9;

import java.util.Scanner;

public class Question_5WordMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word: ");
	    String word1=scan.next();
	    System.out.println("Enter second word: ");
	    String word2=scan.next();
	    
	    if(word1.length()==3 && word2.length()==3) {
	    	for(int i=0 ; i<word1.length() ; i++) {
	    		System.out.print(word1.charAt(i));
	    		System.out.print(word2.charAt(i));
	    	}
	    	
	    	
	    	
	    }else {
	    	System.out.println("cannot merge");
	    }
		
	}

}
