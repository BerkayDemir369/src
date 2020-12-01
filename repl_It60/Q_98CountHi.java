package repl_It60;

import java.util.Scanner;

public class Q_98CountHi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    int counter=0;
	    int charCount=str.length();
	    
	    for(int i=0 ; i<=charCount-2 ; i++) {
	    if(str.substring(i,i+2).equals("hi")) {
	    	counter ++;
	    }
	    }
	    System.out.println(counter);
	}

}
