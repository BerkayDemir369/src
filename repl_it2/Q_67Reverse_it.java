package repl_it2;

import java.util.Scanner;

public class Q_67Reverse_it {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    if(word.length()>5) {
				System.out.println("Too long!");
			}
			
			if(word.length()<5) {
				System.out.println("Too short!");
				
				
			}if(word.length()==5) {
				
           for(int i =word.length()-1 ; i>=0 ; i--) {
        	   System.out.print(word.charAt(i));
           }
			System.out.println();	

			}
	}

}
