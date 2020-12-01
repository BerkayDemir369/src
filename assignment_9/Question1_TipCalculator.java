package assignment_9;

import java.util.Scanner;

public class Question1_TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create a method called tipCalculator which accepts parameters: 
		  boolean isSplit, int numberPeople, double checkAmount, String serviceQuality

          Ask the user to enter each value. 

         User should select service quality that will correspond to tip percent.

           Poor = 5%
           Fair = 10%
           Good = 15%
           Great = 20%
           Excellent = 25%

           The program should display the following information based on the user input:
           Split or No split
           Number of people entered: &&&&
           Service Quality:
           Total to pay:
           Total tip:
           Total per person:
           Tip per person:

           Input:
           Split:Yes
           Number of people:4
           Check amount:476.0
           Service Quality:Excellent*/
		
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter each value:");
		tipCalculator(scan.nextBoolean(),scan.next(),scan.nextInt(),scan.nextDouble());
		
		
		
		
	}

	public static void tipCalculator(boolean isSplit ,String serviceQuality,int numberPeople ,double checkAmount ) {
		
				
		double totalTip=0;
		double totalPay=0;
    	double totalPerPerson=0;
	    double tipPerPerson=0;
				
				
				
		switch(serviceQuality) {
					
				
		case "Poor" :
					totalTip= ((checkAmount/100)*5);
					totalPay=(totalTip+checkAmount);
					totalPerPerson=(totalPay/numberPeople);
					tipPerPerson=(totalTip/numberPeople);
					
		break;
	   case "Fair":
			totalTip= ((checkAmount/100)*10);
			totalPay=(totalTip+checkAmount);
			totalPerPerson=(totalPay/numberPeople);
			tipPerPerson=(totalTip/numberPeople);
					
			break;
		case"Good":
			totalTip=((checkAmount/100)*15);
			totalPay=(totalTip+checkAmount);
			totalPerPerson=(totalPay/numberPeople);
			tipPerPerson=(totalTip/numberPeople);
					
		break;
			case"Great":
			totalTip=((checkAmount/100)*20);
			totalPay=(totalTip+checkAmount);
			totalPerPerson=(totalPay/numberPeople);
			tipPerPerson=(totalTip/numberPeople);
		break;
					
		case"Excellent":
			totalTip=((checkAmount/100)*25);
			totalPay=(totalTip+checkAmount);
			totalPerPerson=(totalPay/numberPeople);
			tipPerPerson=(totalTip/numberPeople);
					
					
		break;
				}
		String peoplesign = "&";
		for (int i = 1; i < numberPeople; i++) {
			peoplesign += "&";
		}
        System.out.println("Split: " + isSplit);
		System.out.println("Number of people entered: " + peoplesign);
		System.out.println("Total to pay: " + totalPay);
		System.out.println("Total tip: " + totalTip ) ;
		System.out.println("Total per person: " + totalPerPerson);
	    System.out.println("Tip per person: " + tipPerPerson );
		
	
	}
	}
