package assignment_9;

import java.util.Scanner;

public class Question14_CarInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		System.out.println("Welcome to the CountyFarm car insurance!");
		System.out.println("Enter your name");
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();
		referenceNumber = "";
		System.out.println("Do you have a US driver license?");
		String isLicense = scan.next();
		if (!isLicense.equalsIgnoreCase("Yes")) {
			System.out.println("Invalid data!");
			return;
		}
		System.out.println("Enter your zip code");
		int zip = scan.nextInt();
		if (zip == 20910 || zip == 20740) {
			premium = premium + 60;
		} else if (zip == 22102 || zip == 22103) {
			premium = premium + 30;
		} else {
			premium = premium + 50;
		}

		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership = scan.next();
		switch (vehicleOwnership) {
		case "Owned":
			premium = premium + 10;
			break;
		default:
			premium = premium + 20;
			break;
		}
		System.out.println("How is this vehicle primarily used?");
		vehicleUsage = scan.next();
		if (vehicleUsage.equalsIgnoreCase("Business")) {
			premium = premium + 50;
		} else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
			premium = premium + 10;
		} else if (vehicleUsage.equalsIgnoreCase("Commute")) {
			premium = premium + 20;
			System.out.println("Days Driven To Work And/Or School");
			daysDrivenToWorkOrSchool = scan.nextInt();
			premium = premium + (daysDrivenToWorkOrSchool * 5);
			System.out.println("Miles Driven To Work And/Or School");
			milesToWorkOrSchool = scan.nextInt();
			premium = premium + (milesToWorkOrSchool * 1);
		}
		System.out.println("How old are you?");
		int age = scan.nextInt();
		if (age < 16) {
			System.out.println("Invalid data!");
			return;
		} else if (age > 16 && age < 18) {
			premium = premium * 20;
		} else if (18 <= age && age <= 21) {
			premium = premium * 6;
		} else if (21 < age && age < 25) {
			premium = premium * 2;
		}
		System.out.println("How many years you've been driving?");
		int experience = scan.nextInt();
		if (experience > 0 && (age - experience) >= 16) {
			premium = premium - (experience * 5);
		} else {
			System.out.println("Invalid data!");
			return;
		}

		System.out.println("Have you had any accidents in the last 5 years?");
		String isAccident = scan.next();
		if (isAccident.equalsIgnoreCase("yes")) {
			System.out.println("How many?");
			accidentsAmount = scan.nextInt();
			premium = premium + ((premium * 0.20) * accidentsAmount);
		}
		System.out.println("Have you had continuous insurance for the past 12 months?");
		continuousInsurance = scan.next();
		if (continuousInsurance.equalsIgnoreCase("No"))
			premium = premium * 2;

		System.out.println("What is the highest level of education you have completed?");
		String education2 = scan.next();
		if (education2.equals("PhD") || education2.equals("Bachelors") || education2.equals("Masters")) {
			premium = premium - (premium * 0.05);
		} else if (education2.equals("Doctors")) {
			premium = premium - (premium * 0.1);
		} else {
			premium = premium + (premium * 0.05);
		}
		System.out.println(name + ", here's your quote!");
		System.out.println("Start Your Policy Today For: $" + premium);
		referenceNumber = referenceNumber + name.substring(0, 2).toUpperCase() + referenceNumber + age
				+ name.substring(name.length() - 2).toUpperCase() + zip;

		System.out.print("Reference number: " + referenceNumber);
		if (education2.equals("PhD")) {
			System.out.println("PHD");
		} else if (education2.equals("Bachelors")) {
			System.out.println("BACHELORS");
		} else if (education2.equals("Masters")) {
			System.out.println("MASTERS");
		} else if (education2.equals("Doctors")) {
			System.out.println("DOCTORS");
		} else {
			System.out.println("LESSTHANHIGHSCHOOL");
		}
	}

}
