package lab_2;

import java.util.Scanner;

public class Q_5Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the charge for the meal:");
		double charge = sc.nextInt();
		double taxAmount=charge * 0.0675;
		double tip=(taxAmount+charge)*0.2;
		double totalBill=charge+taxAmount+tip;
        System.out.println("Meal charge is " + charge + "$, tax amount is "
				+ taxAmount + "$, tip amount is "
				+ tip + "$ and total bill is " + totalBill + "$");
		
	}

}
