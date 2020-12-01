package repl_it2;

import java.util.Scanner;

public class Q_66MergeThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
	    String word1=scan.next();
	    String word2=scan.next();
	    
	    if(word1.length()==3 && word2.length()==3) {
	    	System.out.print(word1.charAt(0)+ "" + word2.charAt(0));
	    	System.out.print(word1.charAt(1)+ "" + word2.charAt(1));
	    	System.out.print(word1.charAt(2)+ "" + word2.charAt(2));
	    	
	    	
	    	
	    }else {
	    	System.out.println("cannot merge");
	    }
	}

}
