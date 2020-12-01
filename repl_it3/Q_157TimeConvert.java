package repl_it3;

import java.util.Scanner;

public class Q_157TimeConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
		 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour
		 * clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour
		 * clock. Function Description It should print a new string representing the
		 * input time in 24 hour format. timeConversion has the following parameter(s):
		 */
		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());
	}

	public static void timeConversion(String s) {
		
		 // Write your code here.
		

		if (s.equals("12:00:00AM")) {

			System.out.println("00:00:00");

		} else if (s.equals("12:00:00PM")) {

			System.out.println("12:00:00");

		} else if (s.endsWith("AM")) {

			// 07:05:45PM
			// 19:05:45
			int hour = Integer.parseInt(s.substring(0, 2));
			s = s.replace("AM", "");
			if (hour == 12) {
				// 12:15:00-->> :12:00 -->> 00 + :12:00
				s = "00" + s.substring(2);
			}

			System.out.println(s);

		} else if (s.endsWith("PM")) {
			int hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
			hour += 12;
			String newTime = hour + s.substring(s.indexOf(":")).replace("PM", "");
			System.out.println(newTime);
		}

	}
}
