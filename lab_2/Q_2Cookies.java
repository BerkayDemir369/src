package lab_2;

import java.util.Scanner;

public class Q_2Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
	
		System.out.println("Enter the number of cookies");
		int cookies=scan.nextInt();
		int cookiesCalori=300/4;
		int totalCalori=cookies*cookiesCalori;
		System.out.println("Total calori: " + totalCalori);
		
		
	}

}
