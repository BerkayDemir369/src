package practice;

import java.util.Random;
import java.util.Scanner;

public class CarPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cars = new String[6];
		int price=0;
		
		Random rn= new Random();
		cars[0]="Honda";
		cars[1]="Toyota";
		cars[2]="Nissan";
		cars[3]="Bmw";
		cars[4]="Mercedes";
		cars[5]="Porsche";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your index number: ");
		int index=scan.nextInt();
		String selectedCar=cars[index];
		switch(selectedCar) {
		case "Honda": case "Toyota": case "Nissan":
			price = rn.nextInt((40000-20000)+1)+20000;
			break;
		case "Bmw": case "Mercedes": 
			price =rn.nextInt((80000-50000)+1)+50000;
			break;
		case "Porsche": case "Ferrari": 
			price =rn.nextInt((150000-100000)+1)+100000;
			break;
		}
		System.out.println("The selected car price: " + price);
		
	}

}
