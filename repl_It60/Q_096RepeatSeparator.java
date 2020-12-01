package repl_It60;

import java.util.Scanner;

public class Q_096RepeatSeparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*Given two strings, word and a separator sep , return a big string made of count occurrences of the word,
         separated by the separator string.
        Example:
        input: Word
        input: X
        input: 3
        output: WordXWordXWord
        */
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    
	    String result="";
	    
	    for(int i=1 ; i<=count-1 ; i++) {
	    result += word+separator;
	    }
	    result += word;
	    System.out.println(result);
	}

}
