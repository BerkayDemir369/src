package repl_it2;

import java.util.Scanner;

import assignment40_50.VechileRecall45;

public class Q_78CarInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //DO NOT CHANGE
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
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to the CountyFarm car insurance!");
	    //WRITE YOUR CODE HERE
			System.out.println("Enter your name");
			name=scan.next();
			System.out.println("Do you have a US driver license?");
			String license=scan.next();
			
			if(license.equals("Yes")|| license.equals("yes")) {
				System.out.println("Enter your zip code");
				int zipCode=scan.nextInt();
				if(zipCode==20910 || zipCode==20740) {
					premium=premium+60;
					
				}else if(zipCode==22102 || zipCode==22103) {
					premium=premium+30;
				}else {
					premium=premium+50;
				}
				System.out.println("s this vehicle Owned, Financed, or Leased?");
				vehicleOwnership=scan.next();
				
				
				if(vehicleOwnership.equals("owned")) {
					premium=premium+10;
				}else {
					premium=premium+20;
				}
				
				System.out.println("How is this vehicle primarily used?");
				vehicleUsage=scan.next();
				
				if(vehicleUsage.equals("Business")) {
					premium=premium+50;
				}else if(vehicleUsage.equals("Pleasure")) {
					premium=premium+10;
				}else if(vehicleUsage.equals("Commute")) {
					premium=premium+20;
				}
				System.out.println("Days Driven To Work And/Or School");
				daysDrivenToWorkOrSchool=scan.nextInt();
				premium=premium + (daysDrivenToWorkOrSchool*5);
				
				System.out.println("Miles Driven To Work And/Or School");
				milesToWorkOrSchool=scan.nextInt();
				premium=premium + (milesToWorkOrSchool*1);
				
				System.out.println("How old are you?");
				int age=scan.nextInt();
				if(age<16) {
					System.out.println("Invalid data!");
				}else if(age>=16 && age<18) {
					premium=premium*20;
					
				}else if(age>=18 && age<=21) {
					premium=premium*6;
				}else if(age>21 && age<25) {
					premium=premium*2;
					
				}
				System.out.println("How many years you've been driving?");
				int experience=scan.nextInt();
				if(experience>0 && age>=16) {
					premium=premium + (experience*5);
				}else {
					System.out.println("Invalid data");
					System.exit(0);
				}
				System.out.println("Have you had any accidents in the last " + experience + " years?");
				String answer=scan.next();
				if(answer.equals("yes") || answer.equals("Yes")) {
					System.out.println("How many?");
					accidentsAmount=scan.nextInt();
					premium=premium + ((accidentsAmount/100)*20);
				}
				System.out.println("Have you had continuous insurance for the past 12 months?");
				continuousInsurance=scan.next();
				if(continuousInsurance.equals("No") || continuousInsurance.equals("no")){
					
					premium=premium*2;
					
					
					
				}else if(continuousInsurance.equals("yes") || continuousInsurance.equals("Yes")){
					System.out.println("What is the highest level of education you have completed?");
					education=scan.next();
					if(education.equals("PhD") || education.equals("Bachelors") || education.equals("Masters")) {
						premium=premium-((premium/100)*5);
					}else {
						premium=premium + ((premium/100)*5);
					}
				}
				System.out.println("customer, here's your quote!");
				referenceNumber=name.substring(0,2) + age + name.substring(name.length()-2,name.length()-1)
				+ zipCode + education.toUpperCase();
				System.out.println(name + "here's your quote!");
				System.out.println("Start Your Policy Today For: $" + premium);
				System.out.println("Reference number: " + referenceNumber);
			}else {
				System.out.println("Invalid data!");
				System.exit(0);
			}
			
	}

}
