package exercise;

public class Q_209ExtractNumber {

	public static String extractNum(String s) {

		String str = "";
		for (int i = 0; i < s.length(); i++) {

			if (Character.isDigit(s.charAt(i))) {
				str += s.charAt(i);
			}

		}
		return str;

	}

	public static void main(String[] args) {

		System.out.println(extractNum("aaa2aa3")); // output23
	}
}
