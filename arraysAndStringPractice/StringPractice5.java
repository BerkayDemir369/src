package arraysAndStringPractice;

public class StringPractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaabbbbcacaaaaaa";

		int count = 0;

		for (String each : str.split("")) {
			if (each.equals("a")) {
				count++;
			}
		}

		System.out.println(count);

	}

}

/*
 * frequency of one character
 * 
 */
