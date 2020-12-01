package day25_Array_Cont;

import java.util.Scanner;

public class RainfallArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] rainFall = new double[12];

		getValues(rainFall);
		average(rainFall);
		max(rainFall);
		min(rainFall);

	}

	public static void getValues(double[] arrPrintInfo) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the following rainfall for the months ahead:");
		System.out.println("Month rainfall (In inches)");
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"Octember", "November", "December" };

		for (int i = 0; i < months.length; i++) {
			System.out.print(months[i] + " :");
			arrPrintInfo[i] = scan.nextDouble();
		}

	}

	public static double total(double[] arrTotal) {
		// TODO Auto-generated method stub
		double totalSum = 0;
		for (int i = 0; i < arrTotal.length; i++) {
			totalSum += arrTotal[i];

		}
		return totalSum;

	}

	public static void average(double[] arrAverage) {

		double average = total(arrAverage) / 12;
		System.out.println("The sum of all the rain is: " + total(arrAverage) + "inches");

		System.out.println("The average rainfall was: " + average + " inches");
	}

	public static void max(double[] maxRainfall) {
		double max = maxRainfall[0];
		for (int i = 0; i < maxRainfall.length; i++) {
			if (maxRainfall[i] > max) {
				max = maxRainfall[i];

			}

		}
		System.out.println("The max rain is: " + max + " inches");
	}

	public static void min(double[] minRainfall) {
		double min = minRainfall[0];
		for (int i = 0; i < minRainfall.length; i++) {
			if (min > minRainfall[i]) {
				min = minRainfall[i];

			}

		}
		System.out.println("The min rain is: " + min + " inches");
	}

}
