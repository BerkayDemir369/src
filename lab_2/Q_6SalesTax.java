package lab_2;

import java.util.Scanner;

public class Q_6SalesTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount of a purchase:");
		double purchase = sc.nextInt();
		double stateSalesTax = purchase * 0.04;
		double countySalesTax = purchase * 0.02;
		double totalSalesTax = stateSalesTax + countySalesTax;
		double totalOfTheSale = purchase + totalSalesTax;
		System.out.println(
				"The amount of the purchase is " + purchase + ",\n" + " the state sales tax is " + stateSalesTax + ",\n"
						+ " the county sales tax is " + countySalesTax + ",\n" + " the total sales tax is "
						+ totalSalesTax + "\n" + " and the total of the sale is " + totalOfTheSale);
	}

}
