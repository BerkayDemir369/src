package assignment40_50;

import java.util.*;

public class TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WRITE YOUR CODE HERE
		   
     	Scanner scan=new Scanner(System.in);
		System.out.println("Split:");
		String split=scan.next();
		System.out.println("Number of people:");
		int numberOfPeople=scan.nextInt();
		System.out.println("Check amount:");
		double amount=scan.nextDouble();
			
		System.out.println("Service Quality:");
		String serviceQuality=scan.next();
				
		double totalTip=0;
		double totalPay=0;
    	double totalPerPerson=0;
	    double tipPerPerson=0;
				
				
				
		switch(serviceQuality) {
					
				
		case "Poor" :
					totalTip= ((amount/100)*5);
					totalPay=(totalTip+amount);
					totalPerPerson=(totalPay/numberOfPeople);
					tipPerPerson=(totalTip/numberOfPeople);
					
		break;
	   case "Fair":
			totalTip= ((amount/100)*10);
			totalPay=(totalTip+amount);
			totalPerPerson=(totalPay/numberOfPeople);
			tipPerPerson=(totalTip/numberOfPeople);
					
			break;
		case"Good":
			totalTip=((amount/100)*15);
			totalPay=(totalTip+amount);
			totalPerPerson=(totalPay/numberOfPeople);
			tipPerPerson=(totalTip/numberOfPeople);
					
		break;
			case"Great":
			totalTip=((amount/100)*20);
			totalPay=(totalTip+amount);
			totalPerPerson=(totalPay/numberOfPeople);
			tipPerPerson=(totalTip/numberOfPeople);
		break;
					
		case"Excellent":
			totalTip=((amount/100)*25);
			totalPay=(totalTip+amount);
			totalPerPerson=(totalPay/numberOfPeople);
			tipPerPerson=(totalTip/numberOfPeople);
					
					
		break;
				}
		switch(numberOfPeople) {
		case 1:
			System.out.println("Number of people entered: &");
		break;
		case 2:
			System.out.println("Number of people entered: &&");
		break;
		case 3:
			System.out.println("Number of people entered: &&&");
		break;
		case 4:
		   System.out.println("Number of people entered: &&&&");
		break;
		case 5:
		System.out.println("Number of people entered: &&&&&");
		break;
				
			}
		System.out.println("Total to pay: " + totalPay);
		System.out.println("Total tip: " + totalTip ) ;
		System.out.println("Total per person: " + totalPerPerson);
	    System.out.println("Tip per person: " + tipPerPerson );
	
		
		
			
		
				
		
	}

}
