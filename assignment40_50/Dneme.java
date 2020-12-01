package assignment40_50;

import java.util.*;

public class Dneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        char c='&';
		
		
		if(serviceQuality.equals("Poor")){
				 totalTip= (amount/100*5);
				 totalPay=totalTip+amount;
				 totalPerPerson=(totalPay/numberOfPeople);
				 tipPerPerson=totalTip/numberOfPeople;
		}else if(serviceQuality.equals("Fair")){
				totalTip= (amount/100*5);
				totalPay=totalTip+amount;
				totalPerPerson=(totalPay/numberOfPeople);
				 tipPerPerson=totalTip/numberOfPeople;
		}else if (serviceQuality.equals("Good")){
			totalTip=(amount/100*15);
			totalPay=totalTip+amount;
			totalPerPerson=(totalPay/numberOfPeople);
			 tipPerPerson=totalTip/numberOfPeople;
		}else if(serviceQuality.equals("Great")) {
			 totalTip=(amount/100*20);
			 totalPay=totalTip+amount;
			 totalPerPerson=(totalPay/numberOfPeople);
			 tipPerPerson=totalTip/numberOfPeople;
	   }else if(serviceQuality.equals("Excellent")){
				totalTip=(amount/100*25);
				totalPay=totalTip+amount;
				totalPerPerson=(totalPay/numberOfPeople);
				 tipPerPerson=totalTip/numberOfPeople;				 		 
	   }	
		
		
		
		System.out.println("Number of people entered: " +numberOfPeople);
		System.out.println("Total to pay:" + totalPay);
		System.out.println("Total tip:" + totalTip ) ;
		System.out.println("Total per person:" + totalPerPerson);
        System.out.println("Tip per person:" + tipPerPerson );
	}

}
