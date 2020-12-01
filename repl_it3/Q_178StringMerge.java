package repl_it3;

public class Q_178StringMerge {

	public static String mergeStrings(String one, String two) {

		/*
		 * When gears merge and work together, one teeth from each one goes in order.
		 * Write a method mergeStrings hat will return the strings merged, one letter at
		 * a time, starting with one. Please note one and two can be of different
		 * lengths. Please look at below examples:
		 * 
		 * s1 ==> "12345" s2 ==> "abcde" 
		 * mergeStrings(s1,s2) ==> "1a2b3c4d5e"
		 */

		String merged = "", longerStr = "";
		int shorterCharCNT = 0;

		if (one.length() > two.length()) {

			longerStr = one;
			shorterCharCNT = two.length();

		} else {
			longerStr = two;
			shorterCharCNT = one.length();
		}
		for (int i = 0; i < shorterCharCNT; i++) {
			merged += "" + one.charAt(i) + two.charAt(i);
		}
		merged += longerStr.substring(shorterCharCNT);
		return merged;
	}
}
