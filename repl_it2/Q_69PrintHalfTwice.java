package repl_it2;

import java.util.Scanner;

public class Q_69PrintHalfTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word:");
		String word=scan.next();
	
		int halfIndex=word.length()/2;
		String halfWord=word.substring(0,halfIndex);
		System.out.println(halfWord + halfWord);
	}

}
