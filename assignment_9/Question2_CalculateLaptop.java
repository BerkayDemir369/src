package assignment_9;

import java.util.Scanner;



public class Question2_CalculateLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		 double LaptopPrice=0;
	   System.out.println("Select screen size: ");
	    double screenSize=scan.nextDouble();
	    System.out.println("Select CPU type: ");
	    String CPU=scan.next();
	    System.out.println("Select RAM size: ");
	    int GB=scan.nextInt();
	    System.out.println("Select storage type: ");
	    String storageType=scan.next();
	    System.out.println(" Enter memory size:");
	    int gb=scan.nextInt();
	    System.out.println(" Enter screen resolution: ");
	    String resolution=scan.next();
	    
	    if(screenSize==13.3) {
	    	LaptopPrice=LaptopPrice+200;
	    }else if(screenSize==15.0) {
	    	LaptopPrice=LaptopPrice+300;
	    }else if(screenSize==17.3) {
	    	LaptopPrice=LaptopPrice+400;
	    }
	     if(CPU.equals("i3") ) {
	    	LaptopPrice=LaptopPrice+150;
	    }else if(CPU.equals("i5")){
	    	LaptopPrice=LaptopPrice+250;
	    }else if(CPU.equals("i7")) {
	    	LaptopPrice=LaptopPrice+350;
	    }
	     if(GB>=4) {
	    	LaptopPrice=LaptopPrice +((GB/4)*50);
	    	 
	     }if(storageType.equals("HDD")) {
	    	 if(gb>=500) {
	    		 LaptopPrice=LaptopPrice+((gb/500)*50);
	    	 }
	    	
	     }else if(storageType.equals("SSD")) {
	    	 LaptopPrice=LaptopPrice+((gb/500)*100);
	     }
	     if(resolution.equals("4K" )) {
	    	 LaptopPrice=LaptopPrice+200;
	     }else if(resolution.equals("FULLHD")) {
	    	 LaptopPrice=LaptopPrice+100;
	     }
	     System.out.println("Laptop price is: $"+LaptopPrice);
	    }
	
}
