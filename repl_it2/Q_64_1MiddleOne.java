package repl_it2;

import java.util.Scanner;

public class Q_64_1MiddleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	
		String word = scan.next();
		int charCNT = word.length();
		if (charCNT == 1) {
			System.out.println(word + word + word);

		} else if (charCNT == 2) {
			System.out.println(word + word);

		} else if (charCNT >= 3) {
			int middleIndex = charCNT / 2;
			if (charCNT % 2 == 1) {
				System.out.println(word.charAt(middleIndex));
			} else {
				System.out.println(word.substring(middleIndex - 1, middleIndex + 1));
			}
		}
	}

}
