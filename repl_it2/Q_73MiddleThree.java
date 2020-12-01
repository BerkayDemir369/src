package repl_it2;

import java.util.Scanner;

public class Q_73MiddleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word=scan.next();
		
		if(word.length()%2==1 && word.length()>=5) {
		
			
			System.out.print(word.charAt(word.length()/2-1));
			System.out.print(word.charAt(word.length()/2));
			System.out.print(word.charAt(word.length()/2+1));
			
		}else {
			System.out.println("invalid");
		}
	}

}
