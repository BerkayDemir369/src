package practice;

import java.util.Scanner;

public class Task87_Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] days = new String[7];
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		days[3]="Thursday";
		days[4]="Friday";
		days[5]="Saturday";
		days[6]="Sunday";
		
		Scanner scan= new Scanner(System.in);
		int index=scan.nextInt();
		
		
		System.out.println("Today is Monday: " + days[index-1] );
		
		
	}

}
