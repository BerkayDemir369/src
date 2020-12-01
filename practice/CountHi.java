package practice;

import java.util.Scanner;

public class CountHi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    
		    int counter=0;
		    for(int x=0 ; x<= str.length()-2 ;x++) {
		    	if(str.substring(x,x+2).equalsIgnoreCase("hi")) {
		    		counter++;
		    	}
		    }
		    System.out.println(counter);
	}

}
