package repl_It60;

import java.util.Scanner;

public class Q_116MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Enter a number between 1-12
               10
         10 X 1 = 10
         10 X 2 = 20
         10 X 3 = 30
         10 X 4 = 40
         10 X 5 = 50
         10 X 6 = 60
         10 X 7 = 70
         10 X 8 = 80
         10 X 9 = 90
         10 X 10 = 100*/
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Enter a number between 1-12");
		    
		  int num =scan.nextInt(); //TODO CALL SCANNER METHOD HERE
		if(num>=1 && num<=12) {
		int num1;
		for(num1=1 ; num1<=10 ; num1++ ) {
			System.out.println(num + " X " +  num1 + " = " + (num * num1) );
		}
		}
	}

}
